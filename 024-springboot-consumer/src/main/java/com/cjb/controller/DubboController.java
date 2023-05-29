package com.cjb.controller;

import com.cjb.model.Student;
import com.cjb.service.StudentService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DubboController {
    @DubboReference(version = "1.0")
    private StudentService studentService1;

    @GetMapping("/query")
    public Student queryStudent(Integer id) {
        return studentService1.queryStudentById(id);
    }
}
