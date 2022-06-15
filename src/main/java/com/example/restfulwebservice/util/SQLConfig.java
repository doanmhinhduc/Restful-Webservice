package com.example.restfulwebservice.util;

public class SQLConfig {
    public static final String DATABASE_Employee_INSERT = "insert into employees ( name, price, quantity ) values (?,?,?)";
    public static final String DATABASE_Employee_SELECT = "select * from employees";
    public static final String DATABASE_Employee_UPDATE = "update product set name = ?, price = ? quantity = ? where id = ?";
}
