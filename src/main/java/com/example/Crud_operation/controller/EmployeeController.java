package com.example.Crud_operation.controller;

import com.example.Crud_operation.entity.Employee;
import com.example.Crud_operation.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/path")
public class EmployeeController
{
    @Autowired
    private EmployeeServiceImpl employeeServiceimpl;

    @PostMapping("/employees")
    private Employee setData(@RequestBody Employee employee)
    {
        return employeeServiceimpl.setData(employee);
    }

    @GetMapping("/employees/{status}")
    private ResponseEntity<List<Employee>> getEmployeeByStatus(@RequestParam("status") String status)
    {
        return new ResponseEntity<List<Employee>>(employeeServiceimpl.getByStatus(status), HttpStatus.OK);
    }

    @GetMapping("/employee/{id}")
    private Employee getById(@PathVariable("id") int id)
    {
        return employeeServiceimpl.getById(id);
    }

    @GetMapping("/employeed/{age}")
    private ResponseEntity<List<Employee>> getDataByAge(@RequestParam int age)
    {
        return new ResponseEntity<List<Employee>>(employeeServiceimpl.getByAge(age), HttpStatus.OK);
    }

    @GetMapping("/employees")
    private List<Employee> getAllEmployeesData()
    {
        return employeeServiceimpl.getAllEmployeesData();
    }

    @DeleteMapping("employees/{id}")
    private String deleteById(@PathVariable("id") int id)
    {
       return employeeServiceimpl.deleteThroughId(id);
    }

    @DeleteMapping("employees")
    private String delete()
    {
        return employeeServiceimpl.delete();
    }

    @PutMapping("employees/{id}")
    private Employee updateEmployeeById(@PathVariable("id") int id, @RequestBody Employee employee)
    {
        return employeeServiceimpl.updateEmployeeById(id, employee);
    }
}
