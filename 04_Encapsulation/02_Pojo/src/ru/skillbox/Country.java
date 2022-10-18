package ru.skillbox;

public class Country {
    private String nameCountry;
    private int population;
    private int countryArea; //km^2
    private String capitalName;
    private boolean accessToTheSea;

    public Country(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getCountryArea() {
        return countryArea;
    }

    public void setCountryArea(int countryArea) {
        this.countryArea = countryArea;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public boolean isAccessToTheSea() {
        return accessToTheSea;
    }

    public void setAccessToTheSea(boolean accessToTheSea) {
        this.accessToTheSea = accessToTheSea;
    }

    @Override
    public String toString() {
        return "Country{" +
                "nameCountry='" + nameCountry + '\'' +
                ", population=" + population +
                ", countryArea=" + countryArea +
                ", capitalName='" + capitalName + '\'' +
                ", accessToTheSea=" + accessToTheSea +
                '}';
    }
}
