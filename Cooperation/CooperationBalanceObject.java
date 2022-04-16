package Cooperation;

import java.util.ArrayList;
import java.util.Scanner;

/*
 	��ü ���� ���� (���x)
 	
 			�л��� �뵷 100,000��	
 	�л�     :           ������ Ż ��(-1000��)  ����ö�� Ż ��(-1500��)
 	����		: 1,000�� 	�°��� ����, ���� ����
 	����ö	: 1,500��						�°��� ����, ���� ����
 	
 */

class Student {
	String studentName ;	//�л� �̸�
	int money;				//�л��� ���� ��, �ʱⰪ : 100,000
	
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

	public void takeBus(Bus bus) {	//�л��� ������ ���� �� ������ ���� ���� �ؾ� �Ѵ�.
		bus.take(1000);
		money -= 1000;
	}
	
	public void takeOutBus (Bus bus) {	//�л��� �������� ������ ��.
		bus.takeOut();
	}
	
	public void takeSubway(Subway subway) { //����ö Ż ��
		subway.take(1500);
		money -= 1500;
	}
	
	public void takeOutSubway(Subway subway) { //����ö ���� ��
		subway.takeOut();
	}
	
	public String toString() {
		return "  " + studentName + "     " + money + "��";
		
	}
}

class Bus {
	int busName;		//100�� ����, 200�� ����	<== ��ǲ���� �޾Ƽ� ������
	int passengerCount;	//�°���
	int money;			//������ ����	
	
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

	public void take(int money) {	// ������ ������ ó��, �°��� ó��
		passengerCount++;
		this.money += money;
	}
	public void takeOut() {	//�°����� ����
		passengerCount--;
	}
	
}

class Subway{
	String lineNumber;	//"1ȣ��", "2ȣ��", "3ȣ��"
	int passengerCount;	//�°���
	int money;			//����
	
	
	
	//�����ڸ� ���ؼ� ����ö ȣ���� ��ǲ �޾Ƽ� Ȱ��ȭ
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public String getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}



	public void take(int money) { //������ ó���ϴ� �޼ҵ�, �°��� ó��
		passengerCount++;
		this.money += money;
	}
	public void takeOut() {	//�°����� ����
		passengerCount--;
	}
}

/*
�л� 5�� �Է� : �л��� 100,000���� �ʱⰪ �Ҵ�. 
=============================================
1. �л���ü ����  | 2. �л����� ��� �� ����  
3. ������ Ž |  4.  ������ ���� 5. ����ö�� Ž , 6. ����ö�� ����.   7. ����  
=============================================
����>> 1
�л��̸�  : 
 �� �Է�   : 

����>> 2 
=====�л����� ���=====
�л��̸�	������



�л�����(�̸��Է�)>> 


����>> 3
000 �� 000 �� ������ �����ϴ�. ��ſ� �Ϸ�Ǽ���. 
000 ���� �������� 000 �Դϴ�. 
���� 000���� �°��� 000���̰� ������000 �Դϴ�. 

����>> 4
000 �� 000 �� ������ ���Ƚ��ϴ�. �¹���~~~. 
000 ���� �������� 000 �Դϴ�. 
���� 00���� �°��� 000���̰� ������ 000 �Դϴ�. 

����>> 5
000 �� 000 ȣ�� ����ö�� �����ϴ�. ��ſ� �Ϸ�Ǽ���. 
000 ���� �������� 000 �Դϴ�. 
����ö 00 ȣ���� �°��� 00���̰� ������  000 �Դϴ�. 

����>> 6
000 �� 000 ȣ�� ����ö�� ���Ƚ��ϴ�. �ȳ� ~~~
000 ���� �������� 000 �Դϴ�. 
����ö 00 ȣ���� �°��� 00���̰� ������  000 �Դϴ�. 
*/ 

public class CooperationBalanceObject {
	public static void main(String[] args) {

		ArrayList<Student> studentList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		Bus b1 = new Bus(0);
		
		while(true) {
			System.out.println("======================");
			System.out.println("1. �л� ��ü ���� ");
			System.out.println("2. �л� ���� ��� �� ���� ");
			System.out.println("3. ������ Ž");
			System.out.println("4. ������ ����");
			System.out.println("5. ����ö�� Ž");
			System.out.println("6. ����ö�� ����");
			System.out.println("7. ����");
			System.out.println("======================");
			System.out.println("��ȣ�� �����ϼ��� >>");
			int Num = sc.nextInt();
			
			if(Num == 1) {
				Student s1 = new Student(null, 0);
				System.out.println("(1) �л� ��ü �����ϼ���.");
				System.out.println("- �л� �̸� : ");
				s1.setStudentName(sc.next());;
				System.out.println("- �ʱⰪ : ");
				s1.setMoney(sc.nextInt());
				
				studentList.add(s1);
				System.out.println(s1.getStudentName() + " ���� ������ �ԷµǾ����ϴ�.");
			} else if(Num == 2) {
				System.out.println("(2) �л� ���� ��� �� ������ �ϼ���.");
				System.out.println("---�л� ���� ���---");
				System.out.println(" �л� �̸� | ���� �� ");
				if(studentList.size() != 0) {
					for(Student k : studentList) {
						System.out.println(k);
					}
				}else {
						System.out.println("�Էµ� �л� ������ �����ϴ�.");
					}
				
				
				System.out.println();
				System.out.println("�л� �̸��� �����ϼ��� >>");
				s1.setStudentName(sc.next());
				if(studentList.size() != 0) {
					for(int i = 0; i < studentList.size(); i++) {
						if(studentList.equals(studentList.get(i).getStudentName())){
							System.out.println(s1.getStudentName() + "���� ������ ���õǾ����ϴ�.");
						}
					}
				} else {
					System.out.println("�ش� �л� ������ �������� �ʽ��ϴ�.");
				}
			}else if (Num == 3) {
				System.out.println("(3) �л��� ź ���� ��ȣ�� �Է��ϼ���.");
				b1.setBusName(sc.nextInt());
				s1.takeBus(b1);
				System.out.println(s1.getStudentName() + "���� " + b1.getBusName() +"�� ������ �����ϴ�. ��ſ� �Ϸ� �Ǽ��� *^^*");
				System.out.println(s1.getStudentName() + "���� �ܾ��� " + s1.getMoney() + "�� �Դϴ�.");
				System.out.println("���� " + b1.getBusName() + "���� �°��� " + b1.getPassengerCount() + "�� �Դϴ�.");
				}
				
				
				
			}
		} 
		
	}

