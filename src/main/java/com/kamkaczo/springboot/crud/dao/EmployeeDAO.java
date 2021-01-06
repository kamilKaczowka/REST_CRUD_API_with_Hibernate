package com.kamkaczo.springboot.crud.dao;

import com.kamkaczo.springboot.crud.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> findAll();

}
