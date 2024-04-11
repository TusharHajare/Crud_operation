package com.example.Crud_operation.repository;

import com.example.Crud_operation.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
    //JPQL - java persistence query language
    //Native query - sql database
    //finder/query method  - Behind the scene JPA will create and execute the query

//  @Query("select ud from Employee ud where ud.status=?1")
    public List<Employee> findByStatus(String status);

     public List<Employee> findByAge(int age);


}
