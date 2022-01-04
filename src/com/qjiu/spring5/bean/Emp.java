package com.qjiu.spring5.bean;

/**
 * 员工类
 */
public class Emp {

    private String eName;

    private String gender;

    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eName='" + eName + '\'' +
                ", gender='" + gender + '\'' +
                ", dept=" + dept +
                '}';
    }
}
