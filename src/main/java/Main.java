import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Strickland
 */
public class Main {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            int numPeople, numPizzas, slices = 0;
            System.out.print("How many people? ");
            numPeople = scan.nextInt();
            System.out.print("How many pizzas do you have? ");
            numPizzas = scan.nextInt();
            System.out.print("How many slices per pizza? ");
            slices = scan.nextInt();
            // calc slices per person
            int totalSlices = slices * numPizzas;
            int slicesPP = (numPeople == 0) ? 0 : (totalSlices / numPeople);
            int leftOver = totalSlices % numPeople;
            System.out.println(String.format("%s people with %s pizzas (%s slices)", numPeople, numPizzas, totalSlices));
            System.out.println(String.format("Each person gets %s pieces of pizza.\nThere are %s leftover pieces.", slicesPP, leftOver));
            scan.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
