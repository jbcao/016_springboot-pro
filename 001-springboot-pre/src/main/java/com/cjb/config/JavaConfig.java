package com.cjb.config;

import com.cjb.vo.Student;
import org.springframework.context.annotation.*;

@Configuration
@ImportResource(value = "classpath:beans.xml")
@PropertySource(value = "classpath:config.properties")
@ComponentScan(value = "com.cjb.vo")
public class JavaConfig {
    @Bean
    public Student createStudent(){
        Student student = new Student();
        student.setAge(23);
        student.setId(2);
        student.setName("jjj");
        return student;
    }
    @Bean(name="cjb")
    public Student createStudent1(){
        Student student = new Student();
        student.setAge(23);
        student.setId(2);
        student.setName("jjj");
        return student;
    }
}
