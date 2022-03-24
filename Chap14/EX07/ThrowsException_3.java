package Chap14.EX07;

/* Exception - Check Exception - ������ ����, �ݵ�� ����ó��
			 - unChecked Exception, RunTime Exception - ����ÿ� ����
  ���� ó�� ��� - try catch - �ڽ��� ���� ���ܸ� ó��
  			 - throws - ���� ó���� �̷�� ��(����), �޼ҵ� ������� ���ܸ� �޼ҵ� ȣ��� ȣ���ϴ� �ʿ� �̷�� ��.
  			 		 throw : ���ܸ� ���� �߻�
*/

// 1. Exception �� �߻��Ǵ� �޼��� ���ο��� �ڽ��� ���� ���ܸ� ó���� ���
class A {
	void abc() {
		bcd();		// bcd(); ȣ��
	}
	void bcd() {
		try {
		Class cls = Class.forName("java.lang.Object");	// �Ϲ� ���� ClassNotFonundException
		Thread.sleep(1000); 	// ms : 1000 , 1��		// �Ϲ� ����
			
	} catch (ClassNotFoundException | InterruptedException e) {
	}	
		// Class.forName : ���� �ε� - �����Ͻÿ� üũ���� �ʰ� ������ �� ��ü�� �����ϴ��� Ȯ��
			// ����� Ŭ���� ������ ������ ���� �ְ� �������� ���� ���� �ֱ� ������ ���� ó���� �ؾ� �Ѵ�.
	}
}

// 2. Throws�� ����ؼ� Exception�� �̷�� ���
class B {
	void abc() {
		try {
			bcd();
		} catch (ClassNotFoundException | InterruptedException e) {
		
		}
	}
	
	// bcd() �޼ҵ带 ȣ���ϴ� ������ ���ܸ� �̷�ڴ�.
	void bcd() throws ClassNotFoundException, InterruptedException  {
		Class cls = Class.forName("java.lang.Object");
		Thread.sleep(1000);
	}
}


public class ThrowsException_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
