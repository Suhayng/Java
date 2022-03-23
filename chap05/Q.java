package chap05;

import java.util.Arrays;

public class Q {
	public static void main(String[] args) {
		int[] arr1 = new int[100];
		for(int i = 0; i < arr1.length; i++) {
			arr1[i]=i+1;
		}
	
		for ( int i = 0 ; i < arr1.length ; i++) {
			System.out.print( arr1[i] + " ");
		}
		System.out.println();
		

		for ( int k : arr1) {					
			System.out.print(k + " ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(arr1));
	}

}
