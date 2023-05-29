package com.cjb.controller;

import com.cjb.model.Student;
import com.cjb.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class StudentController {
    @Resource
    private StudentService studentService;
    @RequestMapping("/addStudent")
    @ResponseBody
    public Integer addStudent(Integer age,String name){
        Student student = new Student();
        student.setAge(age);
        student.setName(name);
        int rows = studentService.addStudent(student);
        return rows;
    }
}
