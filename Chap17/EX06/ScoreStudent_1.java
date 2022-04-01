package Chap17.EX06;

/*
 	1. 학생수 : 임의의 값을 입력했을 때 ArrayList의 capacity 크기 지정
 	2. 점수 입력 : 입력 받은 학생수에 따라서 점수 입력. ArrayList에 객체를 저장
 	3. 점수 리스트 : ArrayList 에 저장된 Student 객체를 가져와서 score 값을 출력.
 	4. 분석 : 최고점:   , 평균 점수 :    , 
 	5. 종료   
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
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("----------------------------------------------------");
            System.out.println("선택> ");
            int selectNo = scanner.nextInt();

            if(selectNo == 1) {
                System.out.println("학생 수를 입력하세요 : ");
                studentNum = scanner.nextInt();
               // arr = new ArrayList<Student>(scanner.nextInt());
                arr.add(new Student());
                System.out.println("입력완료");
            } else if(selectNo == 2) {
            	System.out.println("학생 수만큼 점수를 입력하세요.");
            	 studentNum = scanner.nextInt();
            	//arr = new ArrayList(studentNum);
            	for (int i = 0; i < studentNum; i++) {
            		System.out.println(" 점수 : " + i);
            	arr.add(new Student());
            	}
               
            }/* else if(selectNo == 3) {
            	for(int i = 0; i <studentNum; i++) {
            		System.out.println(arr[i]);
            	}
             
            } else if(selectNo == 4) {
            	//코드작성
              System.out.println("최고점수 : " + maxScore);
              System.out.println("평균점수 : " + (float) sum / studentNum);
         
            } else if(selectNo == 5) {
            	//코드작성
              }*/
        }
        System.out.println ("프로그램 종료");
	}
}
