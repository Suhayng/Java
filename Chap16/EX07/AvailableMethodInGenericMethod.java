package Chap16.EX07;

// ���ʸ� �޼ҵ� ���ο��� ��� ������ �޼ҵ� : Object Ŭ������ �޼ҵ常 ��� �����ϴ�.

class A {
	public <T> void method(T t) {
//		System.out.println(t.length());	 		// t.length() : String Ŭ�������� ���ڼ��� ���� ���� *��� �Ұ�*
		System.out.println(t.equals("�ȳ�"));	 	// t.equals �� Object Ŭ������ �޼ҵ�� ��� ����
	}
}

public class AvailableMethodInGenericMethod {
	public static void main(String[] args) {
		A a = new A();
		a.<String>method("�ȳ�");
		
	}
}
