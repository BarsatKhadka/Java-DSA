package org.example.Recursion;

public class Recursion {

    //while the function is not finished executing , it will remain in the stack. So the main function in java is the first function to
    //get into stack and come out of stack

    //when a function is finished executing , it is removed from stack.

    public static void main(String[] args) {
        recursive_number(0);
    }

    static void recursive_number(int n) {
        if(n == 5){
            return;
        }
        System.out.println(n);
        recursive_number(n+1);

    }
}
