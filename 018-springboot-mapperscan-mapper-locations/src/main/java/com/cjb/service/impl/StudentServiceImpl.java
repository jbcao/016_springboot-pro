package com.cjb.service.impl;

import com.cjb.dao.StudentDao;
import com.cjb.model.Student;
import com.cjb.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;
    @Override
    public Student queryStudent(Integer id) {
        Student student =studentDao.selectStudentById(id);
        return student;
    }
}
