package functions;

import java.util.function.Function;

import functions.models.Employee;
import functions.models.Person;

public class Hire implements Function<Person, Employee> {
    @Override
    public Employee apply(Person person) {
        System.out.printf("Person: first(%s) last(%s)\n", person.getFirstName(), person.getLastName());
        Employee employee = new Employee(person);
        System.out.printf("Employee: %s\n", employee.getMessage());
        return employee;
    }
}
