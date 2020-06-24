package me.learning.ds.sorting;

public class SeletionSort {

	public static void main(String[] args) {
		int usArray[] = {6,3,1,20,24};

		for(int i=0; i<usArray.length-1; i++) {
			//System.out.println(usArray[i]);
			int minIndex = i;
			for(int j=i+1; j<usArray.length;j++) {
				if(usArray[j]<usArray[minIndex])
					minIndex = j;
			}
			int temp = usArray[minIndex];
			usArray[minIndex] = usArray[i];
			usArray[i] = temp;
		}
		
		//for(int i=0; i<usArray.length; i++) {
			//System.out.println(usArray[i]);
		//}
		
		int anotherArray[] = {60,30,10,20,24,1};
		
		for(int i=0; i<anotherArray.length-1; i++) {
			int bigIndex = 0;
			int j;
			for(j=1; j<anotherArray.length-i;j++) {
				if(anotherArray[j]>anotherArray[bigIndex])
					bigIndex = j;
			}
			/*int temp = anotherArray[j-1];
			anotherArray[j-1]=anotherArray[bigIndex];
			anotherArray[bigIndex] = temp;*/
			
			int temp = anotherArray[bigIndex];
			anotherArray[bigIndex]=anotherArray[j-1];
			anotherArray[j-1] = temp;
		}
		
		for(int i=0; i<anotherArray.length; i++) {
			System.out.println(anotherArray[i]);
		}
		
	}

}
