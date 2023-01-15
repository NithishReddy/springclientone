package com.example.cloudclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.context.environment.EnvironmentChangeEvent;
import org.springframework.context.event.EventListener;


@SpringBootApplication
@RefreshScope
public class CloudclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudclientApplication.class, args);
	}

	@EventListener({EnvironmentChangeEvent.class})
	public void onRefresh() {
		System.out.println("environment Changed..");
	}

}
