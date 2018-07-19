package com.company;
import static java.lang.System.out;
import java.util.Scanner;

public class sandwichShop {
    public static void main(String[] args)   {
        Scanner keyboard = new Scanner(System.in);
        int veggieGoal = 50;
        int burgerGoal = 250;
        int subsGoal = 180;
        int soupGoal = 70;

        out.println("Checking sales goals.");

        out.println("\nThe sales goal for veggie sandwiches is " + veggieGoal + '.');
        out.println("How many veggie sandwiches were sold today?");
        int veggieSold = keyboard.nextInt();
        boolean veggieGoalMade = (veggieSold >= veggieGoal);
        if (veggieGoalMade) {
            out.println("Made goal for Veggie Sandwiches.");
        }
        else {
            out.println("Fell short.");
        }

        out.println("\nThe sales goal for burgers is " + burgerGoal + '.');
        out.println("How many burgers were sold today?");
        int burgerSold = keyboard.nextInt();
        boolean burgerGoalMade = (burgerSold >= burgerGoal);
        if (burgerGoalMade) {
            out.println("Made goal for Burgers.");
        }
        else {
            out.println("Fell short.");
        }

        out.println("\nThe sales goal for subs is " + subsGoal + '.');
        out.println("How many subs were sold today?");
        int subsSold = keyboard.nextInt();
        boolean subsGoalMade = (subsSold >= subsGoal);
        if (subsGoalMade) {
            out.println("Made goal for subs.");
        }
        else {
            out.println("Fell short.");
        }

        out.println("\nThe sales goal for soup is " + soupGoal + '.');
        out.println("How many soups were sold today?");
        int soupSold = keyboard.nextInt();
        boolean soupGoalMade = (soupSold >= soupGoal);
        if (soupGoalMade) {
            out.println("Made goal for soup.");
        }
        else {
            out.println("Fell short.");
        }

        if (veggieGoalMade && burgerGoalMade && subsGoalMade && soupGoalMade) {
            out.println("\n \nMade goal for everything!");
        }
        }

    }




