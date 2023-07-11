package com.glearning.emps.dao;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.glearning.emps.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	Set<Employee> findByNameLike(String name);

	Set<Employee> findByAgeGreaterThanEqual(int age);

	Set<Employee> findByAgeBetween(int start, int end);

}
