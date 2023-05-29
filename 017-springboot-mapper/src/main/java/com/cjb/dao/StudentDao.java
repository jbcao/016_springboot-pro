package com.cjb.dao;

import com.cjb.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StudentDao {
    Student selectStudentById(@Param("id")Integer id);
}
