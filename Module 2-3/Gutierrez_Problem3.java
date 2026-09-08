/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author new user
 */
import java.util.Scanner;
public class Gutierrez_Problem3 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double price = scanner.nextDouble();
        int quantity = scanner.nextInt();
        
        double subtotal = price * quantity;
        double vat = subtotal * 0.12;
        double total  = subtotal + vat;
        
        System.out.println("Subtotal: "+ subtotal);
        System.out.println("VAT: "+ vat);
        System.out.println("Total: "+ total);
        
        scanner.close();
    }
}
