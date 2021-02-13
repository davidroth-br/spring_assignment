package com.montrealcollege.assignment.config;

import com.montrealcollege.assignment.entities.Department;
import com.montrealcollege.assignment.entities.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    public Employee employee0() {
        Employee employee = new Employee();
        employee.setFirstName("Homer");
        employee.setLastName("Simpson");
        employee.setSalary(1234.56);
        employee.setEmail("doh@groening.com");
        return employee;
    }

    @Bean
    public Employee employee1() {
        Employee employee = new Employee();
        employee.setFirstName("Carlton");
        employee.setLastName("Carlson");
        employee.setSalary(2345.67);
        employee.setEmail("cc@groening.com");
        return employee;
    }

    @Bean
    public Employee employee2() {
        return new Employee("Charles", "Burns", 987654.32, "mr_burns@groening.com");
    }

    @Bean
    @Scope("singleton") // Not necessary. Default value. Only here because it was
                        // explicitly asked for in the assignment instructions.
    public Department nuclearEnergy() {
        Department department = new Department();
        department.setId(1);
        department.setName("Nuclear Energy");
        department.setCity("Springfield");
        return department;
    }
}
