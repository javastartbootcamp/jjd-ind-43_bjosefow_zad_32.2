package pl.javastart.jpaoptimalization.countrylanguage;

import javax.persistence.OrderBy;

public class CountryLanguageInfo {

    @OrderBy
    private String language;
    private String countryName;

    private double percentage;

    public CountryLanguageInfo(String language, String countryName, double percentage) {
        this.language = language;
        this.countryName = countryName;
        this.percentage = percentage;
    }

    public String getLanguage() {
        return language;
    }

    public String getCountryName() {
        return countryName;
    }

    public double getPercentage() {
        return percentage;
    }

    @Override
    public String toString() {
        return countryName + " " + percentage + "%";
    }
}
