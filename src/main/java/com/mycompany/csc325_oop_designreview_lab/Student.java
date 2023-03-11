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
    
    protected int gpa;
    /**
     * Constructor with name and age
     * @param name
     * @param age 
     */
    public Student(String name, int age) {
        super(name, (short)age);
        gpa = 0;
        address = "";
    }
    
    /**
     * Gets the address.
     * @return 
     */
    @Override
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address.
     * @param address 
     */
    @Override
    public void setAddress(String address) {
        this.address = address;
    }
    
    /**
     * Gets the GPA
     * @return 
     */
    public int getGPA() {
        return this.gpa;
    }

    /**
     * Sets GPA
     * @param gpa 
     */
    public void setGPA(int gpa) {
        this.gpa = gpa;
    }
}
