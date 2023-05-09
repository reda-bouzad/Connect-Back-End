package fst.maroc.connectbackend;

import fst.maroc.connectbackend.webService.rest.DeepFaceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;


@SpringBootApplication
public class ConnectBackEndApplication {

  @Autowired
  private DeepFaceApi api;

  public static void main(String[] args) throws JSONException {
    ConfigurableApplicationContext context = SpringApplication.run(ConnectBackEndApplication.class, args);
    DeepFaceApi api = context.getBean(DeepFaceApi.class);
    api.getDataAsJSON();
  }

}
