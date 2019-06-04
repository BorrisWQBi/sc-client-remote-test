package com.borris.sc.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("com.borris.sc")
public class ScClientRemoteTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScClientRemoteTestApplication.class, args);
	}

}
