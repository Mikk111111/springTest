package com.organization.springTest.repository.templateController;

import com.organization.springTest.repository.CityRepository;
import com.organization.springTest.repository.model.City;
import com.organization.springTest.repository.service.CityService;
import lombok.Builder;
import lombok.Builder.Default;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/cTemplate")
public class CityTemplateController {
    @Autowired
    private CityService cityService;

    @GetMapping(path = "/City/{name}")
    public String getPageName(Model model, @PathVariable String name){
        List<City> citiesList = cityService.getQueryCityNameLike("%"+name+"%");
        model.addAttribute("key_city_list",citiesList);
        return "/main/firstPage_city_list";
    }
    @GetMapping(path = "/CountryCode/{countryCode}")
    public String getPageCountryCode(Model model, @PathVariable String countryCode){
        List<City> citiesList = cityService.getQueryCityCountryCodeLike("%"+countryCode+"%");
        model.addAttribute("key_city_list",citiesList);
        return "/main/firstPage_city_list";
    }
    @GetMapping(path = "/District/{district}")
    public String getPageDistrict(Model model, @PathVariable String district){
        List<City> citiesList = cityService.getQueryCityDistrictLike("%"+district+"%");
        model.addAttribute("key_city_District_list",citiesList);
        return "/main/firstPage_city_District_list";
    }

}
