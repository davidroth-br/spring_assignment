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
        NumberFormat cad = NumberFormat.getCurrencyInstance(new Locale("en", "US"));

        Employee homer = context.getBean("homer", Employee.class);
        Employee carlton = context.getBean("carlton", Employee.class);
        Employee burns = context.getBean("burns", Employee.class);

        System.out.printf("%n%s %s works at the %s %s department (ID: %d),%nhis email is %s, and he makes %s a month.%n",
                homer.getFirstName(),
                homer.getLastName(),
                homer.getDepartment().getCity(),
                homer.getDepartment().getName(),
                homer.getDepartment().getId(),
                homer.getEmail(),
                cad.format(homer.getSalary())
                );
        System.out.printf("%n%s %s works at the %s %s department (ID: %d),%nhis email is %s, and he makes %s a month.%n",
                carlton.getFirstName(),
                carlton.getLastName(),
                carlton.getDepartment().getCity(),
                carlton.getDepartment().getName(),
                carlton.getDepartment().getId(),
                carlton.getEmail(),
                cad.format(carlton.getSalary())
        );
        System.out.printf("%n%s %s works at the %s %s department (ID: %d),%nhis email is %s, and he makes %s a month.%n",
                burns.getFirstName(),
                burns.getLastName(),
                burns.getDepartment().getCity(),
                burns.getDepartment().getName(),
                burns.getDepartment().getId(),
                burns.getEmail(),
                cad.format(burns.getSalary())
        );
    }
}
