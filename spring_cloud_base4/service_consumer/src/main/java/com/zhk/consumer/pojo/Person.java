package com.zhk.consumer.pojo;


import java.io.Serializable;


public class Person implements Serializable {

    private Integer pid;

    private String pname;

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                '}';
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }
}
