package com.springmvc.dao;

import com.springmvc.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> getAllEmployees();
}
