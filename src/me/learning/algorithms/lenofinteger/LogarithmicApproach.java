package me.learning.algorithms.lenofinteger;

public class LogarithmicApproach {

	public static void main(String[] args) {
		
		int number = 2147400000;
		int length = (int) (Math.log10(number) + 1);
		System.out.println(length);


	}

}
