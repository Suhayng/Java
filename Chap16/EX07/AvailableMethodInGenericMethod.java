package Chap16.EX07;

// ���ʸ� �޼ҵ� ���ο��� ��� ������ �޼ҵ� : Object Ŭ������ �޼ҵ常 ��� �����ϴ�.

class A {
	public <T> void method(T t) {
//		System.out.println(t.length());	 		// t.length() : String Ŭ�������� ���ڼ��� ���� ���� *��� �Ұ�*
		System.out.println(t.equals("�ȳ�"));	 	// t.equals �� Object Ŭ������ �޼ҵ�� ��� ����
	}
	public <T extends Object> void methods (T t) {	// <T [extends Object]> []���� 
		
		System.out.println(t.equals("�ݰ����ϴ�"));		// Object Ŭ������ �޼ҵ常 ��� �����ϴ�.	 	
		//System.out.println(t.);
	}
	public <T extends String> void method3 (T t) {
		System.out.println(t.length());	
		//System.out.println(t.);	
	}
}


public class AvailableMethodInGenericMethod {
	public static void main(String[] args) {
		A a = new A();
		a.<String>method("�ȳ�");
		
	}
}
