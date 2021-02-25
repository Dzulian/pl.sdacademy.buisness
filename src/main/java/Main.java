import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

            Country countryPoland = new Country(65, "Poland");
            Country countryGermany = new Country(65, "Germany");

            for( Country c: new Country[]{countryPoland, countryGermany})
            {
                System.out.println(c);
            }

            Company terravita = new Company(countryPoland,"Terravita");
            Company volkswagen = new Company(countryGermany,"Volkswagen");

            Employee employee1 = new Employee("Hans","Schulz", LocalDate.of(1945,02,10));
            Employee employee2 = new Employee("Andreas","Schulz22", LocalDate.of(2001,02,10));
            terravita.setEmployees(null);
            volkswagen.setEmployees(new Employee[]{employee1,employee2});
            terravita.setEmployees(new Employee[]{
                    new Employee("Anna","Bania", LocalDate.of(2001,02,10)),
                    new Employee("Hanna","Bania", LocalDate.of(1967,02,10))
            });


            for (Company company: new Company[]{terravita,volkswagen}) {
                for (Employee employee: company.getEmployees()) {
                    System.out.printf("Nazwa firmy: %s, pracownik: %s, kraj: %s\n", company.getCompanyName(), employee, company.getCountry());
                }
            }

            for(Employee employee: volkswagen.getRetiredEmployees(LocalDate.of(2080,3,4))) {
                System.out.println(employee);
            }

            for(Employee employee: volkswagen.getRetiredEmployees() ) {
                System.out.println("NOW:"+employee);
            }

            for (Company company: new Company[]{terravita,volkswagen}) {
                company.raise(900);
            }

        }


    }