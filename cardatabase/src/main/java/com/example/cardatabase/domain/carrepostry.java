package com.example.cardatabase.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;

public interface carrepostry extends CrudRepository<Car,Long>{
	  // Fetch cars by brand
	  List<Car> findByBrand(String brand);

	  // Fetch cars by color
	  List<Car> findByColor(String color);

	  // Fetch cars by year
	  List<Car> findByYear(int year);

	  
		List<Car> findAll();
		List<Car> findByBrandAndModel(String brand, String model);
		List<Car> findByBrandOrColor(String brand, String color);
		List<Car> findByBrandOrderByYearAsc(String brand);
		//@Query("select o.firstname from Car as c, Owner as o, car_owner  co where  c.id=co.id and o.ownerid=co.ownerid ")
		//List<Car> findCarOwner();
	 
}
