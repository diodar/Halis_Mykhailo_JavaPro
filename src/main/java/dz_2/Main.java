package dz_2;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.position = "Driver";
        employee1.number = 380776549877L;
        employee1.salary = 2000;
        System.out.println("Temporary Employee: " + employee1);

        Employee employee2 = new Employee("Petrov", "Igor", "Ivanovych", "Director", "i.petrov@gmail.com", 380961234567L, 55, 30000);
        System.out.println("New Employee Full: " + employee2);

        Employee employee3 = new Employee("Shevchenko", "Andrii", "Mykolayovych", "Manager", 20000);
        System.out.println("Employee For Accounter: " + employee3);

        System.out.println('\n');

        Car car = new Car();
        car.start();

        System.out.println('\n');

        SameName sameName1 = new SameName();
        dz_2_same_name.SameName sameName2 = new dz_2_same_name.SameName();
    }
}
