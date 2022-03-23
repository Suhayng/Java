package Chap14.EX01;



public class ArrayException1 {
	public static void main(String[] args) {

		int [] arr = new int[5];	// arr 배열에 배열방 5개 생성, index : 0,1,2,3,4

		try {
		
			for (int i = 0; i <= 4; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace();	// 예외에 대한 정보를 출력 
			System.out.println("배열의 인덱스 방 번호를 넘겼습니다.");
		} finally {
			System.out.println("출력 (finally)");
		}
		
		
		System.out.println("프로그램 종료");
	}
}
