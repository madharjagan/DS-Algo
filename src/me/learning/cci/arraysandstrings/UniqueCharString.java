package me.learning.cci.arraysandstrings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*
 * references: https://www.geeksforgeeks.org/determine-string-unique-characters/
 */

public class UniqueCharString {
	
	final static int MAX_CHAR = 256; 
	
	/*
	 * Time - O(n square)
	 * Space - O(n)
	 */
	public static boolean bruteForce(String inputString) {
		if(inputString.isEmpty() || inputString.length() == 1)
			return true;
        if (inputString.length() > MAX_CHAR) 
            return false; 
		
		char[] charArrString = inputString.toCharArray();
		
		for(int i=0;i<charArrString.length;i++) {
			for(int j=i+1; j < charArrString.length;j++) {
				if(charArrString[i] == charArrString[j])
					return false;
			}
		}
		
		return true;
		
	}
	
	/*
	 * Time - O(n log n)
	 * Space - O(n)
	 */
	public static boolean bySorting(String inputString) {
		
		if(inputString.isEmpty()|| inputString.length() == 1)
			return true;
		
        if (inputString.length() > MAX_CHAR) 
            return false; 
		
		char[] charArrString = inputString.toCharArray();
		// log n time complexity
		Arrays.sort(charArrString);
		//n time complexity
		for(int i = 0; i < charArrString.length-1; i++) {
			if(charArrString[i] == charArrString[i+1]) {
				return false;
			}
		}

		return true;
	}
	
	
	
// Without Extra Data Structure implementation
	
/*
 * Time - O(n)
 * space - O(n)
 */
	
	public static boolean usingExtraDS(String inputString) {
		if(inputString.isEmpty()|| inputString.length() == 1)
			return true;
		
        if (inputString.length() > MAX_CHAR) 
            return false;
        
        boolean[] chars = new boolean[MAX_CHAR];
        Arrays.fill(chars, false);
        
        for(int i = 0; i< inputString.length(); i++) {
        	int index = (int) inputString.charAt(i);
        	
        	if(chars[index] == true)
        		return false;
        	chars[index] = true;
        }
        
        return true;
	}
	
	/*
	 * Time - O(n)
	 * space - O(n) but need space than above boolean Array data structure.
	 */
	public static boolean usingHashMapDS(String inputString) {
		if(inputString.isEmpty()|| inputString.length() == 1)
			return true;
		
        if (inputString.length() > MAX_CHAR) 
            return false;
        
        HashMap<Integer, Character> map = new HashMap<>();
        
        for(int i = 0; i< inputString.length(); i++) {
        	int index = (int) inputString.charAt(i);
        	
        	if(map.get(index) != null)
        		return false;
        	
        	map.put(index, inputString.charAt(i));
        }
        
        return true;
	}
	
//With Extra Data Structure implementation
	
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String input = scan.nextLine();
        System.out.println(UniqueCharString.bruteForce(input));
        
        input = scan.nextLine();
        System.out.println(UniqueCharString.bySorting(input));
        
        input = scan.nextLine();
        System.out.println(UniqueCharString.usingExtraDS(input));
        
        input = scan.nextLine();
        System.out.println(UniqueCharString.usingHashMapDS(input));
        
        scan.close();
	}

}
