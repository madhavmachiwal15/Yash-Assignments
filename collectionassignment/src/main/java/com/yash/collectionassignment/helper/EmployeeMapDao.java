package com.yash.collectionassignment.helper;


import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.yash.collectionassignment.exception.EmployeeAbsentException;
import com.yash.collectionassignment.pojo.Employee;


public class EmployeeMapDao {

    public static Employee addEmployeeToMap(Employee employee) {
        return EmployeeMap.getEmployeeMap().put(employee.getId(), employee);
    }

    public static HashMap<String, Employee> getEmployeeMap() {
        return EmployeeMap.getEmployeeMap();
    }

    public static int getNumberOfEmployees() {
        return EmployeeMap.getEmployeeMap().size();
    }

    public static boolean isEmployeeMapEmpty() {
        return EmployeeMap.getEmployeeMap().isEmpty();
    }

    public static boolean doesEmployeeKeyExists(String key) {
        return EmployeeMap.getEmployeeMap().containsKey(key);
    }

    public static List<Employee> getEmployeeByName(String name) throws EmployeeAbsentException {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : EmployeeMap.getEmployeeMap().values()) {
            if ((employee).getName().equals(name)) {
                result.add(employee);
            }
        }
        if (!result.isEmpty()) 
        {
            return result;
        } 
        else
        {
            throw new EmployeeAbsentException();
        }
    }

    public static Employee fetchEmployeeByKey(String key) throws EmployeeAbsentException {
        if (doesEmployeeKeyExists(key)) {
            return EmployeeMap.getEmployeeMap().get(key);
        }
        throw new EmployeeAbsentException();
    }

    public static Employee fetchEmployeeByValue(Employee employee) throws EmployeeAbsentException {
        if (EmployeeMap.getEmployeeMap().containsValue(employee)) {
            return EmployeeMap.getEmployeeMap().get(employee.getId());
        }
        throw new EmployeeAbsentException();
    }

    public static void serializeMap() throws EmployeeAbsentException {
        HashMap<String, Employee> employeeMap = EmployeeMap.getEmployeeMap();
        if (isEmployeeMapEmpty()) {
            throw new EmployeeAbsentException();
        }
        try {
            FileOutputStream fileOutStream
                    = new FileOutputStream(
                    "data/data.ser");

            ObjectOutputStream objectOutStream
                    = new ObjectOutputStream(fileOutStream);

            objectOutStream.writeObject(employeeMap);

            objectOutStream.close();
            fileOutStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static HashMap<String, Employee> deSerializeMap() {
        HashMap<String, Employee> employeeMap;
        try {
            FileInputStream fileInput = new FileInputStream(
                    "data/data.ser");

            ObjectInputStream objectInput
                    = new ObjectInputStream(fileInput);

            employeeMap = (HashMap) objectInput.readObject();

            objectInput.close();
            fileInput.close();
        } catch (IOException obj1) {
            obj1.printStackTrace();
            return null;
        } catch (ClassNotFoundException obj2) {
            System.out.println("Class not found");
            obj2.printStackTrace();
            return null;
        }

        for (Employee employee : employeeMap.values()) {
            addEmployeeToMap(employee);
        }
        return getEmployeeMap();

    }

    public static void displayEmployeeMap(){
        HashMap<String, Employee> employeeMap = EmployeeMap.getEmployeeMap();
        System.out.println("***********************************");
        displayNumberOfEmployees();
        for(Employee employee : employeeMap.values()){
            System.out.println(employee.toString());
        }
        System.out.println("-----------------------------------");
    }

    public static void displayNumberOfEmployees(){
        System.out.println("Number of Employees: " + getNumberOfEmployees());
    }

}
