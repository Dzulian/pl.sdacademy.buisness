public class Country {
    private final int retireAge;
    private final String countryName;

    public Country(int retireAge, String countryName) {
        this.retireAge = retireAge;
        this.countryName = countryName;
    }

    public int getRetireAge() {
        return retireAge;
    }

    public String getCountryName() {
        return countryName;
    }

    @Override
    public String toString() {
        return  countryName;
    }
}