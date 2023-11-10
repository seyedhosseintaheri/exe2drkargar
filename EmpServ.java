package com.example.springdatajpa1;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServ {
    @Autowired
    EmployeeRepository employeeRepository;
    @Transactional
    public void save(Employee employee){
        employeeRepository.save(employee);
    }
}
