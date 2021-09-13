package com.yash.reststudent11.serviceimpl;

import java.util.ArrayList;

import java.util.List;
import java.util.Collection;

import com.yash.reststudent11.model.Student;
import com.yash.reststudent11.service.*;
public class StudentServiceImpl implements StudentService 
{
    ArrayList<Student> stud=students();

    @Override
    public List<Student> addStudent(Student st) {
        stud.add(st);
        
        return stud;
    }

    public ArrayList<Student> students()
    {
        ArrayList<Student> stud1=new ArrayList<Student>();
        stud1.add(new Student(1,"Allen","Indore"));
        stud1.add(new Student(2,"alex","Pune"));
        stud1.add(new Student(3,"Robert","Hyd"));

        return stud1;
    }
    
    @Override
    public List<Student> getAllStudents() {
        return null;
        // TODO Auto-generated method stub

    }

    @Override
    public ArrayList<Student> updateStudent(Student student) {
        // TODO Auto-generated method stub
        int id=student.getId();
        for (Student student2 : stud) {
            if (student2.getId()==id) {
                stud.remove(student2);
                break;
            }

        }
        stud.add(student);
        return stud;
    }

    @Override
    public ArrayList<Student> deleteStudent(Student student) {
        int id=student.getId();
        for (Student student2 : stud) {
            if (student2.getId()==id) {
                stud.remove(student2);
                break;
            }

        }
        return stud;
    }

}