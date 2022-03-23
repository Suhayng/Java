package Chap06_07.EX02;

//기본타입의 메소드 
public class InternalCallMethod {

	public static void main(String[] args) {
		// 같은 클래스 안에서 내부 메소드 호출 : 
		//static 키를 사용하지 않을 경우는 객체화 해서 메소드 호출
		
		InternalCallMethod aaa = new InternalCallMethod();
		
		aaa.print();	//aaa 객체의 print 메소드 호출 
		
		int a = aaa.twice(3); 
		System.out.println(a);   //6 
		
		double b = aaa.sum(a, 5.8); 
		System.out.println(b);
				
	}
	
	void print() {  //static  키워드가 없이 메소드 생성 , 객체화 시켜서 메소드 호출 
		System.out.println("안녕");	
	}
	int twice ( int k) {
		return k *2 ; 
	}
	double sum ( int m , double n) {
		return m+n; 
	}
}
