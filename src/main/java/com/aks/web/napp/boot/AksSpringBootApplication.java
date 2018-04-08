package com.aks.web.napp.boot;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.aks.web.napp.configuration.RepositoryConfig;

@Configuration
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.aks.web.napp.*")
public class AksSpringBootApplication {


	public static void main(String[] args) {
		SpringApplication.run(AksSpringBootApplication.class, args);
	}

	/*@Bean
	public DataSource getDataSource() {
		return new RepositoryConfig().getDataSource();
	}*/
}
