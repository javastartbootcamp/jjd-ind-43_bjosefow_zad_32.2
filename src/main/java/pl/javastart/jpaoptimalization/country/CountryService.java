package pl.javastart.jpaoptimalization.country;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<Country> findAllCountryLang() {
        return countryRepository.findAllCountryLan();
    }

    public List<Country> findAllCountryCity() {
        return countryRepository.findAllCountryCity();
    }
}
