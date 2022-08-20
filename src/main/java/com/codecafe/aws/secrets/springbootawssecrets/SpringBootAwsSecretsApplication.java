package com.codecafe.aws.secrets.springbootawssecrets;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAwsSecretsApplication implements CommandLineRunner {

  @Value("${dbUser}")
  private String dbUser;

  @Value("${dbPassword}")
  private String dbPassword;

  @Value("${clientId}")
  private String clientId;

  @Value("${clientSecret}")
  private String clientSecret;

  public static void main(String[] args) {
    SpringApplication.run(SpringBootAwsSecretsApplication.class, args);
  }

  @Override
  public void run(String... args) {
    System.out.println("dbUser : " + dbUser);
    System.out.println("dbPassword : " + dbPassword);
    System.out.println("clientId : " + clientId);
    System.out.println("clientSecret : " + clientSecret);
  }

}
