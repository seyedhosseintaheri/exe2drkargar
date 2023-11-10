//by Seyed Hossein Taheri
package com.example.springdatajpa1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class Run implements CommandLineRunner {
    @Autowired
    EmpServ empServ;
    @Override
    public void run(String... args) throws Exception {
        Employee employee=new Employee();
        employee.setId(5L);
        employee.setFirstname("Seyed Hossein");
        employee.setLastname("Taheri");
        employee.setphone_number("09100000000");
        employee.setage(23);
        employee.setnational_id("0020000000");
        empServ.save(employee);

    }
}
