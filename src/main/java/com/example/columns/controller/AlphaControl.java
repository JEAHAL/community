package com.example.columns.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller   //实现被扫描 serverice repositry componets 加到bean就能被扫描到
@RequestMapping("/alpha")  //ton过名字访问类

public class AlphaControl {
    @RequestMapping("/hello")  //ton过名字访问类
    @ResponseBody
    //方法能被访问到的前提是前面也有注解
    public String sayHello(){
        return "Say hello spring boot";
    }

    @RequestMapping("/http")
    //前面一个请求对象，后面一个相应对象
    public void http(HttpServletRequest request, HttpServletResponse response){
        //获取请求数据
        System.out.println(request.getMethod());
        System.out.println(request.getServletPath());

        // ?=123实现传参
        System.out.println(request.getParameter("code"));

        //返回响应数据
        response.setContentType("text/tml;charset=utf-8");
        try (  //小括号自动会finally结束流
                PrintWriter writer = response.getWriter();
                ){
            writer.write("<h1>牛客网</h1>");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //get 请求

    //student?current=1 & limt=20
    //后面限制只能用get
//    @RequestMapping(path="/students", method = RequestMethod.GET)
//    @ResponseBody
//    public String getStudents(@RequestParam(name = "current", required = false, defaultValue = "1") int current,
//                              @RequestParam(name = "student", required = false, defaultValue = "10") int student){
//        System.out.println(current);
//        System.out.println(student);
//        return "some students";
//    }

//    @RequestMapping(path="/students/{id}", method = RequestMethod.GET)
//    @ResponseBody
//    public String getStudents(@PathVariable("id") int id){
////        System.out.println(current);
//        System.out.println(id);
//        return "some students";
//    }

    //Post请求
    @RequestMapping(path="/student",method = RequestMethod.POST)
    @ResponseBody
    //post里和表单一致就能传过来
    public String saveStudent(String name,int age){
        System.out.println(name);
        System.out.println(age);
        return "sucess";

    }

    // 响应HTML数据

    @RequestMapping(path = "/teacher", method = RequestMethod.GET)
    public ModelAndView getTeacher() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("name", "张三");
        mav.addObject("age", 30);
        mav.setViewName("/demo/view");
        return mav;
    }

    @RequestMapping(path = "/school", method = RequestMethod.GET)
    //Model 就是model 上面把model 和 view都装到一起了
    //不写RSPONSBODY默认返回html
    public String getSchool(Model model) {
        model.addAttribute("name", "北京大学");
        model.addAttribute("age", 80);
        return "/demo/view";
    }

    // 响应JSON数据(异步请求)
    // Java对象 -> JSON字符串 -> JS对象

    @RequestMapping(path = "/emp", method = RequestMethod.GET)
    //加上下面的 body才能返回sstring等东西
    @ResponseBody
    //下面就是json格式，一个map : string : object
    public Map<String, Object> getEmp() {
        Map<String, Object> emp = new HashMap<>();
        emp.put("name", "张三");
        emp.put("age", 23);
        emp.put("salary", 8000.00);
        return emp;
    }


    @RequestMapping(path = "/emps", method = RequestMethod.GET)
    @ResponseBody
    //一个大括号就是一个对象 这里就变成一个map就是一个对象
    public List<Map<String, Object>> getEmps() {
        List<Map<String, Object>> list = new ArrayList<>();

        Map<String, Object> emp = new HashMap<>();
        emp.put("name", "张三");
        emp.put("age", 23);
        emp.put("salary", 8000.00);
        list.add(emp);

        emp = new HashMap<>();
        emp.put("name", "李四");
        emp.put("age", 24);
        emp.put("salary", 9000.00);
        list.add(emp);

        emp = new HashMap<>();
        emp.put("name", "王五");
        emp.put("age", 25);
        emp.put("salary", 10000.00);
        list.add(emp);

        return list;
    }


}

