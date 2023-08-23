package com.example.project1.controller;


import com.example.project1.entity.User;
import com.example.project1.interfaces.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SignInController {
    @Autowired
    Student student;
    List<User> userList=new ArrayList<>();


    @PostMapping("/createUser")
    public ResponseEntity<Object> createUser(@RequestBody User user){
        userList.add(user);
        return ResponseEntity.ok().body(userList);
    }

    @GetMapping()
    public ResponseEntity<Object> getAllUser(){
        return ResponseEntity.ok().body(userList);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> getAllUser(@PathVariable String id){

        return ResponseEntity.ok().body(userList.stream().filter(user -> user.getId().equalsIgnoreCase(id)));
    }
    @GetMapping("/names")
    public String getNames(){
//        return null;
        return student.getName();
    }
    @Scheduled(cron = "* * * * * *")
    public void generateMonthlyEmployeePayslip() {
        System.out.println("****************************Scheduler");
    }
}
