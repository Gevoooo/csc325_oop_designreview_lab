/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author main
 */
public class Senior extends Student{
    
    private int credits;
    
    public Senior(String name, int age, int credits) {
        super(name, (short)age);
        if (credits < 85)
            System.out.println("Error: Credits must be 85 or above.");
        else
            this.credits = credits;
    }
    public String toString() {
        return "Senior{" + "name=" + this.getName() + ", age=" + this.getAge() + ", address=" + this.getAddress() + ", gpa=" + gpa + ", credits=" + credits + '}';
    }
}
