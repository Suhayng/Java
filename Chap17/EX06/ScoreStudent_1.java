package Chap17.EX06;

/*
 	1. �л��� : ������ ���� �Է����� �� ArrayList�� capacity ũ�� ����
 	2. ���� �Է� : �Է� ���� �л����� ���� ���� �Է�. ArrayList�� ��ü�� ����
 	3. ���� ����Ʈ : ArrayList �� ����� Student ��ü�� �����ͼ� score ���� ���.
 	4. �м� : �ְ���:   , ��� ���� :    , 
 	5. ����   
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

class Student{
	int score; 
}

public class ScoreStudent_1 {


	public static void main(String[] args) {

        ArrayList<Student> arr = new ArrayList<Student>();
       
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int studentNum = 0;
       
        
        while(run) {
            System.out.println("----------------------------------------------------");
            System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
            System.out.println("----------------------------------------------------");
            System.out.println("����> ");
            int selectNo = scanner.nextInt();

            if(selectNo == 1) {
                System.out.println("�л� ���� �Է��ϼ��� : ");
                studentNum = scanner.nextInt();
               // arr = new ArrayList<Student>(scanner.nextInt());
                arr.add(new Student());
                System.out.println("�Է¿Ϸ�");
            } else if(selectNo == 2) {
            	System.out.println("�л� ����ŭ ������ �Է��ϼ���.");
            	 studentNum = scanner.nextInt();
            	//arr = new ArrayList(studentNum);
            	for (int i = 0; i < studentNum; i++) {
            		System.out.println(" ���� : " + i);
            	arr.add(new Student());
            	}
               
            }/* else if(selectNo == 3) {
            	for(int i = 0; i <studentNum; i++) {
            		System.out.println(arr[i]);
            	}
             
            } else if(selectNo == 4) {
            	//�ڵ��ۼ�
              System.out.println("�ְ����� : " + maxScore);
              System.out.println("������� : " + (float) sum / studentNum);
         
            } else if(selectNo == 5) {
            	//�ڵ��ۼ�
              }*/
        }
        System.out.println ("���α׷� ����");
	}
}
