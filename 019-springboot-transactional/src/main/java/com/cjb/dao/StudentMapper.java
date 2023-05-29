package com.cjb.dao;

import com.cjb.model.Student;

public interface StudentMapper {
    int insert(Student record);

    int insertSelective(Student record);
}