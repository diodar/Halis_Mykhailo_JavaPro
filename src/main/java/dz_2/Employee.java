package dz_2;

public class Employee {

    final String surname;
    final String name;
    final String middleName;
    String position;
    String email;
    long number;
    int age;
    int salary;

    public Employee(String surname, String name, String middleName, String position, String email, long number, int age, int salary) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.position = position;
        this.email = email;
        this.number = number;
        this.age = age;
        this.salary = salary;
    }

    public Employee(String surname, String name, String middleName, String position, int salary) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.position = position;
        this.salary = salary;
    }

    public Employee() {
        surname = "Temporary";
        middleName = null;
        name = "Employee";
    }

    @Override
    public String toString() {
        return "surname = '" + surname + '\'' +
                ", name = '" + name + '\'' +
                ", middleName = '" + middleName + '\'' +
                ", position = '" + position + '\'' +
                ", email = '" + email + '\'' +
                ", number = " + number +
                ", age = " + age +
                ", salary = " + salary +
                '}';
    }
}

