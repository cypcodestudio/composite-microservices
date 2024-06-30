package com.cypcode.composite_microservice.controller;

import com.cypcode.composite_microservice.domain.Employee;
import com.cypcode.composite_microservice.repository.EmployeeRepository;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("employee")
    public ResponseEntity<?> createEmployee(@RequestBody Employee employee){
    	log.info("Employee before creation: {} ", employee.getId());
        employeeRepository.save(employee);
        log.info("Employee after creation: {} ", employee.getId());
        return ResponseEntity.ok("");
    }
}
