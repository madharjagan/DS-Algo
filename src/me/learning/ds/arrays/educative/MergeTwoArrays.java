package me.learning.ds.arrays.educative;

public class MergeTwoArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  int[] arr1 = {1, 3, 4, 5} ; 
		  int[] arr2 = {2, 6, 7, 8};
		  int arr1Len = arr1.length;
		  int arr2Len = arr2.length;
	      int mergedArray[] = new int[arr1Len+arr2Len];
	      int mergeArrayIndex = 0 ;
	      int i = 0, j = 0;
	      
	      while(i<arr1Len && j < arr1Len) {
	    	  
	    		  if(arr1[i]<arr2[j]) {
	    			  mergedArray[mergeArrayIndex++] = arr1[i++];
	    		  } else {
	    			  mergedArray[mergeArrayIndex++] = arr2[j++];
	    		  }	    	  
	      }
	      
	      while(i < arr1Len) {
	    	  mergedArray[mergeArrayIndex++] = arr1[i++];
	      }
	      
	      while(j < arr2Len) {
	    	  mergedArray[mergeArrayIndex++] = arr2[j++];
	      }
	      for(int a =0 ; a < mergedArray.length; a++)  {
	    	  System.out.println(mergedArray[a]);
	      }
	      

	}

}
