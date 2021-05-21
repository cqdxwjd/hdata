package com.yunli.test.entity;

/**
 * @author wangjingdong
 * @date 2021/5/16 09:09
 * @Copyright © 云粒智慧 2018
 */
public class Student {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
