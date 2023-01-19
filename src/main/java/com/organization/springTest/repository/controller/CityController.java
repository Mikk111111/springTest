package com.organization.springTest.repository.controller;

import com.organization.springTest.repository.CityRepository;
import com.organization.springTest.repository.model.City;
import com.organization.springTest.repository.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/city")
public class CityController {
    @Autowired
    private CityService cityService;

    @GetMapping(path = "/all")
    public @ResponseBody List<City> getAllCity() {
        return cityService.getAllCities();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody City getCityId(@PathVariable Integer id) {
        return cityService.getCityById(id);
    }

    @GetMapping(path = "/name/{name}")
    public @ResponseBody List<City> getQueryByNameLike(@PathVariable String name) {
        return cityService.getQueryCityNameLike("%" + name + "%");
    }

    @GetMapping(path = "/countrycode/{countrycode}")
    public @ResponseBody List<City> getQueryByCountryCodeLike(@PathVariable String countrycode) {
        return cityService.getQueryCityCountryCodeLike("%" + countrycode + "%");
    }

    @GetMapping(path = "/district/{district}")
    public @ResponseBody List<City> getQueryByDistrictLike(@PathVariable String district) {
        return cityService.getQueryCityDistrictLike("%" + district + "%");
    }
}
