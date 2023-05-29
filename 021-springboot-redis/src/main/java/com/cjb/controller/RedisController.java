package com.cjb.controller;

import com.cjb.vo.Student;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RedisController {
    @Resource
    private RedisTemplate redisTemplate;
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @PostMapping("/redis/add")
    public String addToRedis(String name, String value) {
        redisTemplate.opsForValue().set(name, value);
        return name + " " + value;
    }

    @GetMapping("/get")
    public String getString(String key) {
        ValueOperations valueOperations = redisTemplate.opsForValue();
        Object o = valueOperations.get(key);
        return o.toString();
    }

    @PostMapping("/add2/{name}/{value}")
    public String addToRedis2(@PathVariable String name, @PathVariable String value) {
        stringRedisTemplate.opsForValue().set(name, value);
        return name + " " + value;
    }

    @GetMapping("/get2/{key}")
    public String getString2(@PathVariable String key) {
        ValueOperations valueOperations = stringRedisTemplate.opsForValue();
        Object o = valueOperations.get(key);
        return o.toString();
    }

    @PostMapping("/add3/{name}/{value}")
    public String addToRedis3(@PathVariable String name, @PathVariable String value) {
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new StringRedisSerializer());
        redisTemplate.opsForValue().set(name, value);
        return name + " " + value;
    }

    @PostMapping("/add")
    public Student add() {
        Student student = new Student();
        student.setId(10);
        student.setName("cjb");
        student.setAge(89);
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<>(Student.class));
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.opsForValue().set("mystudent", student);
        return student;
    }
    @GetMapping("/get3")
    public Student get2() {
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<>(Student.class));
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        Student mystudent = (Student) redisTemplate.opsForValue().get("mystudent");
        return mystudent;
    }

}
