package com.zipcode.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="CITIES_TBL")
public class City {
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @Column(name="CITY")
    private String city;

    @Column(name="POSTALCODE")
    private String postalCode;

}
