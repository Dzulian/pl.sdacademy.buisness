import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final LocalDate birthDate;
    private double salary;

    public boolean isRetired(Country country, LocalDate refDate) {
        Period agePeriod = Period.between(birthDate,refDate);
        int age = agePeriod.getYears();
        int retiredAge = country.getRetireAge();

        return age >= retiredAge;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return firstName + " " +  lastName ;
    }
}

