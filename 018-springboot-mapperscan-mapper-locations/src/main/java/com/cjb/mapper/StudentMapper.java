package com.cjb.mapper;

import com.cjb.model.Student;
import org.apache.ibatis.annotations.Param;


public interface StudentMapper {
    Student selectStudentById(@Param("id") Integer id);
}
