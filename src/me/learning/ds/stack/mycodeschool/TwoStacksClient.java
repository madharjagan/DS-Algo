package me.learning.ds.stack.mycodeschool;

public class TwoStacksClient {

	public static void main(String[] args) {
		TwoStacks<Integer> twostacks = new TwoStacks<>(10);
		twostacks.push1(10);
		twostacks.push2(20);
		System.out.println(twostacks.pop1());
		System.out.println(twostacks.pop2());

	}

}
