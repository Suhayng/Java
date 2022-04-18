package Department.E1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
 * 백화점의 고객 관리 프로그램(상속과 다형성)
 * 
 * 고객 등급 :	1. 	일반고객(Silver) : 보너스 포인트(1%적립) 할인율 없음
 *  		2.	Gold고객 : 보너스 포인트(2%적립) 할인(5%)
 *  		3.	VIP고객 : 보너스 포인트(5%적립) 할인(10%), 담당 직원 있음
 */



class Customer {
	int customerID; // 고객 ID
	String customerName;
	String customerGrade; // 고객 등급("Silver", "Gold", "VIP")
	double bonusPoint; // 보너스 포인트 값
	double bonusRatio; // 보너스 포인트 적립율 : 실버 1%, 골드2%, VIP5%

	public double calcPrice(int price) {
		// 물품의 가격을 받아서 bonus포인트 적립하는 코드
		bonusRatio = 0.01;
		bonusPoint = bonusPoint + (price * bonusRatio);
		return price;
	}

	// 생성자에서 기본으로 2개의 필드의 값은 로드 : customerGrade, bonusRatio : 1%
	public String toString() {
		customerGrade = "Silver";
		bonusRatio = 0.01;
		return "고객ID : " + customerID + ", 고객명 : " + customerName + ", 고객등급 : " + customerGrade + ", 포인트 값 : "
				+ bonusPoint + ", 적립율 : " + bonusRatio;
	}

}

class GoldCustomer extends Customer {
	double saleRatio; // 물품 할인율 : 생성자에서 기본으로 : 5%

	@Override
	public double calcPrice(int price) {
		this.saleRatio = 0.05;
		super.bonusRatio = 0.02;
		super.bonusPoint = super.bonusPoint + (price * super.bonusRatio);
		return (price - (price * this.saleRatio));
	}

	@Override
	public String toString() {
		this.saleRatio = 0.05;
		super.customerGrade = "Gold";
		super.bonusRatio = 0.02;
		return "고객ID : " + customerID + ", 고객명 : " + customerName + ", 고객등급 : " + customerGrade + ", 포인트 값 : "
				+ bonusPoint + ", 적립율 : " + bonusRatio + ", 할인율 : " + this.saleRatio;
	}

	// 생성자에서 기본으로 2개의 필드의 값은 로드 : customerGrade, bonusRatio : % saleRatio : 5%

}

class VipCustomer extends GoldCustomer {

	private int agentID; // 바로 접근할 수 없다. 생성자 or setter로 접근

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

	@Override
	public double calcPrice(int price) {
		super.saleRatio = 0.1;
		bonusRatio = 0.05;
		this.bonusPoint = bonusPoint + (price * bonusRatio);
		return (price - (price * this.saleRatio));
	}

	@Override
	public String toString() {
		super.saleRatio = 0.1;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		return "고객ID : " + customerID + ", 고객명 : " + customerName + ", 고객등급 : " + customerGrade + ", 포인트 값 : "
				+ bonusPoint + ", 적립율 : " + bonusRatio + ", 할인율" + this.saleRatio + ", 에이전트ID : " + agentID;
	}

}

public class Customer_Management {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Customer> customerSet = new HashSet<>();

		Customer customer = new Customer();
		GoldCustomer goldCustomer = new GoldCustomer();
		VipCustomer vipCustomer = new VipCustomer();

		boolean run = true;

		while (run) {

			System.out.println(
					"=============================================================================================\r\n"
							+ "1. 일반고객 등록 |   2. VIP 고객등록   |  3. Gold 고객 등록 |  4. 정보 출력  |  5. 물품구매  | 6. 종료 \r\n"
							+ "=============================================================================================");
			int num = sc.nextInt();
			if (num == 1) {
				System.out.println("일반 고객 등록");
				System.out.print("고객 아이디 : ");
				customer.customerID = sc.nextInt();
				System.out.print("고객 이름 :");
				customer.customerName = sc.next();
				customerSet.add(customer);
				System.out.println("등록 완료");
			} else if (num == 2) {
				System.out.println("VIP 등록");
				System.out.print("VIP고객 아이디 : ");
				vipCustomer.customerID = sc.nextInt();
				System.out.print("고객 이름 :");
				vipCustomer.customerName = sc.next();
				System.out.println("담당 에이전트ID 등록 : ");
				vipCustomer.setAgentID(sc.nextInt());
				customerSet.add(vipCustomer);
				System.out.println("등록 완료");
			} else if (num == 3) {
				System.out.println("골드 고객 등록");
				System.out.print("고객 아이디 : ");
				goldCustomer.customerID = sc.nextInt();
				System.out.print("고객 이름 :");
				goldCustomer.customerName = sc.next();
				customerSet.add(goldCustomer);
				System.out.println("등록 완료");
			} else if (num == 4) {
				System.out.print("찾으실 고객ID번호를 입력 하세요 : ");
				int searchId = sc.nextInt();
				for (Customer k : customerSet) {
					if (k.customerID == searchId) {
						System.out.println(k.toString());
					}
				}
			} else if (num == 5) {
				System.out.println("구매하실 분의 ID를 입력하여 주세요");
				int searchId = sc.nextInt();
				for (Customer k : customerSet) {
					if (k.customerID == searchId) {
						System.out.println("물풀가격을 지불해 주새요");
						System.out.println("구매 물품 가격 : ");
						int price = sc.nextInt();
						System.out.println(k.calcPrice(price) + "결제 되었습니다");
						System.out.println(k.customerName + "고객님의 등급은" + k.customerGrade + "이고, 현재 포인트는 " + k.bonusPoint
								+ "이고, 할인은 " + k.bonusRatio + "% 되셨습니다.");
					}
				}
			} else if (num == 6) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
		}
	}

}
