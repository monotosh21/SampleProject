package com.capg.jse.array;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
	static int getSecondSmallest (int n[]) {
		Arrays.sort(n);
		int s=n[1];
		return s;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit :");
		int l=sc.nextInt();
		int arr[] = new int[l];
		for( int i=0;i<l;i++) {
		 arr[i] =sc.nextInt();
		}
		System.out.println("Second lowest element of the array :"+getSecondSmallest(arr));
		sc.close();
	}

}
