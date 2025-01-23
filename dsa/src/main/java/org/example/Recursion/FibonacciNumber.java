package org.example.Recursion;

public class FibonacciNumber {
    public static void main(String[] args) {
       System.out.println(fibonacciKemonachi(10));
    }

    static int fibonacciKemonachi(int n) {
        if(n==0 || n==1){
            return n;
        }


       return fibonacciKemonachi(n-1) + fibonacciKemonachi(n-2);
    }
}

