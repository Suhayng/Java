package Chap10.EX07.EX04;

class AA {
	String name ;
	AA (String name) {
		this.name = name;
	}
}
class BB {
	String name ;
	BB (String name) {
		this.name = name;
	}
	@Override
	public String toString() {			// ��Ű����.Ŭ������@�ؽ��ڵ� ==> name �ʵ��� ���� ����
		return name;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((BB) obj).name) {
			return true;
		} else {
			return false;
		}
	}
}

public class String_EX02 {

	public static void main(String[] args) {
		String s1 = new String("�ȳ�");
		String s2 = "�ȳ�";
		
		System.out.println(s1); 			// String Ŭ������ toString() ������ �Ǿ� �ִ�.
		System.out.println(s1.equals(s2)); 	// String Ŭ������ equals() ������ �Ǿ� �ִ�.
			// ���� ���ϵ��� ������
		
		AA a1 = new AA("�ȳ�");
		AA a2 = new AA("�ȳ�");
		
		System.out.println(a1);
		System.out.println(a1.equals(a2)); 	// false , ��ü�� �ּҸ� �� �ϱ� ������
		BB b1 = new BB("�ȳ�");
		BB b2 = new BB("�ȳ�");
		
		System.out.println(b1);
		System.out.println(b1.equals(b2));
	
	}
}
