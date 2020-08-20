package me.learning.problemsolving.hackerearth;

import java.util.Scanner;

public class SeatingArrangement {

	public static void main(String[] args) {
		Scanner sysOutScanner = new Scanner(System.in);
		int numberOfTestCases = sysOutScanner.nextInt();
		int arr[] = new int[numberOfTestCases];
		for(int i = 0; i < numberOfTestCases;i++) {
			arr[i] = sysOutScanner.nextInt();
		}
		System.out.println("numberOfTestCases:"+numberOfTestCases);
		for(int i = 0; i < numberOfTestCases;i++) {
			System.out.println(arr[i]);
		}
		sysOutScanner.close();
	}

}
