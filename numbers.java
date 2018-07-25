package com.example.learnjava;

public class numbers {
    public static void main(String[] args) {

        int num1 = 67;
        int num2 = 56;

        int sum = num1 + num2;
        int diff =  num1 - num2;
        int prod = num1 * num2;
        int quot = num1 / num2;

        System.out.println("the sum is " + sum);
        System.out.println("the diff is " + diff);
        System.out.println("the prod is " + prod);
        System.out.println("the quot is " + quot);

        System.out.println("the rem is " + num1 % num2);

        //32 bit storage
        float thisIsAFloat = 456.45f;

        //64 bit storage
        double thisIsADouble = 45.8;

        System.out.println(thisIsAFloat + thisIsADouble);

        //if need too big values

        long thisIsALong;

        Integer myInt = 45;

        String myString = myInt.toString();

        System.out.println(myString);





    }
}
