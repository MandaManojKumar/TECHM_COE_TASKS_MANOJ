package com.example.conditionalselect.service;

import com.example.conditionalselect.model.Employee;
import com.example.conditionalselect.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findEmployeesByDepartment(String department) {
        return employeeRepository.findByDepartment(department);
    }

    public List<Employee> findEmployeesByAgeGreaterThan(int age) {
        return employeeRepository.findByAgeGreaterThan(age);
    }

    // Add this method to save employees
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
