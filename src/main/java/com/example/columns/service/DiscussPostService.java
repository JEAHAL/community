package com.example.columns.service;

import com.example.columns.dao.DiscussPostMapper;
import com.example.columns.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//业务层
@Service
public class DiscussPostService {
    //业务层调的是mapper不是实例类 正常 掉的都是接口
    @Autowired
    private DiscussPostMapper discussPostmapper;

    public List<DiscussPost> findDiscussPosts(int userId, int offset, int limit){
        return discussPostmapper.selectDiscussPosts(userId, offset, limit);

    }

    public int findDiscussPostRows(int userId){
        return discussPostmapper.selectDiscussPostRows(userId);
    }





}
