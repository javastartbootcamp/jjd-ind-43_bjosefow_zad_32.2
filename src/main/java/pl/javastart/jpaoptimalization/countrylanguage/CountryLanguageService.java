package pl.javastart.jpaoptimalization.countrylanguage;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CountryLanguageService {

    private final CountryLanguageRepository countryLanguageRepository;

    public CountryLanguageService(CountryLanguageRepository countryLanguageRepository) {
        this.countryLanguageRepository = countryLanguageRepository;
    }

    public List<CountryLanguageInfo> findAll() {
        return countryLanguageRepository.findAllCountryLanguage();
    }

    public Map<String, List<CountryLanguageInfo>> findAllMap() {
        return findAll().stream().collect(Collectors.groupingBy(CountryLanguageInfo::getLanguage));
    }

}
