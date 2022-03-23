package chap05;
public class CreatStringObjet {
	public static void main(String[] args) {
		// 1. String 객체 생성 1 : new 키를 사용해서 객체 생성 : Heap 영역의 별도의 공간에 저장
				// RAM의 값을 절대 공유하지 않는다.
		String str1 = new String("안녕");			// new 키는 객체를 생성하라. (Heap 메모리에 저장)
		System.out.println(str1);				// String은 객체를 출력 했을 때, 객체의 값이 출력. 
												// String 만 가지는 특수한 기능
												// 객체 자체를 출력하면, Heap 메모리의 번지 출력 
												// 객체의 값을 출력할 때는 객채명.toString() 재정의
		
		String str11 = new String("안녕");		// str1 과 str2는 별도의 메모리 공간에 저장 (Heap) 		
		
		if (str1 == str11) {					// '==' : 참조 자료형일 때, 참조하는 주소를 비교. 
			System.out.println(true);
		} else {
			System.out.println(false);			// false : 별도의 주소를 가르킨다.
		}
		System.out.println("===================");
		
		
		// 2. 리터럴의 값을 바로 할당 : 같은 값일 경우 RAM 의 값을 공유하게 된다. (Heap)
		String str2 = "안녕하세요."; 				
		String str22 = "안녕하세요.";				// 동일한 메모리 공간을 공유 (Heap)
	
		if (str2 == str22) {
			System.out.println(true);			// true : 같은 주소를 가르킨다.
		} else {
			System.out.println(false);			
		}
	
		
	}
}
