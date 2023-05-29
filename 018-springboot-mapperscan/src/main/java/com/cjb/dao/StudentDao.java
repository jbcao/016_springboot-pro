package com.cjb.dao;

import com.cjb.model.Student;
import org.apache.ibatis.annotations.Param;


public interface StudentDao {
    Student selectStudentById(@Param("id")Integer id);
}
