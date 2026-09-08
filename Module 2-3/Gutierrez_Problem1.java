/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author new user
 */
import java.util.Scanner;
public class Gutierrez_Problem1 {
     public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       String foodItem = scanner.nextLine();
       String category = scanner.nextLine();
       double price = scanner.nextDouble();
       int servingSize = scanner.nextInt();
        
        System.out.printf("Item: %s; Category: %s; Price: PHP %.1f; Serving Size: %d%n", foodItem, category,  price, servingSize);
        
        scanner.close();
     }
}
