package com.organization.springTest.repository.bootstrap;

import com.organization.springTest.repository.controller.CityController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    @Autowired
    private  CityController cityController;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Running...");
        System.out.println("//==============================================================================");
        System.out.println(cityController.getQueryByNameLike("kab"));
        System.out.println("//==============================================================================");
        System.out.println(cityController.getQueryByCountryCodeLike("AFG"));
        System.out.println("//==============================================================================");
        System.out.println(cityController.getQueryByDistrictLike("vol"));
    }
}
