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
    @RequestMapping("/query")
    @ResponseBody
    public Student queryStudent(Integer id){
        Student student=studentService.queryStudent(id);
        return student;
    }
}
