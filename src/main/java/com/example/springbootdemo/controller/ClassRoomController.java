package com.example.springbootdemo.controller;

import com.example.springbootdemo.entity.Classroom;
import com.example.springbootdemo.service.ClassRoomService;
import com.example.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClassRoomController {

    @Autowired
    public ClassRoomService classRoomService;

    @RequestMapping("/classroom")
    public List<Classroom> getClassRoomAll() {
        return classRoomService.findAll();
    }
}
