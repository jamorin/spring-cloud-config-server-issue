package com.example.democlient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class DemoclientApplication implements CommandLineRunner {

	private final Logger logger = LoggerFactory.getLogger(DemoclientApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoclientApplication.class, args);
	}

	@Autowired
	private ConfigurableEnvironment environment;

	@Override
	public void run(String... args) throws Exception {
		logger.info("prop.cipher: {}", environment.getProperty("prop.cipher"));
		// prop.plain is not overwritten with local plainttext prop.plain property
		logger.info("prop.plain: {}", environment.getProperty("prop.plain"));
	}
}
