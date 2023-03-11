/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

    public static void main(String[] args) {

        Student std1 = new Student("James", 20);

        Student std2 = new Freshman("James", 20, 12); // name, age, credits

        Student std3;
        try {
            std3 = new Senior("John", 30, 90);
        } catch (Exception ex) {
            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
        }

        // ToDo 11: Set the gpa of the student using the scanner and user
        // 			input and then print the output.
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter student 1's GPA");
        scnr.nextInt();

        System.out.println(std1);

        System.out.println(std2);

        System.out.println(std3);

        // ToDo 12: add comments and explain your code
        // ToDo 13: submit using a pull request.
    }

}
