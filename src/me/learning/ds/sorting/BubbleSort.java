package me.learning.ds.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int usArray[] = {6,3,1,20,24};
		
		int n = usArray.length;
		
		for(int i = 0; i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(usArray[j]>usArray[j+1]) {
					int temp = usArray[j+1];
					usArray[j+1] = usArray[j];
					usArray[j] = temp;
				}
			}
		}
		
		for(int i=0; i<usArray.length; i++) {
			System.out.println(usArray[i]);
		}

	}

}
