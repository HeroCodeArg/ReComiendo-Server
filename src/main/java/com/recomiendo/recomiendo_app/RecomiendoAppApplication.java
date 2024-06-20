package com.recomiendo.recomiendo_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase; */

@SpringBootApplication
public class RecomiendoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecomiendoAppApplication.class, args);
		/* MongoClient mongoClient = MongoClients.create();
        MongoDatabase db = mongoClient.getDatabase("reComiendoDB");
		System.out.println("DB users: "+db.getCollection("users")); */
	}

}
