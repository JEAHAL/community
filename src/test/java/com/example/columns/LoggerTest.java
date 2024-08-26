package com.example.columns;

import com.example.columns.dao.DiscussPostMapper;
import com.example.columns.dao.UserMapper;
import com.example.columns.entity.DiscussPost;
import com.example.columns.entity.User;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=ColumnsApplication.class)
public class LoggerTest {

    private static final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void testLogger(){
        System.out.println(logger.getName());

        logger.info("info log");
        logger.warn("warn log");
        logger.error("error log");
        logger.debug("debug log");
    }

}
