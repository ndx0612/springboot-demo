package com.example.springbootdemo.mapper;

import com.example.springbootdemo.entity.Classroom;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.List;

// 这里的@Mapper注解，是告诉Mybatis，这是一个Mapper类
@Mapper
public interface ClassRoomMapper {

    //    这里的@Select注解，是告诉Mybatis，这是一个查询语句
    @Select("select * from classroom")
    List<Classroom> findAll();
}
