package com.learn.attendancemanagementsystem.composite;


import com.learn.attendancemanagementsystem.composite.model.Department;
import com.learn.attendancemanagementsystem.composite.model.Employee;

public class Main {
    public static void main(String[] args) {

       Employee e1 = new Employee("علی", 8.5);
        Employee e2 = new Employee("سارا", 7.0);

        Department team1 = new Department("تیم برنامه نویسی");
        team1.add(e1);
        team1.add(e2);

        Department totalCompany = new Department("کل شرکت");
        totalCompany.add(team1);

        System.out.println("ساعت کاری تیم برنامه نویسی: " + team1.getTotalHoursWorked());
        System.out.println("ساعت کاری کل شرکت: " + totalCompany.getTotalHoursWorked());

    }
}
