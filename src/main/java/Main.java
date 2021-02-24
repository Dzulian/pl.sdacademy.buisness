public class Main {

    public static void main(String[] args) {

        Country poland = new Country(65, "Poland");
        Country germany = new Country(67, "Germany");

        for (Country country: new Country[] {poland, germany}) {
            System.out.println(country);
        }
        }
    }

