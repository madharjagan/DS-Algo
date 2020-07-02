package me.learning.ds.arrays.educative;

public class ReArrangePosNeg {

	public static void main(String[] args) {
		int[] arr = {10,-1,20,4,5,-9,-6};
		int[] tempArr = new int[arr.length];
		int tempIndex = 0;
	    for(int fhi=0;fhi<arr.length;fhi++){
	        if(arr[fhi]<0){
	          tempArr[tempIndex] = arr[fhi];
	          tempIndex++; 
	        } 
	    }

	     for(int fhi=0;fhi<arr.length;fhi++){
	        if(arr[fhi]>=0){
	          tempArr[tempIndex] = arr[fhi];
	          tempIndex++;
	        } 
	    }
	     arr = tempArr;
	     for(int fhi=0;fhi<arr.length;fhi++) {
	    	 System.out.print(" " + tempArr[fhi]);
	     }
	     System.out.println();
	     for(int fhi=0;fhi<arr.length;fhi++) {
	    	 System.out.print(" "+arr[fhi]);
	     }


	}

}
