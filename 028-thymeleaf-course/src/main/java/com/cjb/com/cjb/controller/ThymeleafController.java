package com.cjb.com.cjb.controller;

import com.cjb.model.SysUser;
import com.cjb.vo.Cat;
import com.cjb.vo.Dog;
import com.cjb.vo.Zoo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
@RequestMapping("/tml")
public class ThymeleafController {
    @GetMapping("/expression1")
    public String fun1(Model model) {
        model.addAttribute("site", "www.baidu.com");
        model.addAttribute("myuser", new SysUser(001, "zhangsan", "m", 89));
        return "01_expression";
    }

    @GetMapping("/expression2")
    public String fun2(Model model) {
        model.addAttribute("site", "www.baidu.com");
        model.addAttribute("myuser", new SysUser(001, "zhangsan", "m", 89));
        return "01_expression2";
    }

    @GetMapping("/expression3")
    public String fun3(Model model) {
        model.addAttribute("stuId", 001);
        System.out.println(model.getAttribute("stuId"));
        return "01_expression3";
    }

    @GetMapping("/queryAccount")
    @ResponseBody
    public String queryAccount(Integer id) {
        return "queryAccount" + id;
    }

    @GetMapping("/queryUser")
    @ResponseBody
    public String queryUser(String name, Integer age) {
        return "queryUser,有两个参数" + name + age;
    }

    @GetMapping("/property")
    public String useProperty(Model model) {
        model.addAttribute("methodAttr", "post");
        model.addAttribute("paramname", "name");
        model.addAttribute("uservalue", "lisi");
        model.addAttribute("textcolor", "color:blue");
        return "02_property";
    }

    @GetMapping("/eachList")
    public String eachList(Model model) {
        List<SysUser> list = new ArrayList<>();
        list.add(new SysUser(1001, "刘备", "m", 20));
        list.add(new SysUser(1002, "关二", "m", 20));
        list.add(new SysUser(1003, "张三", "m", 20));
        list.add(new SysUser(1004, "赵云", "m", 20));
        list.add(new SysUser(1005, "黄忠", "m", 20));
        list.add(new SysUser(1006, "马超", "m", 20));
        model.addAttribute("myusers", list);
        return "03_eachlist";
    }

    @GetMapping("/eachArray")
    public String eachArray(Model model) {
        SysUser users[] = new SysUser[3];
        users[0] = new SysUser(1001, "账单", "man", 90);
        users[1] = new SysUser(1002, "账单", "man", 90);
        users[2] = new SysUser(1003, "账单", "man", 90);
        model.addAttribute("users", users);
        return "03_eacharray";
    }

    @GetMapping("/eachMap")
    public String eachMap(Model model) {
        Map<String, SysUser> map = new HashMap<>();
        map.put("u1", new SysUser(1001, "账单", "man", 90));
        map.put("u2", new SysUser(1001, "账单", "man", 90));
        map.put("u3", new SysUser(1001, "账单", "man", 90));
        model.addAttribute("mymap", map);

        //value为String类型的map
        Map<String, String> strMap = new HashMap<>();
        strMap.put("s1", "ste");
        strMap.put("s2", "ste");
        strMap.put("s3", "ste");
        model.addAttribute("strmap", strMap);

        List<Map<String, SysUser>> listMap = new ArrayList<>();
        Map<String, SysUser> map1 = new HashMap<>();
        map1.put("u1", new SysUser(1001, "账单", "man", 90));
        map1.put("u2", new SysUser(1001, "账单", "man", 90));
        map1.put("u3", new SysUser(1001, "账单", "man", 90));
        listMap.add(map);
        listMap.add(map1);

        model.addAttribute("lm", listMap);

        return "03_eachmap";
    }

    @GetMapping("/ifunless")
    public String ifunless(Model model) {
        model.addAttribute("sex", "m");
        model.addAttribute("age,20");
        model.addAttribute("name", "");
        model.addAttribute("isOld", null);
        model.addAttribute("isLogin", true);
        return "04_ifunless";
    }

    //switch使用
    @GetMapping("/switch")
    public String doswitch(Model model) {
        model.addAttribute("sex", "m");
        return "05_switch";
    }

    //内联
    @GetMapping("/inline")
    public String inline(Model model) {
        model.addAttribute("sex", "m");
        model.addAttribute("age", 20);
        model.addAttribute("name", "张三");
        model.addAttribute("myuser", new SysUser(1005, "周峰", "男", 20));
        return "06_inline";
    }

    //    字面量
    @GetMapping("/text")
    public String text(Model model) {
        model.addAttribute("sex", "m");
        model.addAttribute("age", 20);
        model.addAttribute("name", "张三");
        model.addAttribute("city", "北京");
        model.addAttribute("isLogin", true);
        model.addAttribute("myuser", new SysUser(1005, "周峰", "男", 20));
        return "07_text";
    }

    //字符串连接
    @GetMapping("/strjoin")
    public String strJoin(Model model) {
        model.addAttribute("sex", "m");
        model.addAttribute("age", 20);
        model.addAttribute("name", "张三");
        model.addAttribute("city", "北京");
        model.addAttribute("isLogin", true);
        model.addAttribute("myuser", new SysUser(1005, "周峰", "男", 20));
        return "08_strjoin";
    }

    //    运算符使用
    @GetMapping("/ysf")
    public String ysf(Model model) {
        model.addAttribute("sex", "m");
        model.addAttribute("age", 20);
        model.addAttribute("name", "张三");
        model.addAttribute("city", "北京");
        model.addAttribute("isLogin", true);
        model.addAttribute("myuser", null);
        return "09_ysf";
    }

    //    模板基本对象
    @GetMapping("/baseObject")
    public String baseObject(Model model, HttpServletRequest request, HttpSession session) {
        model.addAttribute("myname", "李四");
        request.setAttribute("requestdata", "request data");
        request.getSession().setAttribute("sessiondata", "session data");
        session.setAttribute("loginname", "zhangsan");
        return "10_baseObject";
    }

    @GetMapping("/utilobject")
    public String utilObject(Model model) {
        model.addAttribute("mydate", new Date());
        model.addAttribute("mynum", 26.695);
        model.addAttribute("mystr", "bjpowernode");

        List<String> list = Arrays.asList("a", "b", "c");
        model.addAttribute("mylist", list);

//        创建zoo对象
        Zoo zoo = new Zoo();
        Cat cat = new Cat();
        cat.setName("tom");
        Dog dog = new Dog();
        dog.setName("doggy");
        zoo.setCat(cat);
        zoo.setDog(dog);
        model.addAttribute("zoo", zoo);
        return "11_utilobject";

    }

    @GetMapping("/customtpl")
    public String customTemplate() {
        return "12_customtpl";
    }

}
