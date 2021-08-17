package com.yash.collectionassignment.exception;

public class EmployeeAbsentException extends Exception {
    @Override
    public String toString() {
        return "Employee does not exists";
    }
}
