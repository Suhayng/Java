package Cooperation;

import java.util.ArrayList;
import java.util.Scanner;

/*
 	객체 간의 협업 (상속x)
 	
 			학생의 용돈 100,000원	
 	학생     :           버스를 탈 때(-1000원)  지하철을 탈 때(-1500원)
 	버스		: 1,000원 	승객수 증가, 수입 증가
 	지하철	: 1,500원						승객수 증가, 수입 증가
 	
 */

class Student {
	String studentName ;	//학생 이름
	int money;				//학생이 가진 돈, 초기값 : 100,000
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void takeBus(Bus bus) {	//학생이 버스를 탔을 때 버스에 돈을 지불 해야 한다.
		bus.take(1000);
		money -= 1000;
	}
	
	public void takeOutBus (Bus bus) {	//학생이 버스에서 내렸을 때.
		bus.takeOut();
	}
	
	public void takeSubway(Subway subway) { //지하철 탈 때
		subway.take(1500);
		money -= 1500;
	}
	
	public void takeOutSubway(Subway subway) { //지하철 내릴 때
		subway.takeOut();
	}
	
	public String toString() {
		return "  " + studentName + "     " + money + "원";
		
	}
}

class Bus {
	int busName;		//100번 버스, 200번 버스	<== 인풋값을 받아서 생성자
	int passengerCount;	//승객수
	int money;			//버스의 수입	
	
	public Bus(int busName) {
		this.busName = busName;
	}
	
	public int getBusName() {
		return busName;
	}

	public void setBusName(int busName) {
		this.busName = busName;
	}

	public int getPassengerCount() {
		return passengerCount;
	}

	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}

	public void take(int money) {	// 버스의 수입을 처리, 승객수 처리
		passengerCount++;
		this.money += money;
	}
	public void takeOut() {	//승객수만 감소
		passengerCount--;
	}
	
}

class Subway{
	String lineNumber;	//"1호선", "2호선", "3호선"
	int passengerCount;	//승객수
	int money;			//수입
	
	
	
	//생성자를 통해서 지하철 호선을 인풋 받아서 활성화
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public String getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}



	public void take(int money) { //수입을 처리하는 메소드, 승객수 처리
		passengerCount++;
		this.money += money;
	}
	public void takeOut() {	//승객수만 감소
		passengerCount--;
	}
}

/*
학생 5명 입력 : 학생당 100,000만원 초기값 할당. 
=============================================
1. 학생객체 생성  | 2. 학생정보 출력 및 선택  
3. 버스를 탐 |  4.  버스를 내림 5. 지하철을 탐 , 6. 지하철을 내림.   7. 종료  
=============================================
선택>> 1
학생이름  : 
 돈 입력   : 

선택>> 2 
=====학생정보 출력=====
학생이름	가진돈



학생선택(이름입력)>> 


선택>> 3
000 님 000 번 버스를 탔습니다. 즐거운 하루되세요. 
000 님의 남은돈은 000 입니다. 
버스 000번의 승객은 000명이고 수입은000 입니다. 

선택>> 4
000 님 000 번 버스를 내렸습니다. 굿바이~~~. 
000 님의 남은돈은 000 입니다. 
버스 00번의 승객은 000명이고 수입은 000 입니다. 

선택>> 5
000 님 000 호선 지하철를 탔습니다. 즐거운 하루되세요. 
000 님의 남은돈은 000 입니다. 
지하철 00 호선의 승객은 00명이고 수입은  000 입니다. 

선택>> 6
000 님 000 호선 지하철를 내렸습니다. 안녕 ~~~
000 님의 남은돈은 000 입니다. 
지하철 00 호선의 승객은 00명이고 수입은  000 입니다. 
*/ 

public class CooperationBalanceObject {
	public static void main(String[] args) {

		ArrayList<Student> studentList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		Bus b1 = new Bus(0);
		
		while(true) {
			System.out.println("======================");
			System.out.println("1. 학생 객체 생성 ");
			System.out.println("2. 학생 정보 출력 및 선택 ");
			System.out.println("3. 버스를 탐");
			System.out.println("4. 버스를 내림");
			System.out.println("5. 지하철을 탐");
			System.out.println("6. 지하철을 내림");
			System.out.println("7. 종료");
			System.out.println("======================");
			System.out.println("번호를 선택하세요 >>");
			int Num = sc.nextInt();
			
			if(Num == 1) {
				Student s1 = new Student(null, 0);
				System.out.println("(1) 학생 객체 생성하세요.");
				System.out.println("- 학생 이름 : ");
				s1.setStudentName(sc.next());;
				System.out.println("- 초기값 : ");
				s1.setMoney(sc.nextInt());
				
				studentList.add(s1);
				System.out.println(s1.getStudentName() + " 님의 정보가 입력되었습니다.");
			} else if(Num == 2) {
				System.out.println("(2) 학생 정보 출력 및 선택을 하세요.");
				System.out.println("---학생 정보 출력---");
				System.out.println(" 학생 이름 | 가진 돈 ");
				if(studentList.size() != 0) {
					for(Student k : studentList) {
						System.out.println(k);
					}
				}else {
						System.out.println("입력된 학생 정보가 없습니다.");
					}
				
				
				System.out.println();
				System.out.println("학생 이름을 선택하세요 >>");
				s1.setStudentName(sc.next());
				if(studentList.size() != 0) {
					for(int i = 0; i < studentList.size(); i++) {
						if(studentList.equals(studentList.get(i).getStudentName())){
							System.out.println(s1.getStudentName() + "님의 정보가 선택되었습니다.");
						}
					}
				} else {
					System.out.println("해당 학생 정보가 존재하지 않습니다.");
				}
			}else if (Num == 3) {
				System.out.println("(3) 학생이 탄 버스 번호를 입력하세요.");
				b1.setBusName(sc.nextInt());
				s1.takeBus(b1);
				System.out.println(s1.getStudentName() + "님은 " + b1.getBusName() +"번 버스를 탔습니다. 즐거운 하루 되세요 *^^*");
				System.out.println(s1.getStudentName() + "님의 잔액은 " + s1.getMoney() + "원 입니다.");
				System.out.println("버스 " + b1.getBusName() + "번의 승객은 " + b1.getPassengerCount() + "명 입니다.");
				}
				
				
				
			}
		} 
		
	}

