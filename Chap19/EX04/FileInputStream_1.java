package Chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream_1 {
	public static void main(String[] args) throws IOException {

		//���� �۾� ���丮 ��ġ Ȯ��
		System.out.println(System.getProperty("user.dir"));
		
		//1. �Է� ���� ����
			//���� ��η� ����
		File inFile1 = new File("C:\\SUSU\\JAVA2\\src\\Char19\\FileInputStream_1.txt");
			//��� ��η� ����
		File inFile = new File("src\\\\Char19\\\\FileInputStream_1.txt");
		
		// InputStream ��ü�� �����ؾ� ������ ������ ���� �� �ִ�.
		InputStream is = new FileInputStream(inFile);
			//InputStream�� �߻� Ŭ����, ���� ��ü ������ �� �� ����, Ÿ�� ������ �����ϴ�.
		
		// ������ ������ ���
		
		int data;
		
		// UTF-8 : ���� 1byte, �ѱ� 3byte
		// MS949 : ���� 1byte, �ѱ� 2byte
		// EUC-KR : ���� 1byte, �ѱ� 2byte
		// UTF-16 : ���� 2byte, �ѱ� 2byte, ù��° BOM 2byte <- �ĺ���
		
		
		// �� ����Ʈ �����͸� �о char�� ��ȯ �� ���	
												//read() �� ����Ʈ�� �о����
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());	System.out.println((char)is.read());	System.out.println((char)is.read());
		
		
		System.out.println();
		System.out.println();
		
		
		// int read() : �� ����Ʈ�� �о ���� ������ ��� ����� ���� ���� �����Ͱ� �������� ���� ��� -1
		// while ���� ����ؼ� �ѹ��� ���
		
		InputStream is1 = new FileInputStream(inFile);
		
		int data1;
		while((data1 = is1.read()) != -1) {
			System.out.println((char) data1);
		}
		
	}
}
