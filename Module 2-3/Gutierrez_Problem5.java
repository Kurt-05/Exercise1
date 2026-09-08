/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author new user
 */
import java.util.Scanner;
public class Gutierrez_Problem5 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        double quiz = scanner.nextDouble();
        double project = scanner.nextDouble();
        double exam = scanner.nextDouble();

        double finalGrade = (quiz * 0.30) + (project * 0.30) + (exam * 0.40);
        System.out.printf("Final Grade: %.1f%n", finalGrade);
 
       scanner.close();
        }
    
    
   
}
