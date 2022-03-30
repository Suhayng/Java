package Chap16.EX08;

class A {}
class B extends A {}
class C extends B {}

// 제너릭 타입의 클래스 : 제너릭 타입의 들어오는 객체를 제한을 둠.

class D <T extends B> {		// T : class B, class C 만 올 수 있음
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
	
}

public class BoundTypeOfGeneric {
	public static void main(String[] args) {
		
//		D<A> d1 = new D<A>();	// 불가능 : <T>에 들어갈 객체르 제한을 둔다, B class 와 C class만 타입 저장 가능
		D<B> d2 = new D<B>();
		D<C> d3 = new D<C>();
		
		D d4 = new D (); 		// =D(B) D(C)	// 타입을 지정하지 않고 객체 생성시 최상위 타입으로 설정됨
								// = D<B> d2 = new D<B>();
		d2.set(new B());	 	// B 객체 저장
		d2.set(new C());	 	// C 객체 저장
//		d2.set(new A()); 		// 오류 발생	
	
		// d3 는 C 타입만 넣을 수 있다.
//		d3.set(new B());	 	// 오류 발생
		d3.set(new C()); 		
//		d3.set(new A());  		// 오류 발생
		
//		d4.set(new A());  		// 오류 발생
		d4.set(new B()); 
		d4.set(new C());
	}
}
