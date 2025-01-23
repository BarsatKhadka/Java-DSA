package org.example.Recursion;

public class Recursion {

    //while the function is not finished executing , it will remain in the stack. So the main function in java is the first function to
    //get into stack and come out of stack

    //when a function is finished executing , it is removed from stack.

    public static void main(String[] args) {
        recursive_number(0);
    }

    static void recursive_number(int n) {
        //if there is no this check or no base condition then this will go in a endless loop because it will call itself again and again.
        if(n == 5){
            return;
        }
        System.out.println(n);
        recursive_number(n+1);


        // when function calls stack in the memory and it exceeds memory size , then it's stack overflow error.

    }
}
