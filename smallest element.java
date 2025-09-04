Find the smallest element in an array

package com.qsp.hello;

import java.util.Scanner;

public class SmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		smallest(arr);

	}
	public static void smallest(int arr[]) {
		int n=arr.length;
		int small=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]<small) {
				small=arr[i];
			}
		}
		System.out.println("the smallest elemnt in array is"+small);
	}

}
