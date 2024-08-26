package com.example.columns;

import com.example.columns.dao.alphadao;
import com.example.columns.dao.appAlphadao;
import com.example.columns.service.alphaservice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = ColumnsApplication.class)  //保证配置类与原始一致 容器是自动被创建的
class ColumnsApplicationTests implements ApplicationContextAware {

    private ApplicationContext  applicationContext;


    //获得容器
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

//    @Test
//    void testApplicationContext() {
//        System.out.println(applicationContext);
//
//        //面向接口编程 spring容器通过该方法实现调用方和实现类不会有大大关系
//        alphadao alph = applicationContext.getBean(alphadao.class);  //可通过名字或接口获得
//        System.out.println(alph.select());
//        alph = applicationContext.getBean("123",alphadao.class);
//        System.out.print(alph.select());
//    }

//    @Test
//    public void testBean(){
//        alphaservice alphaServe = applicationContext.getBean(alphaservice.class);
//        System.out.println(alphaServe);
//
//        //被容器管理bean都是单例的
//
//    }

//    @Autowired  //依赖注入 让容器注入哪个bean
//    private appAlphadao apd;

//    @Test
//    public void di(){
//         System.out.println(apd.select());
//
//     }


}
