package model.service;

import model.data.Student;
import model.data.Teacher;

import java.util.ArrayList;
import java.util.Calendar;


public interface DataService {
    Student createStudent (String name, String lastName, Calendar birthday);
    Teacher createTeacher (String name, String lastName, Calendar birthday);

    ArrayList<Teacher> getTeacherList();
    ArrayList<Student> getStudentList();
}
