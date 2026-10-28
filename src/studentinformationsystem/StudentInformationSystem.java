/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;

/**
 *
 * @author HUAWEI
 */
public class StudentInformationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String name = "Itqan Najihah Binti Ismail";
        String studentID = "S85475";
        double mark1 = 45.0;
        double mark2 = 42.5;
        double total = mark1 + mark2 ;
        
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentID);
        System.out.println("Total Mark: " + total);
        
        if (total >= 80) {
            System.out.println("Result: Excellent!");
        } else if (total >= 60) {
            System.out.println("Result: Good!");
        } else {
            System.out.println("Result: Needs Improvement.");
        }
    }
    
}
