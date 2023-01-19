package com.organization.springTest.repository;

import com.organization.springTest.repository.model.City;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CityRepository extends CrudRepository<City, Integer> {
    Optional<City> findByCityId(Integer id);

    //    Optional<City> findByCityName(String name);
//    Optional<City> findByCityCountryCode(String countryCode);
//    Optional<City> findByCityDistrict(String district);
//    Iterable<City> findByCityNameLike(String cityName);

    @Query(
            value = "SELECT * FROM world.city WHERE world.city.name LIKE :name ORDER BY world.city.name asc",
            nativeQuery = true
    )
    List<City> getCityNameLike(@Param("name") String cityName);

    @Query(
            value = "SELECT * FROM world.city WHERE world.city.countrycode LIKE :countrycode"+
                    " ORDER BY world.city.countrycode asc",
            nativeQuery = true
    )
    List<City> getCityCountryCodeLike(@Param("countrycode") String countryCode);

    @Query(
            value = "SELECT * FROM world.city WHERE world.city.district LIKE :district"+
                    " ORDER BY world.city.district asc",
            nativeQuery = true
    )
    List<City> getCityDistrictLike(@Param("district") String district);
}
