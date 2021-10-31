package com.dev.carsystem.app.models.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "cars", schema = "db_cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer price;

    private String image;

    private String detail;
}
