package fst.maroc.connectbackend.webService.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import javax.sql.DataSource;

@Component
public class DeepFaceApi {
  private JdbcTemplate jdbcTemplate;

  @Autowired
  public DeepFaceApi(DataSource dataSource) {
    this.jdbcTemplate = new JdbcTemplate(dataSource);
  }

  public void getDataAsJSON() throws JSONException {
    String url = "http://localhost:5000/my-verify";
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.MULTIPART_FORM_DATA);
    // Set the request body as a MultiValueMap
    MultiValueMap<String, Object> requestBody = new LinkedMultiValueMap<>();
    requestBody.add("image_path", "/home/reda/deepface/img4.jpeg");
    requestBody.add("db_path", "/home/reda/Pictures/persons");
    // Create the request entity
    HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(requestBody, headers);

    // Make the HTTP POST request and get the response
    RestTemplate restTemplate = new RestTemplate();
    String response = restTemplate.postForObject(url, requestEntity, String.class);

    // Parse the JSON response
    JSONObject jsonResponse = new JSONObject(response);
    String date = jsonResponse.getString("date");
    String time = jsonResponse.getString("time");
    JSONArray persons = jsonResponse.getJSONArray("persons");

    // Insert data into the identified table
    String identifiedSql = "INSERT INTO identified (time, date) VALUES (?, ?)";
    jdbcTemplate.update(identifiedSql, time, date);
    long identifiedId = jdbcTemplate.queryForObject("SELECT LAST_INSERT_ID()", Long.class);

    // Insert data into the persons and identified_etudiant tables
    for (int i = 0; i < persons.length(); i++) {
      String personName = persons.getString(i);

      // Insert data into the persons table
      String personSql = "INSERT INTO persons (identified_id, person) VALUES (?, ?)";
      jdbcTemplate.update(personSql, identifiedId, personName);

      // Get the etudiant-id from the etudiant table based on folderName
      String etudiantIdSql = "SELECT id FROM etudiant WHERE folder_name = ?";
      Integer etudiantId = jdbcTemplate.queryForObject(etudiantIdSql, Integer.class, personName);

      // Insert data into the identified_etudiant table
      String identifiedEtudiantSql = "INSERT INTO detection (identified_id, etudiant_id) VALUES (?, ?)";
      jdbcTemplate.update(identifiedEtudiantSql, identifiedId, etudiantId);

    }
  }
}
