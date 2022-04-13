package Chap19.EX07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * 	�߰� ����� �����ϴ� ��Ʈ�� : ��� ��Ʈ���� �����ؾ��Ѵ�. �ܵ����� ����� �� ����.
 	BufferedInputStream : InputStream �� ���͸� �����ؼ� �б� ������ ���� ������ �� ��Ʈ��, �ܵ����� ����� �� ����. ��� ��Ʈ���� �߰� ���
 	BufferedOutputStream : OutputStream�� ���͸� �����ؼ� ���� ������ ���� ������ �� ��Ʈ��
 */


public class BufferedInput_BufferedOutfoutStream {
	public static void main(String[] args) {
		// �� ������ ����, Buffered �� ������� �ʰ� ó���ϴ� ���, Buffered �� ����ϴ� ��� �ӵ� ����
		
		File origfile = new File ("src\\Chap19\\EX07\\mycat_origin.jpg"); //���� ����
		File copyfile1 = new File ("src\\Chap19\\EX07\\mycat_copy1.jpg"); //Buffered �� ������� �ʰ� ó���ϴ� ���
		File copyfile2 = new File ("src\\Chap19\\EX07\\mycat_copy2.jpg"); //Buffered �� ����ϴ� ���
		
		// ���� ������ �ϱ� ���� ���� ����
		long start, end, time1, time2;	// time1 : Buffered(x), time2 : Buffered(o)
		
		// 1. Buffered �� ������� �ʰ� ó���ϴ� ���(BufferedInputStream, BufferedOutputStream)
		start = System.nanoTime();		// ���� �ð�
		
		try (InputStream is = new FileInputStream(origfile);		//Auto close()
			 OutputStream os = new FileOutputStream(copyfile1);		//Auto close()
				){
			//������ ���� �ڵ� ����
			int data;
			while ( (data = is.read()) != -1 ) {	//is���� 1byte �о, -1 ������ ����
				os.write(data);						//os�� 1byte ����
			}
		} catch (IOException e1) {}
		end = System.nanoTime();
		time1 = end - start;
		System.out.println("Without BufferedXXXStream : " + time1);  //���۸� ������� �ʰ� ����, copy1.jpg
		
		
		
		// 2. Buffered�� ����ϸ鼭 ó���ϴ� ��� ( BufferedInputStream, BufferedOutputStream )
		start = System.nanoTime();
		
		try(InputStream is = new FileInputStream(origfile);				//��� ��Ʈ��
			BufferedInputStream bis = new BufferedInputStream(is);		//�߰� ����� �����ϴ� ��Ʈ��. ������ ������ ó�� (Buffer �����)
			OutputStream os = new FileOutputStream(copyfile2);
			BufferedOutputStream bos = new BufferedOutputStream(os);	
				) {
		//������ �ڵ� ����
			int data; 
			while ((data = bis.read()) != -1 ) {	//���۸� ����ؼ� �б� (������)
				bos.write(data);					//���۸� ����ؼ� ���� 
			}
		} catch (IOException e) {}
		
		end = System.nanoTime();
		time2 = end - start;
		System.out.println("With BufferedXXXStream : " + time2);
		
		// Buffered ����� ���(time2), ������� �ʴ� ���(time1)�� ����
		System.out.println("�ӵ� ���� �� �� : " + (time1 / time2));
		
		
		
	}
}
