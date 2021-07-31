package com.app.dao;

import com.app.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();

    void save(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
