package com.example.demo.Student;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    1L,
                    "Maria"
                    , LocalDate.of(2000,11,7),
                    "MariaLuis@hotmail.com"
            );
            Student Jacob = new Student(
                    "Jacob"
                    , LocalDate.of(2003,11,22),
                    "JacintoJac@hotmail.com"
            );
            repository.saveAll(
                    List.of(mariam, Jacob)
            );
        };
    }
}
