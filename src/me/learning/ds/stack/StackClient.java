package me.learning.ds.stack;

public class StackClient {

	public static void main(String[] args) {
		StackUsingArray<Integer> stackUsingArray = new StackUsingArray<>(10);
		
		stackUsingArray.push(10);
		stackUsingArray.push(20);
		stackUsingArray.push(30);
		stackUsingArray.print();
		stackUsingArray.pop();
		stackUsingArray.print();
		
		StackUsingLinkList<Integer> stackUsingLinkList = new StackUsingLinkList<>();
		stackUsingLinkList.push(1);
		stackUsingLinkList.push(2);
		stackUsingLinkList.push(3);
		stackUsingLinkList.print();
		stackUsingLinkList.pop();
		stackUsingLinkList.print();
		

	}

}
