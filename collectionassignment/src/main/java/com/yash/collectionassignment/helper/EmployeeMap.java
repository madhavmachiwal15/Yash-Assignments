package com.yash.collectionassignment.helper;

import java.util.HashMap;
import java.util.Objects;

import com.yash.collectionassignment.pojo.Employee;

public class EmployeeMap {
    private static HashMap<String, Employee> employeeMap;

    private EmployeeMap(){
    }

    public static HashMap<String, Employee> getEmployeeMap(){
        if (Objects.isNull(employeeMap))
        {
            employeeMap = new HashMap<>();
        }
        return employeeMap;
    }
}
