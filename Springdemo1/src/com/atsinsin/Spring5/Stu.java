package com.atsinsin.Spring5;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {
    private String[] course;
    private List<String> list;
    private Map<String,String> map;
    private Set<String> set;

    public void setCourse(String[] course) {
        this.course = course;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }
    public void add(){
        System.out.println(course);
        System.out.println(list);
        System.out.println(map);
        System.out.println(set);
    }
}
