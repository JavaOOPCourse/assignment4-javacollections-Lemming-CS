package service;

import model.Student;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void initializeStudents() {
        // TODO: Add at least 5 students
        students.add(new Student(1, "Nursultan", 3.5));
        students.add(new Student(2, "Nurbek", 1.8));
        students.add(new Student(3, "Aman", 3.9));
        students.add(new Student(4, "Jaina", 2.5));
        students.add(new Student(5, "Avtondil", 1.5));
    }

    public void removeLowGPA() {
        // TODO: Remove students with GPA < 2.0
        if (students.isEmpty()) {
            System.out.println("No students available");
            return;
        }

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getGpa() < 2.0) {
                iterator.remove();
            }
        }
    }

    public void findHighestGPA() {
        // TODO: Find and print student with highest GPA
        if (students.isEmpty()) {
            System.out.println("No students available");
            return;
        }
        Iterator<Student> iterator = students.iterator();
        Student top = students.get(0);;
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getGpa() > top.getGpa()) {
                top = s;
            }
        }
        System.out.println(top.toString());
    }


    public void insertAtIndex() {
        // TODO: Insert new student at index 2
        Student newStudent = new Student(6, "New Student", 3.2);

        if (students.size() >= 2) {
            students.add(2, newStudent);
        } else {
            students.add(newStudent);
        }
    }

    public void printStudents() {
        // TODO: Print using Iterator
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            System.out.println(s.toString());
        }
    }
}
