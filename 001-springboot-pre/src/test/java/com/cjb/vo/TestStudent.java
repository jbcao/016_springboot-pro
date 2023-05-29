package com.cjb.vo;

import com.cjb.config.JavaConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestStudent {
    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) applicationContext.getBean("myStudent");
        System.out.println(student);
    }
    @Test
    public void test02(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        Student student = (Student) applicationContext.getBean("createStudent");
        System.out.println(student);

    }
    @Test
    public void test03(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        Student student = (Student) applicationContext.getBean("cjb");
        System.out.println(student);

    }
    @Test
    public void test04(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
       Cat cat = (Cat) applicationContext.getBean("tomcat");
        System.out.println(cat);
    }
    @Test
    public void test05(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        Tiger tiger = (Tiger) applicationContext.getBean("tiger");
        System.out.println(tiger);
    }
}
