/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human{
    
    private String address;
    private int gpa;
    
    public Student(String name, short age) {
        super(name, age);
        address = "";
    }
    
    public Student(String name, short age, int gpa) {
        super(name, age);
        this.gpa = gpa;
        address = "";
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }
    
    public int getGPA() {
        return gpa;
    }

    public void setGPA(int gpa) {
        this.gpa = gpa;
    }
	// ToDo 4: Add comments to your code
}
