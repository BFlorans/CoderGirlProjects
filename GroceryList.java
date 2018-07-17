package com.company;

import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList {

    public static void main(String[] args) {
	Scanner keyboard = new Scanner (System.in);

	out.println("Please name 3 things on your grocery list.");
    out.println("Item 1?");
	String itemOne = keyboard.nextLine();
	out.println("Item 2?");
	String itemTwo = keyboard.nextLine();
	out.println("Item 3?");
	String itemThree = keyboard.nextLine();

	out.println("Now, please enter the quantity of each item.");
	out.println("How many " + itemOne + "?");
	int itemOneQuantity = keyboard.nextInt();
	//keyboard.skip("\n");
	out.println("How many " + itemTwo + '?');
	int itemTwoQuantity = keyboard.nextInt();
	//keyboard.skip("\n");
	out.println("How many " + itemThree + '?');
	int itemThreeQuantity = keyboard.nextInt();

	out.println("Now, please enter the price of each item.");
	out.println("How much does one " + itemOne + " cost?");
	float itemOnePrice = keyboard.nextFloat();
	//keyboard.skip("\n");
	out.println("How much does one " + itemTwo + " cost?");
	float itemTwoPrice = keyboard.nextFloat();
	//keyboard.skip("\n");
	out.println("How much does one " + itemThree + " cost?");
	float itemThreePrice = keyboard.nextFloat();

	out.println("Calculating your grocery bill...");

	float totalBill = (itemOneQuantity * itemOnePrice) + (itemTwoQuantity * itemTwoPrice) + (itemThreeQuantity * itemThreePrice);

	out.println("Your total bill will be " + totalBill);

    }
}
