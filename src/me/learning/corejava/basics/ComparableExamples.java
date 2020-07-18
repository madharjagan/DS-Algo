package me.learning.corejava.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableExamples {

	public static void main(String[] args) {
		//Sorting primitive int array
		 /*
	     * Integer class implements Comparable
	     * Interface so we can use the sort method
	     */
		int[] arr = {8,3,2,5,1,10};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//Sorting String Array
	    /*
	     * String class implements Comparable
	     * Interface so we can use the sort method
	     */
		String[] names = {"jagan", "devi", "rethu", "newbaby"};		
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
	     /*
	      * String class implements Comparable
	      * Interface so we can use the sort method
	      */
	     List<String> fruits = new ArrayList<String>();
	     fruits.add("Orange");
	     fruits.add("Banana");
	     fruits.add("Apple");
	     fruits.add("Guava");
	     fruits.add("Grapes");
	     Collections.sort(fruits);
	     System.out.println();
	     System.out.print("Sorted List: ");
	     for(String s: fruits) System.out.print(s+", ");
	     
	     /*
	      * Custom File class implements Comparable
	      * Interface so we can use the sort method
	      */
	     File file1 = new File("Jagan",50);
	     File file2 = new File("Devi",100);
	     File file3 = new File("Rethu",5);
	     
	     List<File> listFile = new ArrayList<>();
	     listFile.add(file1);
	     listFile.add(file2);
	     listFile.add(file3);
	     
	     Collections.sort(listFile);
	     File f;
	     System.out.println();
	     for(int i = 0; i < listFile.size(); i++) {
	    	 f = listFile.get(i);
	    	 System.out.println(f.path);
	     }
	     
	     /*
	      * Custom File class has two Comparators bysize, bydate
	      * so we can use the sort method
	      */
	     Collections.sort(listFile, File.BY_SIZE);
	     System.out.println();
	     for(int i = 0; i < listFile.size(); i++) {
	    	 f = listFile.get(i);
	    	 System.out.println(f.path);
	     }
	}

}
