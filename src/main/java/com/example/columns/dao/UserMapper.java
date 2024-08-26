package com.example.columns.dao;

import com.example.columns.entity.User;
import org.apache.ibatis.annotations.Mapper;

//Mybatis用mapper 只需要接口 不需要实现
@Mapper
public interface UserMapper {

    User selectById(int id);

    User selectByName(String username);

    User selectByEmail(String email);

    int insertUser(User user);

    int updateStatus(int id, int status);

    int updateHeader(int id, String headerUrl);

    int updatePassword(int id, String password);



}
