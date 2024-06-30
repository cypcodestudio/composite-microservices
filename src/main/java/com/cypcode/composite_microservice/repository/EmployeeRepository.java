package com.cypcode.composite_microservice.repository;

import com.cypcode.composite_microservice.domain.composite.EmployeeComposite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cypcode.composite_microservice.domain.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, EmployeeComposite> {

}
