package com.example.Trains.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "stations")
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "station_name", nullable = false)
    private String name;
    
    @Column(nullable = false)
    private String city;
    
    @Column
    private String region;

    public Long getId() {return id;}
    public void setId(Long id) {}
    public String getName() {return name;}
    public void setName(String name) {}
    public String getCity() {return city;}
    public void setCity(String city) {}
    public String getRegion() {return region;}
    public void setRegion(String region) {}
}