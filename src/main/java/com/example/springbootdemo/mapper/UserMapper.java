package com.example.springbootdemo.mapper;

import com.example.springbootdemo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


import java.util.List;

// 这里的@Mapper注解，是告诉Mybatis，这是一个Mapper类
@Mapper
public interface UserMapper {

    //    这里的@Select注解，是告诉Mybatis，这是一个查询语句
    @Select("select * from User")
    List<User> findAll();

    @Select("select * from User where Id = #{id}")
    User findById(int id);

    @Insert("insert into User (Name,age,email,classId) values (#{name},#{age},#{email},#{classId})")
//    返回值为int，表示影响的行数
    int insert(User user);

    @Update("update User set Name=#{name},age=#{age},email=#{email},classId=#{classId} where Id=#{id}")
    int update(User user);

    @Update("delete from User where Id=#{id}")
    int delete(int id);
}
