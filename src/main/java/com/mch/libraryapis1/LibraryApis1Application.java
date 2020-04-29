package com.mch.libraryapis1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import publisher.PublisherService;

@SpringBootApplication
public class LibraryApis1Application {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApis1Application.class, args);
	}



}