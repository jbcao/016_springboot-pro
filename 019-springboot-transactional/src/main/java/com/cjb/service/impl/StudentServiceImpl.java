package com.cjb.service.impl;

import com.cjb.dao.StudentMapper;
import com.cjb.model.Student;
import com.cjb.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;
    @Override
    @Transactional
    public int addStudent(Student student) {
        int rows = studentMapper.insert(student);
        int res=10/0;
        return rows;
    }
}
