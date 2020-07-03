package me.learning.ds.queue;

public class QueueUsingArrays<T> {
	int maxSize;
	T[] queue;
	int front = -1;
	int back = -1;
	
	public QueueUsingArrays(int maxSize) {
		this.maxSize = maxSize;
		this.queue = (T[]) new Object[maxSize];
	}
	
	public boolean isEmpty() {
		return(front == -1 && back == -1);			 
	}
	
	public void enQueue(T data) {
		if(isEmpty()) {
			front = back = 0;
			queue[back]= data;
			return;
		}
		if(back < maxSize-1)
			queue[++back] = data;
		else
			System.out.println("Queue is full ...");
	}
	
	public void print() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			
		} else {
			for(int i = front; i <= back;i++) {
				System.out.print(queue[i] + "\t");
			}
			System.out.println();
		}
	}
	public T deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is empty...");
			return null;
		}
		
		if(front >= maxSize || front > back) {
			front = back = -1;
			System.out.println("Queue is empty");
			return null;
		}
		
		return queue[front++];
		
	}

}
