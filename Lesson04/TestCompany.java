package Lesson04;

import java.util.ArrayList;
import java.util.List;

public class TestCompany {
    public static void main(String[] args) {
        CEO ceo = new CEO();
        Manager manager = new Manager();
        Employee emp01 = new Employee();
        Employee emp02 = new Employee();

        ceo.setSalary(1000);
        System.out.printf("CEO salary: %s\n", ceo.getSalary());

        manager.setSalary(500);
        System.out.printf("Manager salary: %s\n", manager.getSalary());

        emp01.setSalary(100);
        System.out.printf("Employee-01 salary: %s\n", emp01.getSalary());

        emp02.setSalary(150);
        System.out.printf("Employee-02 salary: %s\n", emp02.getSalary());

        double total = ceo.getSalary() + manager.getSalary() + emp01.getSalary() + emp02.getSalary();
        System.out.printf("Total: %f", total);

    }
}
