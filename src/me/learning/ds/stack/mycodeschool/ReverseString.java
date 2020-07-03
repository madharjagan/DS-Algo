package me.learning.ds.stack.mycodeschool;

import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {
		String name = "Jagan";
		System.out.println("Name:"+name);
		Stack<Character> stack = new Stack<>();
		char[] nameChars = name.toCharArray();
		for(char temp: nameChars)
			stack.push(temp);
		int index = 0;
		while(!stack.isEmpty()) {
			nameChars[index++] = stack.pop(); 
		}
		String reversedName = String.copyValueOf(nameChars);
		System.out.println("Reversed Name:" + reversedName);		

	}

}
