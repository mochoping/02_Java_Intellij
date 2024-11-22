package com.kh.oop.constructor;

public class Student {    // 이름 나이 성별 전공 학점 전화번호 이메일주소
    private String name;
    private int age;
    private String gender;
    private String major;
    private double gpa;
    private String phoneNumber;
    private String email;
    private String address;
    public Student() {}
    public Student(String name, int age, String gender, String major, double gpa, String phoneNumber, String email, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.major = major;
        this.gpa = gpa;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", major="
                + major + ", gpa=" + gpa + ", phoneNumber=" + phoneNumber + ", email=" + email
                + ", address=" + address + "]";
    }
}
