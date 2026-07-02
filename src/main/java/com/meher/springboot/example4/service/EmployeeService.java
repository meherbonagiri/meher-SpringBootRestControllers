package com.meher.springboot.example4.service;

import com.meher.springboot.example4.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class EmployeeService {
    Map<Integer, Employee> employeeMap = new HashMap<>();

    public EmployeeService() {
        employeeMap.put(1624, new Employee(1624, "Meher", 15000.00, "Sr Java Developer", "Java, Python, React"));
        employeeMap.put(1625, new Employee(1625, "Rishabh", 17000.00, "Sr Java Full Stack Developer", "Java, Kafka, Node"));
        employeeMap.put(1626, new Employee(1626, "Nithin", 18000.00, "Sr Java Full Stack Developer", "Java, Python, React, AI"));
        employeeMap.put(1627, new Employee(1627, "Sreeja", 12000.00, "Java Developer", "Java, Python, React, Git, SQL"));
        employeeMap.put(1628, new Employee(1628, "Drawin", 19000.00, "Sr Technical Manager", "Java, Python, React, MongoDB"));
        employeeMap.put(1629, new Employee(1629, "Rohit", 20000.00, "Sr Technical Manager", "Java, Python, React, MongoDB"));
    }

    public List<Employee> getAllEmployees(){
        return new ArrayList<>(employeeMap.values());

    }

    public Employee getEmployeeById(int id){

        return employeeMap.get(id);

    }

    public Employee createEmployee(Employee employee){

        return employeeMap.put(employee.getId(), employee);

    }

    public Employee deleteEmployeeById(int id){

        return employeeMap.remove(id);
    }

    public Employee updateEmployee(int id, Employee employee){

       employeeMap.put(id, employee);

       return employee;
    }
}
