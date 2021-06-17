package com.company;

public class Student {
    private String name;
    private int age;

    public Student() {
        // + this() kalder den anden constructor
        this("Default name");
        System.out.println(this);

    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
