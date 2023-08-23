package com.example.project1.config;


import com.example.project1.impl.StudentImpl;
import com.example.project1.interfaces.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;

@Configuration
@Slf4j
public class ImplConfig  {
    @Bean
    public Student getStudent(){
        log.info("**********************StudentImpl**************");
        return new StudentImpl();
    }
}
