1、userController里面写上接口地址

2、userService里面写上返回实体

这里可以写上返回结果

3、userMapper里面写上查询语句

4、entity里面写上映射的shiti

5、写一个user接口，增删改查

```javascript
// 查找全部，成功返回JSON
GET：localhost:8080/user/

// 查找单个，成功返回JSON
GET：localhost:8080/user/{id}

// 添加单个，成功返回1
POST：localhost:8080/user/add
{
    "name": "Xiao Tian",
    "age": 15,
    "email": "test10@qq.com",
    "classId": 1
}

// 修改单个，成功返回1
PUT：localhost:8080/user/update

// 删除单个，成功返回1
DELETE：localhost:8080/user/delete/{id}
```

6、对于返回结果的处理

7、对于异常情况的处理

8、联表查询处理