package com.springmvc.service;

import com.springmvc.entity.Employee;

import java.util.List;

public interface EmployeeService {

     public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);
}
