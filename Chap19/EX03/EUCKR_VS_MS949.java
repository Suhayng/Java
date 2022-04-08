package Chap19.EX03;

import java.io.UnsupportedEncodingException;

/*
 	*EUCKR - �ѱ� ǥ��, �ѱ� ǥ�� ���� ��ü �� ǥ�� ������ �͸� �����Ǿ� ����.
 			���� : 1byte, �ѱ� : 2byte, ���������� ��� �� ��
 			
 	*MS-949 - Microsoft �翡�� ������ �ѱ� ǥ�� ���. 11000 ��θ� ǥ���� �� �ִ�.
			���� : 1byte, �ѱ� : 2byte
 	
 	*UTF-8 : ��� ���� (Web, FTP, Mail, ...), git, MAC
 			���� : 1byte, �ѱ� : 3byte
 			
 	*UTF-16 : ���� ����
 			����, �ѱ� ��� 2byte�� ó��
 			
 	*���ڸ� �ش� ���ڵ� Ÿ������ ����Ʈ ��Ʈ������ ������ ���, �ش� ���ڵ� Ÿ���� ������ �ؾ� �������� �ʴ´�.
 	
 	*��Ŭ�������� ���ڵ� Ÿ�� ���� 3����
 		1. ���� ���� :
 		2. ������Ʈ���� ���� :
 		3. ���Ͽ��� ���� :
 		
 		- �켱���� : ���� > ������Ʈ > ����
*/

public class EUCKR_VS_MS949 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		// 1. �����ڸ� byte�� �������� String ���� ��ȯ
		
		byte[] b1 = "a".getBytes("EUC-KR");	//���ڸ� Byte�� ��ȯ --> ��Ʈ��ũ�� ���ڷ� byte ��Ʈ������ ��ȯ�ؼ� ����
			// ���ܰ� �߻��� (UnsupportedEncodingException) -> ��Ÿ�� �߻��� ��� ���ڵ� �� �� ���� ���ܰ� �߻��̵�.
		byte[] b2 = "a".getBytes("MS949");
		
		System.out.println(b1.length); 		//1
		System.out.println(b2.length); 		//1

		System.out.println(new String(b1, "EUC-KR"));	//byte[] ==> ���ڿ��� �ٲ�
		System.out.println(new String(b2, "MS949"));
		
		System.out.println();
		
		// 2. �ѱ��� byte�� �������� String ���� ��������
		byte[] b3 = "a".getBytes("EUC-KR");	
		byte[] b4 = "a".getBytes("MS949");	
		
		System.out.println(b3.length); 
		System.out.println(b4.length); 
		
		System.out.println(new String(b3, "EUC-KR"));
		System.out.println(new String(b4, "MS949"));

		// 3. EUC-KR ���� ��� ������ �͸� ǥ��. �� 2000��
		// MS949�� 11,000�ڸ� ��� ǥ���
		byte[] b5 = "��".getBytes("EUC-KR");		//11,000�� �� 2000�� ǥ��, 8000(x)	
		byte[] b6 = "��".getBytes("MS949");		//11,000�� ��� ó��
		
		System.out.println(b5.length); 		//1
		System.out.println(b6.length); 		//2
		
		System.out.println(new String(b5, "EUC-KR"));
		System.out.println(new String(b6, "MS949"));

	
	
	
	
	
	
	}
}
