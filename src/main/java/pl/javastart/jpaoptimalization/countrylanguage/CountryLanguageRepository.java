package pl.javastart.jpaoptimalization.countrylanguage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.javastart.jpaoptimalization.country.Country;

import java.util.List;

public interface CountryLanguageRepository extends JpaRepository<CountryLanguage, CountryLanguageKey> {
    @Query("select new pl.javastart.jpaoptimalization.countrylanguage.CountryLanguageInfo(cl.language, c.name, cl.percentage)" +
            "  FROM CountryLanguage cl " +
            " JOIN Country c on c.code = cl.countryCode " +
            " order by cl.language asc, cl.percentage desc")
    List<CountryLanguageInfo> findAllCountryLanguage();
}
