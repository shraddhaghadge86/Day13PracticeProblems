package com.bridgelabz.day13generics;

public class Generics {
    static void max_variables(Float num1, Float num2, Float num3){
        if(num1.compareTo(num2) > 0){
            if(num1.compareTo(num3) > 0){
                System.out.println( num1 + " is Maximum of three float numbers ");
            }else {
                System.out.println( num3 + " is Maximum of three float numbers ");
            }
        }else{
            if(num2.compareTo(num3) > 0){
                System.out.println( num2 + " is Maximum of three float numbers ");
            }else{
                System.out.println( num3 + " is Maximum of three float numbers ");
            }
        }
    }

    public static void main(String[] args) {
        max_variables(5.8f, 7.3f,3.9f);
    }

}
