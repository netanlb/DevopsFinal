package com.example.devopsfinal;

import com.example.devopsfinal.models.LogEntry;
import com.example.devopsfinal.repositories.LogEntryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import com.example.devopsfinal.models.LogEntry;

@SpringBootApplication
public class DevopsFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsFinalApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(LogEntryRepository repository) {
		return (args) -> {
			// Save a new log entry at application startup
			repository.save(new LogEntry("/seed", new Date()));
		};
	}
}
