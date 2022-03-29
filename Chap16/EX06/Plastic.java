package Chap16.EX06;

// GenericPrint 에 사용될 객체 [재료]

public class Plastic {
	public void doPrinting() {
		System.out.println("Plastic 재료로 출력합니다.");
	}
	@Override
	public String toString() {
		return "재료는 플라스틱입니다.";
	}
	
	
}
