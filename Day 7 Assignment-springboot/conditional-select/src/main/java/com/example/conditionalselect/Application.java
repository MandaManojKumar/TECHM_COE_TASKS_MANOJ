package com.example.conditionalselect;

import com.example.conditionalselect.model.Employee;
import com.example.conditionalselect.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Save some employees
        Employee emp1 = new Employee();
        emp1.setName("John");
        emp1.setDepartment("IT");
        emp1.setAge(25);

        Employee emp2 = new Employee();
        emp2.setName("Jane");
        emp2.setDepartment("HR");
        emp2.setAge(30);

        employeeService.saveEmployee(emp1);
        employeeService.saveEmployee(emp2);

        // Find employees by department
        List<Employee> itEmployees = employeeService.findEmployeesByDepartment("IT");
        itEmployees.forEach(emp -> System.out.println("Employee in IT: " + emp.getName()));

        // Find employees by age
        List<Employee> olderEmployees = employeeService.findEmployeesByAgeGreaterThan(28);
        olderEmployees.forEach(emp -> System.out.println("Employee older than 28: " + emp.getName()));
    }
}
