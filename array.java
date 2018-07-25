package com.example.learnjava;

public class array {
    public static void main(String[] args) {
        String name[] = {
                "Sanjay PJ",
                "Nikhil James",
                "Arpith Bailju",
        };
        System.out.println(name[2]);
        System.out.println("Length of the name array is : " + name.length);

        String yourName = "Aromal Manav";

        System.out.println(yourName);

        String lastPerson = name[name.length - 1];

        System.out.println(lastPerson);


    }
}
