package me.learning.ds.arrays.educative;

public class SecondMaximum {

	public static void main(String[] args) {
		int[] arr = {9,2,3,6};
		for(int i = 0;i < 2; i++){
	        for(int j=i+1; j < arr.length;j++){
	          if(arr[i] < arr[j]){
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	          }
	        }
	    }
	    // Write - Your - Code
	    System.out.println(arr[2]);

	}

}
