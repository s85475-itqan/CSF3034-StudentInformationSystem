/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


// Declares the package for the student profile program. 
package studentinformationsystem;
/********************************************************
 * Author: Itqan Najihah Binti Ismail
 * Program Name: StudentInformationSystem.Java
 * Description: To 
 * Date: 28 October 2026
 * Modified Date: None
 * Version: 1.0
 ********************************************************/
// Declare the public class named 'StudentInformationSystem' which matches the filename
public class StudentInformationSystem {

    // The main method : the entry point where the program starts execution
    public static void main(String[] args) {
        // addition output
        System.out.println("Status: Active Student");
        // Declare variables to correct data type
        String name = "Itqan Najihah Binti Ismail";
        String studentID = "S85475";
        double mark1 = 45.0;
        double mark2 = 42.5;
        double total = mark1 + mark2 ;
        // To display the output or message
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentID);
        System.out.println("Total Mark: " + total);
        // create a condition for selection process
        // Updated version
        if (total >= 80) {
            System.out.println("Result: Excellent! (Grade A)");
        } else if (total >= 60) {
            System.out.println("Result: Good! (Grade B)");
        } else {
            System.out.println("Result: Needs Improvement. (Grade F)");
        }
    } // end of main method 
    
} // end of the StudentInformationsystem class




