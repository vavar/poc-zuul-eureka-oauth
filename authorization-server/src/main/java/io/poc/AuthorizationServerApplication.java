package io.poc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication(exclude = LiquibaseAutoConfiguration.class)
public class AuthorizationServerApplication {
  private static final Logger LOG = LoggerFactory.getLogger(AuthorizationServerApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(AuthorizationServerApplication.class, args);
  }

}