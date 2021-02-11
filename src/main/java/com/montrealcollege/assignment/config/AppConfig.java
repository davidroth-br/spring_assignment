package com.montrealcollege.assignment.config;

import com.montrealcollege.assignment.entities.Department;
import com.montrealcollege.assignment.entities.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    public Employee homer() {
        Employee employee = new Employee();
        employee.setFirstName("Homer");
        employee.setLastName("Simpson");
        employee.setSalary(1234.56);
        employee.setEmail("doh@groening.com");
        return employee;
    }

    @Bean
    public Employee carlton() {
        Employee employee = new Employee();
        employee.setFirstName("Carlton");
        employee.setLastName("Carlson");
        employee.setSalary(2345.67);
        employee.setEmail("cc@groening.com");
        return employee;
    }

    @Bean
    public Employee burns() {
        return new Employee("Charles", "Burns", 987654.32, "mr_burns@groening.com");
    }

    @Bean
    @Scope("singleton")
    public Department nuclearEnergy() {
        Department department = new Department();
        department.setId(1);
        department.setName("Nuclear Energy");
        department.setCity("Springfield");
        return department;
    }
}
