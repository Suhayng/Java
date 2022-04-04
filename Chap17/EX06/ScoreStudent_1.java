package Chap17.EX06;

/*
 	1. �л��� : ������ ���� �Է����� �� ArrayList�� capacity ũ�� ����
 	2. ���� �Է� : �Է� ���� �л����� ���� ���� �Է�. ArrayList�� ��ü�� ����
 	3. ���� ����Ʈ : ArrayList �� ����� Student ��ü�� �����ͼ� score ���� ���.
 	4. �м� : �ְ���:   , ��� ���� :    , 
 	5. ����   
 */

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	int score; 		// ������ �Է� , �ʵ��� �� �Ҵ� (1. ��ü ���� �� ����, 2. private (������, Setter, Getter)

	Student() {};
	
	Student (int score) {
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}

public class ScoreStudent_1 {


	public static void main(String[] args) {

        ArrayList<Student> arr = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);	// System.in : �ܼ��� ���ؼ� ���� �ްڴ�.
        
        boolean run = true;
        int studentNum = 0;		// while ��� �ۿ��� ����, ���� ���� 
        
       
        while(run) {			// run : true
            System.out.println("----------------------------------------------------");
            System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
            System.out.println("----------------------------------------------------");
            System.out.println("����> ");
            int selectNo = scanner.nextInt();			// ����, �������� ���

            if(selectNo == 1) {
                System.out.println("�л� ���� �Է��ϼ��� : ");
                studentNum = scanner.nextInt();			// �л��� ��ǲ ����
                System.out.println("�Է¿Ϸ�");

            } else if(selectNo == 2) {
            	if (studentNum == 0) {		// studentNum�� �Ҵ� �޾ƾ� for ���� ������ ������ �� �ִ�
            		System.out.println("�л����� ���� �Է��ϼ���.");
            	} else {
            		// for ���� ���ؼ� ��ǲ ���� �л� ����ŭ ������ �Է�.
            		for (int i = 0; i < studentNum; i++) {	
            			// ��ǲ�� �޾� ��ǲ ���� ���� Student ��ü�� score ������ �Ҵ�. 
            			// ��ü�� ���� �ؼ�
            			Student student = new Student();	// �⺻ �����ڸ� ����ؼ� ��ü ����, ���� score �ʵ� ���� �Ҵ�.
            			System.out.print((i+1) + "��° �л� ������ �Է��ϼ���.");
            			student.score = scanner.nextInt();	// �л� ������ �Է� �޾Ƽ� �ʵ忡 ���� �Ҵ�
            			arr.add(student);	// ArrayList�� �ʵ忡 ���� �Ҵ��� ��ü�� ArrayList�� ����
            			System.out.println("�Է� �Ϸ�");	// �Է� �Ϸ��� ����ϰ� ����
            		}
            	}
               
            }else if(selectNo == 3) {
            	// ���� ����Ʈ ���, ArrayList �� ������ �Ҵ�� ��ü�� ����. ��ü ���� �� �ʵ��� ���� ���� ���, getter
            	if (studentNum == 0) {
            		System.out.println("�л����� ���� �Է��ϼ���.");
            	} else {
            		for (int i = 0; i < studentNum; i++) {	// ArrayList ��ü�� �����ͼ� Student, score �ʵ��� ���� ���
            			Student student = arr.get(i);		// ArrayList �� get() ������ Student ��ü 
            			//System.out.println(student.score);	// �ʵ��� ���� ��ü�� ���� ���
            			System.out.println(student.getScore()); // �ʵ��� ����  getter �� ���.
            		}
            	}
             
            } else if(selectNo == 4) {
            	if (studentNum == 0) {
            		System.out.println("�л����� ���� �Է��ϼ���.");
            	} else {
            		int maxScore = 0;	// �ִ� ������ �޴� ���� ���� ����	<�ʱⰪ �Ҵ�>
            		int sum = 0;		// �հ踦 �����ϴ� ���� ����		<�ʱⰪ �Ҵ�>
            		// 1. ArrayList �� ��ü�� ������ �´�.  2. Student ��ü�� score �ʵ��� ���� �����ͼ� ó�� 
            		for(int i = 0; i < studentNum; i++) {
            			Student student = arr.get(i);
            			// �ִ� ���� ������ �Ҵ�
            			// 3�� �����ڸ� ����ؼ� �ִ� ���� ������ �Ҵ�
            			maxScore = (student.score > maxScore) ? student.score:maxScore;
            			sum += student.score;	// sum = sum + student.score
            		}
            			// maxScore ������ ���� ���� ���� ��, sum ������ ��� score ���� ���� ������ ��Ƽ� for �� �ۿ��� ���
            			System.out.println("�ְ����� : " + maxScore);
                    	System.out.println("������� : " + (float) sum / studentNum);
            	}
         
            } else if(selectNo == 5) {
            	run = false;	// run : false �� �� while ���� ���� ����.
            	// break;	(��� ����)
              }
        }
        System.out.println ("���α׷� ����");
	}
}

