package com.kh.dto;

public class 학생 {
    private String studentNumber;
    private String studentName;
    private char gender;

    public 학생(){}
    public 학생(String studentNumber, String studentName, char gender) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.gender = gender;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "학생{" +
                "studentNumber='" + studentNumber + '\'' +
                ", studentName='" + studentName + '\'' +
                ", gender=" + gender +
                '}';

    }
}
