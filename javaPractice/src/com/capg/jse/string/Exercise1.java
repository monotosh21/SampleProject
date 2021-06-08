package com.capg.jse.string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise1 {

	public static void main(String[] args) {
		int s = 0, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter digits with space");
		String digit = sc.nextLine();
		StringTokenizer st = new StringTokenizer(digit);
		while (st.hasMoreTokens()) {
			String str = st.nextToken();
			s = Integer.parseInt(str);
			sum = sum + s;
			System.out.print(s + " ");
		}
		System.out.println("\n Sum :" + sum);
		sc.close();
	}
}
