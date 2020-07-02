package me.learning.ds.arrays.educative;

public class rotateArray {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		int valueHolder=arr[0];
        for(int i = 0;i<arr.length;i++){
          int rIndex = (i+1)%arr.length;
          int temp = arr[rIndex];
          arr[rIndex] = valueHolder;
          valueHolder = temp;
          System.out.println(arr[rIndex]);
        }  

	}

}
