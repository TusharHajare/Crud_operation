package com.example.Crud_operation.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Employee_Tbl")
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "E_Id")
    private int eid;
    @Column(name = "E_Name")
    private String ename;
//    @Column(name = "E_Position")
//    private String ePosition;
//    @Column(name = "E_Location")
//    private String eLocation;
//    @Column(name = "E_Address")
//    private String eAddress;
    @Column(name = "status")
    private String status;//Active, Inactive, suspend
    @Column(name = "age")
    private int age;
}
