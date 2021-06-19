package com.reactive.reactivestudy;

import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;

@SpringBootApplication
public class ReactiveStudyApplication {

  public static void main(String[] args) {
    SpringApplication.run(ReactiveStudyApplication.class, args);
  }
}
