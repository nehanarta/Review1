package com.bridglabz;

public class FactorialNum {
    public static void main(String[] args) {
        int fact=1;
        int n=5;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of 5 is ===>"+fact);
    }
}
