package com.rackspacecloud.metrics.kafkainfluxdbconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaInfluxdbConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaInfluxdbConsumerApplication.class, args);
	}
}