package me.learning.ds.queue;

public class QueueClient {

	public static void main(String[] args) {
		QueueUsingArrays<Integer> queueUsingArrays = new QueueUsingArrays<>(10);
		queueUsingArrays.enQueue(10);
		queueUsingArrays.enQueue(20);
		queueUsingArrays.enQueue(30);
		queueUsingArrays.print();
		queueUsingArrays.deQueue();
		queueUsingArrays.deQueue();
		queueUsingArrays.deQueue();
		queueUsingArrays.print();
		queueUsingArrays.deQueue();
		queueUsingArrays.print();
	}

}
