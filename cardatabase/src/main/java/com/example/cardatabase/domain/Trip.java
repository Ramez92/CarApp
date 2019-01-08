package com.example.cardatabase.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Trip {
      @Id
      @GeneratedValue(strategy=GenerationType.AUTO)
      private long tripID;
      private String TripLocation;
      
      @ManyToMany(cascade = CascadeType.MERGE)
      @JoinTable
      (name = "trips", joinColumns = {
              @JoinColumn(name = "tripID") }, inverseJoinColumns = { @JoinColumn(name = "id") })
      private Set<Car> cars = new HashSet<Car>(0);

      public Set<Car> getCars() {
        return cars;
      }

      public void setCars(Set<Car> cars) {
        this.cars = cars;
      }
    
    public Trip() {
        super();
    }
    
    public Trip(String tripLocation) {
        super();
        TripLocation = tripLocation;
    }

    public String getTripLocation() {
        return TripLocation;
    }

    public void setTripLocation(String tripLocation) {
        TripLocation = tripLocation;
    }
    
    
    
}