package com.bridgelabz.day13generics;

public class Generics <T extends Comparable> {
    T var1;
    T var2;
    T vare3;

    Generics(T var1, T var2, T var3){
        this.var1 = var1;
        this.var2 = var2;
        this.vare3 = var3;
    }

    void max_variables(){
        if(this.var1.compareTo(this.var2) > 0){
            if(this.var1.compareTo(this.vare3) > 0){
                System.out.println( this.var1 + " is Maximum of three variables");
            }else {
                System.out.println( this.vare3 + " is Maximum of three variables ");
            }

        }else{
            if(this.var2.compareTo(this.vare3) > 0){
                System.out.println( this.var2 + " is Maximum of three variables ");
            }else{
                System.out.println( this.vare3 + " is Maximum of three variables ");
            }

        }
    }
    public static void main(String[] args) {
        Generics<Integer> obj1 = new Generics(85, 10, 71);
        obj1.max_variables();

        Generics<String> obj2 = new Generics("pineapple", "Mango","banana");
        obj2.max_variables();

        Generics<Float> obj3 = new Generics(6.8f, 9.0f, 8.5f);
        obj3.max_variables();
    }
}
