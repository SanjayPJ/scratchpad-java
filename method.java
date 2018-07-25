package com.example.learnjava;

public class method {
    public static void main(String[] args) {
        callMe();
        printArea(45,67);
        int area = getArea(89, 45);
        System.out.println("Area is : " + area);
    }

    public static void callMe(){
        System.out.println("Hey its me Sanjay PJ");
    }

    public static void printArea(int length, int width){
        System.out.println("Area is : " + (length * width));
    }

    public static int getArea(int length, int width){
        return length * width;
    }
}
