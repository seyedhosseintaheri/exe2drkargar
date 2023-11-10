//by Seyed Hossein Taheri
package com.example.springdatajpa1;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jdk.jfr.DataAmount;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Employee {
    @Id
     Long id;
    String firstname;
    String lastname;
    String phone_number;
    int age;
    String national_id;




}
