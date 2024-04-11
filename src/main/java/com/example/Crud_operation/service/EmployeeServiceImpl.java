package com.example.Crud_operation.service;

import com.example.Crud_operation.entity.Employee;
import com.example.Crud_operation.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService
{

    @Autowired
    private EmployeeRepository employeeRepository;

//    @PostMapping("/employees")
    public Employee setData(Employee employee)
    {
        return employeeRepository.save(employee);
    }

//    @GetMapping("/employee/{id}")
    public Employee getById(int id)
    {
        return  employeeRepository.findById(id).get();
    }

//    @Override
    public List<Employee> getByAge(int age)
    {
        return employeeRepository.findByAge(age);
//        if (age>=18 && age<=25)
//            return  employeeRepository.findDataByAge(age);
//        else
//            return (Employee) employeeRepository.findAll();
//        return  employeeRepository.findDataByAge(age);

    }

    public List<Employee> getByStatus(String status)
    {
        return employeeRepository.findByStatus(status);
    }

//    @GetMapping("/employees")
    public List<Employee> getAllEmployeesData()
    {
        return employeeRepository.findAll();
    }

//    @DeleteMapping("/employee/{id}")
    public String deleteThroughId(int id)
    {
        employeeRepository.deleteById(id);
        return "Deleted a single record...";
    }

//    @DeleteMapping("employees")
    public String delete()
    {
        employeeRepository.deleteAll();
        return "All the data deleted...";
    }

//    @PutMapping("employees/{id}")
    public Employee updateEmployeeById(int id, Employee employee)
    {
        employee.setEid(id);
        return employeeRepository.save(employee);
    }
}
