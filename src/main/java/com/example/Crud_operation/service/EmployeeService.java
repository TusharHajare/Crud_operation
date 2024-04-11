package com.example.Crud_operation.service;

import com.example.Crud_operation.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService
{
    public Employee setData(Employee employee);
    public Employee getById(int id);

    public List<Employee> getByAge(int age);

    public List<Employee> getByStatus(String status);

    public List<Employee> getAllEmployeesData();
    public String deleteThroughId(int id);
    public String delete();
    public Employee updateEmployeeById(int id, Employee employee);
}
