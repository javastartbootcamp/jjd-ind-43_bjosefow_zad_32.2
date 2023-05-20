package pl.javastart.jpaoptimalization.country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, String> {

    @Query("SELECT distinct c from Country c " +
            "LEFT JOIN FETCH c.languages lan " +
            "order by c.name, lan.percentage desc")
    List<Country> findAllCountryLan();

    @Query("SELECT distinct c from Country c " +
            "LEFT JOIN FETCH c.cities " +
            "order by c.name")
    List<Country> findAllCountryCity();
}

