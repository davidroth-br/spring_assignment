package com.montrealcollege.assignment;

import com.montrealcollege.assignment.config.AppConfig;
import com.montrealcollege.assignment.entities.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        NumberFormat dollars = NumberFormat.getCurrencyInstance(Locale.US);
        Employee[] employees = new Employee[3];

        for (int i = 0; i < employees.length; i++) {
            Employee employee = context.getBean("employee" + i, Employee.class);
            System.out.printf(
                    "%n%s %s works at the %s %s department (ID: %d),%nhis email is %s, and he makes %s a month.%n",
                    employee.getFirstName(),
                    employee.getLastName(),
                    employee.getDepartment().getCity(),
                    employee.getDepartment().getName(),
                    employee.getDepartment().getId(),
                    employee.getEmail(),
                    dollars.format(employee.getSalary())
            );
        }
    }
}
