package com.opp.lab2.medium;
import java.util.ArrayList;

public class Queue {
    int maxQueueLength;
    boolean hasCustomSize = false;
    ArrayList<String> QueueValues = new ArrayList<String>();

    public Queue(){
        this.maxQueueLength = Integer.MAX_VALUE;
    }

    public Queue(int maxSize){
        this.maxQueueLength = maxSize;
        hasCustomSize = true;
    }

    public void push(String element){
        if(QueueValues.size() >= maxQueueLength){
            System.out.println("Max Queue Length is " + maxQueueLength + ", " + element + " was not added to the Queue.");
            return;
        }

        QueueValues.add(element);
    }

    public void pop(){
        QueueValues.remove(0);
    }

    public String isEmpty(){
        if(QueueValues.size() == 0){
            return "The Queue is empty.";
        }

        return  "The Queue is not empty";
    }

    public String isFull(){
        if(!hasCustomSize){
          return  "The Queue is never full.";
        }

        if(QueueValues.size() == maxQueueLength){
            return "The Queue is full.";
        }

        return "The Queue is not full yet.";
    }
}
