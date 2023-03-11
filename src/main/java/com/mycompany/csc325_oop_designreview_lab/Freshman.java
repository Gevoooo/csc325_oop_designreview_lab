/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author main
 */
public class Freshman extends Student{
    
    private int credits;
    
    public Freshman(String name, int age, int credits) {
        super(name, (short)age);
        this.credits = credits;
    }
    
    public String toString() {
        return "Freshman{" + "name=" + this.getName() + ", age=" + this.getAge() + ", address=" + this.getAddress() + ", gpa=" + gpa + ", credits=" + credits + '}';
    }
}
