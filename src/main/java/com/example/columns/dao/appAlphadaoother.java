package com.example.columns.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Primary  //优先装配
@Repository
public class appAlphadaoother implements alphadao{
    @Override
    public String select(){
        return "Hi Bean2!!";
    }

}
