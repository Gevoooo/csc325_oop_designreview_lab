/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {
        // Todo 7: Create two classes for Freshman and Senior 

        // ToDo 8: The senior class should have a minimum of 85 credits  

        // ToDo 7: Add a toString method for Student class
        // ToDo 9: Add a toString method for Freshman class

        Student std1= new Student("James", 20);
        // ToDo 10: Add a toString method for Senior class

        Freshman std2= new Student("James", 20, 12); // name, age, credits

        Senior std3 = new Student("John", 30, 90);

        // ToDo 8: Set the gpa of the student using the scanner and user
        // ToDo 11: Set the gpa of the student using the scanner and user
        // 			input and then print the output.

        System.out.println(std1);

        System.out.println(std2);
        
        System.out.println(std3);

        // ToDo 9: add comments and explain your code
        // ToDo 12: add comments and explain your code

        // ToDo 10: submit using a pull request.
        // ToDo 13: submit using a pull request.
    }

}

