package Chap19.EX04;

/*
 	A ~ Z ������ �ƽ�Ű�ڵ� ��� 
 	
 	��� ���
 	A, 65
 	B, 66
 	
 	Z, 97
 	
 	a ~ z ������ �ƽ�Ű�ڵ� ��� 
 
 */

public class Charator_EX2 {
	public static void main(String[] args) {

		char[] arr = new char[26];
		
		for(int i = 0; i < arr.length; i++ ) {
			arr[i] = (char)(65+i);
			System.out.println(arr[i] + ", " + (65+i));
		}
		System.out.println();
	
		char[] arr2 = new char[26];
		
		for(int i = 0 ; i < arr2.length; i++) {
			arr2[i] = (char)(97+i);
			System.out.println(arr2[i] + ", " + (97+i));
		}
	
	 
	}
}
