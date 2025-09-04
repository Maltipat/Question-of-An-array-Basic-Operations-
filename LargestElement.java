//Find the largest element in an array
package com.qsp.hello;
import java.util.*;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter the array");
			ar[i]=sc.nextInt();
			System.out.println(ar[i]);
		}
		largestarr(ar);
	}
	public  static void largestarr(int arr[]) {
		int n=arr.length;
		int largestelement=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>largestelement) {
				largestelement=arr[i];
			}
		}
		System.out.println("the largest elemnt is"+largestelement);
		
	}

}
