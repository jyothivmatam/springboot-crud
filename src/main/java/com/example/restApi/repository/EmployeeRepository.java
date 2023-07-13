package com.example.restApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.restApi.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
