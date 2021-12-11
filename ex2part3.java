/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author ryanh
 */
public class ex2part3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        //3.Write a program that allows the user to enter 2 numbers, subtracts the smaller number from the bigger number and displays the result.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first number here");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter second number here");
        int num2 = scanner.nextInt();
        
        int num3 = num1 - num2;
        
        System.out.println(num3);
    }
}
