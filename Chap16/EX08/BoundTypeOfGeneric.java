package Chap16.EX08;

class A {}
class B extends A {}
class C extends B {}

// ���ʸ� Ÿ���� Ŭ���� : ���ʸ� Ÿ���� ������ ��ü�� ������ ��.

class D <T extends B> {		// T : class B, class C �� �� �� ����
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
		
//		D<A> d1 = new D<A>();	// �Ұ��� : <T>�� �� ��ü�� ������ �д�, B class �� C class�� Ÿ�� ���� ����
		D<B> d2 = new D<B>();
		D<C> d3 = new D<C>();
		
		D d4 = new D (); 		// =D(B) D(C)	// Ÿ���� �������� �ʰ� ��ü ������ �ֻ��� Ÿ������ ������
								// = D<B> d2 = new D<B>();
		d2.set(new B());	 	// B ��ü ����
		d2.set(new C());	 	// C ��ü ����
//		d2.set(new A()); 		// ���� �߻�	
	
		// d3 �� C Ÿ�Ը� ���� �� �ִ�.
//		d3.set(new B());	 	// ���� �߻�
		d3.set(new C()); 		
//		d3.set(new A());  		// ���� �߻�
		
//		d4.set(new A());  		// ���� �߻�
		d4.set(new B()); 
		d4.set(new C());
	}
}