package com.gusstavodev.bookstore;

import com.gusstavodev.bookstore.mainapp.MainApp;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner {

	public static void main(String[] args) {


		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		MainApp mainApp = new MainApp();
		mainApp.muestraLibro();
	}
}
