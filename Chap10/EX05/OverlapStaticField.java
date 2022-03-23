package Chap10.EX05;
class AAA {				// Stitc 필드는 오버라이딩 되지 않는다. 
	static int m = 3;
}
class BBB extends AAA {
	static int m = 4; 
}

public class OverlapStaticField {
	public static void main(String[] args) {
		//1. 객체 생성 없이 호출 ( 클래스 명으로 호출 )   <===<< 권장사항 >>
		System.out.println(AAA.m);	//3
		System.out.println(BBB.m);  //4 
		
		//2. 객체 생성후 호출 
		AAA aaa = new AAA(); 
		BBB bbb = new BBB();
		AAA abb = new BBB(); 
		System.out.println("===========");
		
		System.out.println(aaa.m);   //3
		System.out.println(bbb.m);   //4
		System.out.println(abb.m);   //3   //static 필드 : 오버라이딩 되지 않는다. 
		
	}

}
