//Write a Java program to enqueue 10 items into a Queue data structure and reverse the Queue content.

import java.util.Queue;
import java.util.LinkedList;

class Main {
	
  public static void enqueue(Queue<Integer> queue){
  	for(int i=0;i<10;i++){
  		queue.add(i);
  	}
  }
  
  public static Queue<Integer> reverseQueue(Queue<Integer> queue){
  	LinkedList<Integer> ll = new LinkedList<Integer>();
  	for(int i=0;i<10;i++){
  		ll.add(0, queue.poll());
  	}
  	Queue<Integer> reversedQueue = ll;
  	return reversedQueue;
  }
  
  public static void main(String[] args) {
    Queue<Integer> myQueue = new LinkedList<Integer>();
    enqueue(myQueue);
    System.out.println(myQueue);
    myQueue = reverseQueue(myQueue);
    System.out.println(myQueue);
  }
  
}
