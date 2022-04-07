package Chap18.EX03;

import java.util.Scanner;

// 1. ��ĳ�ʸ� ����ؼ� double �� �� ���� ��ǲ �޽��ϴ�.
// 2. ��� 1. ���ٽ��� ����ؼ� ��ǲ ���� �� ���� ��Ģ����(+,-,*,/)�� �����ؼ� ���
//�͸� �̳�Ŭ���� -> ���ٽ�
// 3. ��� 2. �������̽��� ������ �ڽ� ��ü ����ؼ� ��ǲ ���� �� ���� ��Ģ����(+,-,*,/)�� �����ؼ� ���
// 4. ��� 3. �͸� �̳� Ŭ������ ����ؼ� ��ǲ ���� �� ���� ��Ģ����(+,-,*,/)�� �����ؼ� ���
// 5. ArithmeticException ó�� : 0 ���� ������ ���� �߻�

@FunctionalInterface
interface Arithmetic {
	void arithmethicOpr(double a, double b);
}

class ArithmeticImpl implements Arithmetic{
	@Override
	public void arithmethicOpr(double a, double b) {
		System.out.println("a+b : "+(a+b)+" , "+"a-b : "+(a-b)+ " , " + "a*b : " +(a*b)+" , " + "a/b :"+ (a/b));
	}
}

public class ArithmethicOperation {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �Ǽ��� ������ �����ؼ� �Է��ϼ���");
		double a= sc.nextDouble();
		double b= sc.nextDouble();
	
		// 1. ���ٽ� : �������̽��� �߻�޼ҵ带 �͸� �̳� Ŭ������ ������ ���� ��� ǥ���̤���.
		
		Arithmetic a1 = (x,y) -> {System.out.println("a+b : "+(x+y)+" , "+"a-b :"+(x-y)+" , " +"a*b : " +(x*y)+ " , " + "a/b :"+ (x/y));};
		
		a1.arithmethicOpr(a, b); 
		
		// 2. �������̽��� ������ Ŭ���� ���� �� �޼ҵ� ȣ��
		
		Arithmetic a2 = new ArithmeticImpl();
		a2.arithmethicOpr(a, b);
		
		// 3. �͸� �̳� Ŭ������ ���
		Arithmetic a3 = new Arithmetic() {
			
			@Override
			public void arithmethicOpr(double a, double b) {
				System.out.println("a+b : "+(a+b)+" , "+"a-b : "+(a-b)+ " , " + "a*b : " +(a*b)+" , " + "a/b :"+ (a/b));
			
			}
		};
			
		
		


	
	}
}