package com.javarush.test.level29.lesson15.big01.human;


import java.util.ArrayList;
import java.util.List;


public class University {
    private List<Student> students = new ArrayList<>();
    private String name;
    private int age;

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        Student resoult = null;
        for (Student student : students) {
            if (student.getAverageGrade() == averageGrade) {
                resoult = student;
                break;
            }
        }
        return resoult;
    }

    public Student getStudentWithMaxAverageGrade() {
        double maxAverage = -1;
        Student resoult = null;
        for (Student student : students) {
            if (student.getAverageGrade() > maxAverage) {
                maxAverage = student.getAverageGrade();
            }
        }

        for (Student student : students) {
            if (student.getAverageGrade() == maxAverage) {
                resoult = student;
                break;
            }
        }
        return resoult;
    }

    public Student getStudentWithMinAverageGrade() {
        double averageGrade = Double.MAX_VALUE;
        Student resoult = null;
        for (Student student : students) {
            if (student.getAverageGrade() < averageGrade) {
                averageGrade = student.getAverageGrade();
            }
        }
        for (Student student : students) {
            for (Student student1 : students) {
                if (student1.getAverageGrade() == averageGrade) {
                    resoult = student1;
                    break;
                }
            }
        }
        return resoult;
    }


    public void expel(Student student) {
        students.remove(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}