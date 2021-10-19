package Lesson05;

import java.util.ArrayList;
import java.util.List;

public class TestCompany {
    public static void main(String[] args) {
        CEO ceo = new CEO();
        Manager manager = new Manager();
        NormalEmployee norEmp1 =new NormalEmployee();
        NormalEmployee norEmp2 =new NormalEmployee();

        ceo.setSalary(1000);
        manager.setSalary(500);
        norEmp1.setSalary(400);
        norEmp2.setSalary(300);

        double total = 0.0;
        TestCompany salariesCalculation = new TestCompany();
        List<Employee> employees = new ArrayList<>();
        employees.add(ceo);
        employees.add(manager);
        employees.add(norEmp1);
        employees.add(norEmp2);
        total = salariesCalculation.calculation(employees);
        System.out.printf("Total salaries is: %f", total);
    }

    public double calculation(List<Employee> employees){
        double total = 0.0;
        for (Employee employee : employees) {
            total += employee.getSalary();
        }
        return total;
    }
}
