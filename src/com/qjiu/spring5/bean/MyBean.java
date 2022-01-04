package com.qjiu.spring5.bean;

import com.qjiu.spring5.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 *
 */
public class MyBean implements FactoryBean<Course> {

    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("abc");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
