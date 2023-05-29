package com.cjb.service.impl;

import com.cjb.model.Student;
import com.cjb.service.StudentService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(interfaceClass = StudentService.class,version = "1.0",timeout = 5000)
public class StudentServiceImpl implements StudentService {
    @Override
    public Student queryStudentById(Integer id) {
        Student student = new Student();
        if(id==1001){
            student.setId(1001);
            student.setName("guilin");
            student.setAge(89);
        }else if(id==1002){
            student.setId(1002);
            student.setName("wudangshan");
            student.setAge(99);
        }
        return student;
    }
}
