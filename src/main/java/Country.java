public class Country {
    //tworzenie własnej klasy
    final private int retirementAge;
    final private String countryName;

    public Country (int retirementAge, String countryName){
    this.retirementAge = retirementAge; //this aby widział nasze zmienne
        this.countryName = countryName;
    }
   public int getRetirementAge () {
        return retirementAge;
    }
public String getCountryName () {
        return countryName;
}
public String toString () {
        return countryName;
}
}
