package chap05;

import java.util.Arrays;

public class Q2 {
	public static void main(String[] args) {
		int[] arr2 = new int[300];
		
		for(int i = 0; i < arr2.length; i++) {
			arr2[i]= (i+1)*3 ;
		}
		
		// 1. 전체 출력
		for ( int i = 0; i < arr2.length ; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println();
		
		for ( int k : arr2) {					
			System.out.println(k + " ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(arr2));
		System.out.println();
		
		// 2. 홀수 번방의 값만 출력
		for ( int i = 100; i < arr2.length ; i++) {
			if( i%2 == 1)
			System.out.println(arr2[i]);
		}
	
	
	}
}
