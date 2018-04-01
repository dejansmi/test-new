
package com.dejans.TestNew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TestNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestNewApplication.class, args);
	}
}
