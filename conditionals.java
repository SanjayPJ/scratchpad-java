package com.example.learnjava;

public class conditionals {
    public static void main(String[] args) {

        //conditionals

        int accountBalance = 678;
        int purchaseMoney = 679;

        if(accountBalance < purchaseMoney){

            System.out.println("You cant purchase it you need " + (purchaseMoney - accountBalance) + "$ to purchase it");

        }else{
            System.out.println("You can purchase it.");
            System.out.println("Your balance is : " + (accountBalance - purchaseMoney));
        }

        boolean isPurchaseSuccessfull = true;
        boolean isHappy = false;

        System.out.println(isPurchaseSuccessfull + " " + isHappy);

    }
}
