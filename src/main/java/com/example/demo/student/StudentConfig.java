package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {

//            Student Hamza = new Student(
//                    "Hamza",
//                    "hamza@gmail.com",
//                    LocalDate.of(2000, JANUARY, 5)
//            );
//            Student alex = new Student(
//                    "alex",
//                    "alex@gmail.com",
//                    LocalDate.of(2013, JANUARY, 5)
//            );
//
//            repository.saveAll(
//                    List.of(Hamza, alex)
//            );

        };
    }
}
