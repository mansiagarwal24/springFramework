package com.JPApart2.JPA2.InheritanceMapping;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;


@Entity
//@DiscriminatorValue("2-wheeler") //for single table strategy
@PrimaryKeyJoinColumn(name = "vehicleNo")//for joined strategy
public class TwoWheeler extends Vehicle{
    private int wheels;
    private int seats;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
