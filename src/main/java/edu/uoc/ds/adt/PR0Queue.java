package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.adt.sequential.QueueArrayImpl;

public class PR0Queue {

    public final int CAPACITY = 37;

    private Queue<Double> queue;

    public PR0Queue() {
        newQueue();
    }
    public void newQueue() {
        queue = new QueueArrayImpl<>(CAPACITY);
    }


    public String clearFullQueue() {
        StringBuilder sb = new StringBuilder();
        char r;
        while (!queue.isEmpty()) {
            sb.append(queue.poll().toString().replace(".0","")).append(" ");
        }
        return sb.toString().replace('.', ',');
    }

    public Queue<Double> getQueue() {
        return this.queue;
    }

    public void add(Double c) {
        this.queue.add(c);
    }
}
