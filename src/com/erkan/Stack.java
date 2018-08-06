package com.erkan;

public class Stack {

    private char [] myStack;
    private int top;
    private int maxSize;

    public Stack(int size) {
        this.myStack  = new char[size];
        maxSize = size-1;
        top = -1;
    }

    public void push(char obj){
        if(!isFull())
            myStack[++top] = obj;
        else
            System.out.println("Stack is full!");
    }

    public char pop(){
        if(!isEmpty())
            return myStack[top--];
        else{
            System.out.println("Stack is empty!");
            return 0;
        }
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
        return top==maxSize;
    }
}
