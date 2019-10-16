package com.myself.pojo;

/**
 * @program: SpringPlusMybatis
 * @author: 吴小龙
 * @create: 2019-10-15 20:48
 * @description: 类别，包含id和name
 */

public class Category {
    private int id;
    private String name;

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
