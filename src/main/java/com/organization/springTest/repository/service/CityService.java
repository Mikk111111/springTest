package com.organization.springTest.repository.service;

import com.organization.springTest.repository.CityRepository;
import com.organization.springTest.repository.model.City;
import com.organization.springTest.repository.templateController.CityTemplateController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;
    public List<City> getAllCities(){
        return (List<City>) cityRepository.findAll();
    }
    public City getCityById(Integer id){
        return cityRepository.findByCityId(id).get();
    }
//    public City getCityByName(String name){
//        return cityRepository.findByCityName(name).get();
//    }
//    public City getCityByCountryCode(String countryCode){
//        return cityRepository.findByCityCountryCode(countryCode).get();
//    }
//    public City getCityByDistrict(String district){
//        return cityRepository.findByCityDistrict(district).get();
//    }
    public List<City> getQueryCityNameLike(String name){
        return (List<City>) cityRepository.getCityNameLike(name);
    }
    public List<City> getQueryCityCountryCodeLike(String countryCode){
        return (List<City>) cityRepository.getCityCountryCodeLike(countryCode);
    }
    public List<City> getQueryCityDistrictLike(String district){
        return (List<City>) cityRepository.getCityDistrictLike(district);
    }

}
