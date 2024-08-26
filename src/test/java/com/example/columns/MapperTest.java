package com.example.columns;

import com.example.columns.dao.DiscussPostMapper;
import com.example.columns.dao.UserMapper;
import com.example.columns.entity.DiscussPost;
import com.example.columns.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=ColumnsApplication.class)
//@ContextConfiguration(classes =  ColumnsApplication.class)
public class MapperTest {

//    @Autowired
//    private UserMapper userMapper;
//
//    @Test
//    public void testSelectUser() {
//        User user = userMapper.selectById(101);
//        System.out.println(user);
//
//        user = userMapper.selectByName("liubei");
//        System.out.println(user);
//
//        user = userMapper.selectByEmail("nowcoder101@sina.com");
//        System.out.println(user);
//    }

//    @Test
//    public void testInsertUser() {
//        User user = new User();
//        user.setUsername("test");
//        user.setPassword("123456");
//        user.setSalt("abc");
//        user.setEmail("test@qq.com");
//        user.setHeaderUrl("http://www.nowcoder.com/101.png");
//        user.setCreateTime(new Date());
//
//        int rows = userMapper.insertUser(user);
//        System.out.println(rows);
//        System.out.println(user.getId());
//    }

//    @Test
//    public void updateUser() {
//        int rows = userMapper.updateStatus(150, 1);
//        System.out.println(rows);
//
//        rows = userMapper.updateHeader(150, "http://www.nowcoder.com/102.png");
//        System.out.println(rows);
//
//        rows = userMapper.updatePassword(150, "hello");
//        System.out.println(rows);
//    }

//    先注进来
    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Test
    //注入完了要引入实例类
    public void testSelectPosts() {
        List<DiscussPost> list = discussPostMapper.selectDiscussPosts(0, 0, 10);
        for(DiscussPost post : list) {
            System.out.println(post);
        }

        int rows = discussPostMapper.selectDiscussPostRows(0);
        System.out.println(rows);

    }


}

