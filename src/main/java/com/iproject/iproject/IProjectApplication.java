package com.iproject.iproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.iproject.iproject.model.IslamEvent;
import com.iproject.iproject.repository.IslamEventRepository;

@SpringBootApplication
public class IProjectApplication implements CommandLineRunner{
	
	@Autowired
	private IslamEventRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(IProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		// save a couple of Islam event
		repository.save(new IslamEvent("Cours d'arabe", "Cours d'arabe pour enfants", "12 rue du bonheur"));
		repository.save(new IslamEvent("Cours de tajwid", "Cours de tajwid", "12 rue du bonheur"));

		// fetch all Islam event
		System.out.println("Islam event found with findAll():");
		System.out.println("-------------------------------");
		for (IslamEvent iEvent : repository.findAll()) {
			System.out.println(iEvent);
		}
		System.out.println();

		// fetch an individual Islam event
		System.out.println("Islam event found with findByName('Cours d'arabe'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByName("Cours d'arabe"));


	}
}
