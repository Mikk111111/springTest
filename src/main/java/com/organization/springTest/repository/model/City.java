package com.organization.springTest.repository.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "city")
@Getter @Setter @NoArgsConstructor @ToString
public class City {
    @Id
    @Column(name="id")
    private Integer cityId;
    @Column(name="name")
    private  String cityName;
    @Column(name="countrycode")
    private  String cityCountryCode;
    @Column(name="district")
    private  String cityDistrict;
    @Column(name="population")
    private  Integer cityPopulation;
}
