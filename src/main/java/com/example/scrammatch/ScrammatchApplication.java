package com.example.scrammatch;

import com.example.scrammatch.service.ConsumoAPI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScrammatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScrammatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoAPI = new ConsumoAPI();

		var json = consumoAPI.obterDados("https://www.omdbapi.com/?t=gilmore+girls&Season=1&apikey=51d51443");
		System.out.println(json);
	}
}
