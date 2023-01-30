package com.bridgelabz.day13generics;

public class Generics {
    static void max_variables(String str1, String str2, String str3){
        if(str1.compareTo(str2) > 0){
            if(str1.compareTo(str3) > 0){
                System.out.println( str1 + " is Maximum of three strings ");
            }else {
                System.out.println( str3 + " is Maximum of three strings ");
            }
        }else{
            if(str2.compareTo(str3) > 0){
                System.out.println( str2 + " is Maximum of three strings ");
            }else{
                System.out.println( str3 + " is Maximum of three strings ");
            }
        }
    }

    public static void main(String[] args) {
        max_variables("Apple", "Peach", "Banana");
    }

}
