package com.kh.practice7.model.vo;

public class Student {

    private String name;
    private String className;
    private int points;

    public Student() {
    }

    public Student(String name, String className, int points) {
        this.name = name;
        this.className = className;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", points=" + points +
                '}';
    }
}
