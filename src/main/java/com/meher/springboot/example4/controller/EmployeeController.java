package com.meher.springboot.example4.controller;


import com.meher.springboot.example4.model.Employee;
import com.meher.springboot.example4.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/health")
    public String checkHealth() {
        return "Application is running fine";

    }

    @GetMapping
    public List<Employee> getAllEmployees() {

        return employeeService.getAllEmployees();

    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id) {

        return employeeService.getEmployeeById(id);

    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {

        return employeeService.createEmployee(employee);


    }

    @DeleteMapping("/{id}")
    public Employee deleteEmployeeById(@PathVariable int id) {

        return employeeService.deleteEmployeeById(id);


    }

    @PutMapping("/{id}")
    public Employee updateEmployee(int id, Employee employee) {

        return employeeService.updateEmployee(id, employee);


    }


}
