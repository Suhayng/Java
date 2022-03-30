package Chap16.EX09;

// ���ʸ� �޼ҵ��� ���� ���� :

class A {	// �Ϲ� Ŭ������ ���ʸ� �޼ҵ�
	
	// Number : Boolean, Charactor �� ������ 6���� Ÿ�� (Byte, Short, Integer, Long. Float, Double)
	public <T extends Number> void method1 (T t) {
		System.out.println(t.intValue()); 	// Number Ÿ���� �޼ҵ� t.intValue()
	}
}
interface MyInterface {
	void print();	// public abstract �� ������.
}

class B {
	public <T extends MyInterface> void method2 (T t) {	// T�� Ÿ���� �� �� �ִ� ���� MyInterface�� ������ Ŭ������ �� �� �ִ�.
		t.print();
	}
}

public class BoundTypeOfGenericMethod {
	public static void main(String[] args) {
		A a = new A();	// �Ϲ� Ŭ���� ��ü ����
		a.<Double>method1(5.8);
		a.method1(22.5);			// �Ű� ������ ������ ���� Ÿ���� �ĺ� �� �� �ִ� ��� ���� ����
		a.<Long>method1(100000L);	// Long
		a.<Float>method1(100.5555F);	// Float
		
		
	}
}
