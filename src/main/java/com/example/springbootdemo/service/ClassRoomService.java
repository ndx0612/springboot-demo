package com.example.springbootdemo.service;

import com.example.springbootdemo.entity.Classroom;
import com.example.springbootdemo.entity.User;
import com.example.springbootdemo.mapper.ClassRoomMapper;
import com.example.springbootdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassRoomService {
    @Autowired
    private ClassRoomMapper classRoomMapper;

    public List<Classroom> findAll() {
        return classRoomMapper.findAll();
    }
}
