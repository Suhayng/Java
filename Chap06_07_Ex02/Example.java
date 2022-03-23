package Chap06_07_Ex02;
import java.util.Scanner;
public class Example {
	public static void main(String[] args) {


		// [문제] : 스캐너로 임의의 정수값을 받아서 합계, 평균 .. >>
		
		Scanner sc = new Scanner(System.in);
		System.out.println("임의의 정수값을 입력하시오.");		
		
		int[] arr = new int[] {};
		int sum = 0;		
		int avg = 0;
		
		for (int i = 0; i < arr.length ; i++) {
			sc.nextInt();
			sum += arr[i];
			avg = sum / i+1;
		}
		    
		System.out.println(arr);
		System.out.println("합은 : " + sum);
		System.out.println("평균은 : " + avg);
		
	}
}
