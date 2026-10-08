package com.example.telemetry_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TelemetryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TelemetryServerApplication.class, args);
		System.out.println("Telemetry");
	}

}
