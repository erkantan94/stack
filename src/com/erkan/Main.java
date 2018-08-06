package com.erkan;

public class Main {

    public static void main(String[] args) {
	// exampe stack
        Stack myStack = new Stack(4);
        char stackObj;

        myStack.push('1');
        myStack.push('2');
        myStack.push('3');
        myStack.push('4');

        //warning stack is full!
        myStack.push('5');

        while (!myStack.isEmpty()){
            stackObj = myStack.pop();
            System.out.println(stackObj);
        }

        //warning stack is empty
        stackObj = myStack.pop();

        System.out.println("a");
    }
}
