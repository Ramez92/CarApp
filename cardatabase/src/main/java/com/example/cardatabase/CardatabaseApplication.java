package com.example.cardatabase;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.cardatabase.domain.Owner;
import com.example.cardatabase.domain.Trip;
import com.example.cardatabase.domain.Triprepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.cardatabase.domain.Car;
import com.example.cardatabase.domain.carrepostry;
import com.example.cardatabase.domain.ownerrepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class CardatabaseApplication {
	  private static final Logger logger = LoggerFactory.getLogger(CardatabaseApplication.class);

	  @Autowired 
      private carrepostry repository;

	  
	  @Autowired
	  private ownerrepository ownerrepository;
	  
	  @Autowired
	    private Triprepository TRep;
	  
      public static void main(String[] args) {
        SpringApplication.run(CardatabaseApplication.class, args);
      }

      @Bean
      CommandLineRunner runner(){
        return args -> {
        	 // Add owner objects and save these to db
            TRep.save(new Trip("Trip 1"));
            TRep.save(new Trip("Trip 2"));
            TRep.save(new Trip("Trip 3"));
            Owner owner1 = new Owner("John" , "Johnson");
           Owner owner2 = new Owner("Mary" , "Robinson");
           ownerrepository.save(owner1);
           ownerrepository.save(owner2);
        repository.save(new Car("Mazda", "Lantes", "White", "23121", 2018, 90000,owner1));
        repository.save(new Car("Toyota", "sun", "Gray", "213191", 2009, 85000,owner2));
        repository.save(new Car("Kia", "Sportag", "White", "888888", 2016, 1060000,owner2));
        for(Car b:repository.findAll())
            logger.info(b.getModel());

        };
      } 
    }





