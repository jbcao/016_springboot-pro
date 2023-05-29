package com.cjb.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
//    get请求
    @GetMapping(value = "/student/{studentId}/{className}")
    public String queryStudent(@PathVariable("studentId") Integer id, @PathVariable String className){
        return "get请求 StudentID"+id+" 班级名 "+className;
    }

    @GetMapping(value = "/student/{studentId}/class/{className}")
    public String queryStudent2(@PathVariable("studentId") Integer id, @PathVariable String className){
        return "get请求 StudentID"+id+" 班级名 "+className;
    }
//    post
    @PostMapping("/student/{stuId}")
    public  String createStudent(@PathVariable("stuId") Integer id,Integer age,String name){
        return "post创建学生，id "+id+" age "+age+" name "+name;
    }
//put
    @PutMapping("/student/{stuId}")
    public String modifyStudent(@PathVariable("stuId") Integer id,Integer age,String name){
        return "put修改学生，id "+id+" age "+age+" name "+name;
    }
//delete
    @DeleteMapping("/student/{stuId}")
    public String deleteStudent(@PathVariable("stuId") Integer id){
        return "delete删除学生，id "+id;
    }

}
