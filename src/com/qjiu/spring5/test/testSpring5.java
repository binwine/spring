package com.qjiu.spring5.test;

import com.qjiu.spring5.Book;
import com.qjiu.spring5.Orders;
import com.qjiu.spring5.User;
import com.qjiu.spring5.bean.Emp;
import com.qjiu.spring5.bean.MyBean;
import com.qjiu.spring5.collectiontype.Course;
import com.qjiu.spring5.collectiontype.Stu;
import com.qjiu.spring5.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class testSpring5 {

    @Test
    public void test1() {
        // 1.加载spring配置文件
        ApplicationContext context = // 在src目录下使用
                new ClassPathXmlApplicationContext("spring-config.xml");
        // 2.获取配置创建的对象默认加载无参构造函数完成创建
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.toString();

    }

    @Test
    /**
     * 注入属性 使用property
     */
    public void test2() {
        // 1.加载spring配置文件
        ApplicationContext context = // 在src目录下使用
                new ClassPathXmlApplicationContext("spring-config.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book.toString());
    }

    @Test
    /**
     * 注入属性 使用 有参构函数
     */
    public void test3() {
        // 1.加载spring配置文件
        ApplicationContext context = // 在src目录下使用
                new ClassPathXmlApplicationContext("spring-config.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders.toString());
    }

    @Test
    /**
     * 测试外部bean
     */
    public void test4() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();

    }

    @Test
    /**
     * 测试内部bean
     */
    public void test5() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp.toString());
    }

    @Test
    public void test6() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");
        Stu stu = context.getBean("stu", Stu.class);
        System.out.println(stu.toString());
    }

    @Test
    public void test7() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        Course mybean = context.getBean("mybean", Course.class);
        System.out.println(mybean);
    }
    @Test
    public void test8() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        System.out.println(list.toString());
    }
}
