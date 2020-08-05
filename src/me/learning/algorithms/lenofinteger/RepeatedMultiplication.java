package me.learning.algorithms.lenofinteger;

public class RepeatedMultiplication {

	public static void main(String[] args) {
		int number = 2147400000;
		int temp = 1;
		int length = 0;
		if(number < 10)
			length= 1;
		else {
			while(temp > 0 && temp <= number) {
				length++;
				temp *= 10;
			}
		}
		
		System.out.println(length);

	}

}
