Copy elements from one array to another

package com.qsp.hello;
import java.util.Scanner;
public class CopyElementsofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrayelement(arr);
		sc.close();
	}
	public static void Arrayelement(int arr[]) {
		int n=arr.length;
		int arr2[]=new int[n];
		for(int i=0;i<n;i++) {
			arr2[i]=arr[i];
		}
		int n2=arr2.length;
		for(int i=0;i<n2;i++) {
			System.out.println("copy Element of an Array at index of"+i+"is"+arr2[i]);
			
		}
		
	}

}
