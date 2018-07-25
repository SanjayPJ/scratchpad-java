package com.example.learnjava;

public class Strings {
    public static void main(String[] args) {

        //initializing variable
        String vehicle;

        //declaring variables
        vehicle = "Lambo";

        //System.out.println(vehicle);

        String model = "s34";

        String make = "HERA";

        String fullDetails = vehicle + " - " + model + " - " + make;

        System.out.println(fullDetails);

        String upper = "LITTLE BEAST!!!";

        //tolowercase method is used to convert it into lowercase
        String lower = upper.toLowerCase();

        System.out.println(lower);

        //touppercase is used to convert it into uppercase
        String lowerToUpper = lower.toUpperCase();

        System.out.println(lowerToUpper);

        //System.out.println(lower);

        int accountBalance = 500;

        String printAccountBalance = String.format("Account balance is %d", accountBalance);

        System.out.println(printAccountBalance);






    }
}
