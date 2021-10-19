package com.proxy;

import com.company.Person;

public class StudentProxy implements Teacher{
    Student student;

    public StudentProxy(Teacher stu){
        if(stu.getClass() == Student.class){
            this.student = (Student) stu;
        }
    }


    @Override
    public void getMoney() {
        System.out.println("先交个20元");
        student.getMoney();
    }
}
