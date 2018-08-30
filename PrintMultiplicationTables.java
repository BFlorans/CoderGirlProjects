package com.company;
import static java.lang.System.out;
import java.util.Scanner;
public class PrintMultiplicationTables {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        out.println("Welcome to Multiplication Tables");
        out.println("\nHow large would you like to see them?\n");
        int size = keyboard.nextInt();
        for (int firstNumber = 0; firstNumber<=size; firstNumber++){
            for (int secondNumber = 0; secondNumber<=size; secondNumber++){
                out.println(firstNumber + " x " + secondNumber + " = " + (firstNumber*secondNumber));
            }
        }
    }

}
