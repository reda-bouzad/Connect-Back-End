package fst.maroc.connectbackend.configuration;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
  @Bean
  public DataSource getDataSource() {
    DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
    dataSourceBuilder.driverClassName("com.mysql.jdbc.Driver");
    dataSourceBuilder.url("jdbc:mysql://localhost:3306/ConnectDb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
    dataSourceBuilder.username("reda");
    dataSourceBuilder.password("lolandlol");
    return dataSourceBuilder.build();
  }
}
