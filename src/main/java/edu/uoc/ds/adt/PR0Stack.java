package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Stack;
import edu.uoc.ds.adt.sequential.StackArrayImpl;

public class PR0Stack {
    public final int CAPACITY = 37;

    private Stack<Double> stack;

    public PR0Stack() {
        newStack();
    }

    public void newStack() {
        stack = new StackArrayImpl<Double>(CAPACITY);
    }


    public String clearAllStack() {
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.append(stack.pop().toString().replace(".0","")).append(" ");
        return sb.toString().replace('.', ',');
    }

    public Stack<Double> getStack() {
        return this.stack;
    }

    public void push(Double c) {
        this.stack.push(c);
    }
}
