package com.bridglabz;

public class SumOfArray {
    public static void main(String[] args) {
        int [] Array={3,4,5,6,7,8,1};
        int sum=0;
        for(int i=0;i<Array.length;i++) {
            sum += Array[i];
        }
            System.out.println("sum of the all elements====>"+sum);
        }
    }

