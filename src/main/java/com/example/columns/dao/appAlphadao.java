package com.example.columns.dao;

import org.springframework.stereotype.Repository;

//能被扫描要加注解
@Repository("123")  //对数据的访问（数仓的意思）
public class appAlphadao implements alphadao{
    @Override
    public String select(){
        return "Hi Bean!!";
    }
}
