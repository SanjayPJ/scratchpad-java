package com.example.learnjava;

import java.util.ArrayList;

public class array_list {
    public static void main(String[] args) {

        ArrayList name = new ArrayList();

        name.add("sam");
        name.add("Simon");
        name.add("james");

        System.out.println(name);

        System.out.println(name.get(0));

        name.remove("sam");

        System.out.println(name.get(0));


    }
}
