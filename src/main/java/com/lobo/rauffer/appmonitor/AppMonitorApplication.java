package com.lobo.rauffer.appmonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import de.codecentric.boot.admin.config.EnableAdminServer;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class AppMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppMonitorApplication.class, args);
	}
}
