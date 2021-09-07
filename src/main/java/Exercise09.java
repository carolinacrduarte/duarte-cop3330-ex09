/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carolina Duarte
 */

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Length: ");
        String length = input.nextLine(); //Reads the length input.
        System.out.print("Width: ");
        String width = input.nextLine(); //Reads the width input.

        int i = Integer.parseInt(length); //Converting string into int.
        int j = Integer.parseInt(width);
        int k = i*j; //Area m2 calculation.
        double c = 350; //One gallon covers 350 m2.
        double g = k/c; //Calculating the amount of gallons needed.
        double r = Math.ceil(g); //Rounding to the next whole number.

        System.out.print("You will need to purchase " + r + " gallons of paint to cover " + k + " square feet.");








    }
    }
