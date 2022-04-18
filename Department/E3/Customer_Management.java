package Department.E3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;


/*
	백화점의 고객 관리 프로그램 (상속과 다형성)
	
	고객 등급 : 1. 일반고객 (Silver) , 보너스 포인트 (1%적립) , 할인율(없음)
			  2. Gold 고객 : 보너스 포인트 (2% 적립) , 할인률(5%)
			  3. VIP 고객 : 보너스포인트 (5%적립), 할인률(10%), 담당에이전트가 존재 

*/

// 일반고객 클래스
class Customer{
	int id;		   // 고객 ID
	String name;   // 고객 이름
	String grade;  // 고객 등급 ( silver , gold , vip )
	double bounsPoint; 	   // 보너스 포인트 값
	double bounsRatio;     // 보너스 포인트 적립률 
	
	
	public double calcPrice(double price) {	
		
		
		double bouns = (double)price*0.01;
		bounsPoint += bouns;
		
		System.out.println(name + "고객님 " + price + "원 지불 하셨습니다");
		System.out.println(name + "고객님의 등급은 " + grade + "이고 현재 포인트는 " + bounsPoint +"원입니다" );
		return price;					 
	}
	
	Customer (int a , String b ){
		id = a;
		name = b;
		grade = "SILVER";
		bounsRatio = 1;
	}
	
	@Override
	public String toString() {
		return id + "    " + name + "   " + grade + "        " + bounsRatio + "%" + "       " ;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Customer) {
			if(id == ((Customer)obj).id) {
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
}






// 골드고객 클래스
class GoldCustomer extends Customer{
	double saleRatio; 

	GoldCustomer(int a, String b) {
		super(a, b);
		super.grade = "Gold";
		super.bounsRatio = 2;
		saleRatio = 5;
	}
	
	@Override
	public String toString() {
		return super.toString() + saleRatio+ "%";
	}
	
	@Override
	public double calcPrice(double price) {
		
		double bouns = (double)price*0.02;
		super.bounsPoint += bouns;
		
		double sale = (double)price*0.05;
		
		price = price -sale;
		
		System.out.println(name + "고객님 " + price + "원 지불 하셨습니다");
		System.out.println(name + "고객님의 등급은 " + grade + "이고 현재 포인트는 " + bounsPoint +"원이고 할인은 "+ sale+"원 되었습니다" );
		return price;
	}

}






// VIP 고객 클래스
class VipCustomer extends Customer{
	
	private int agentid ;    
	double saleRatio; 	
	
	public int getAgentid() {
		return agentid;
	}

	public void setAgentid(int agentid) {
		this.agentid = agentid;
	}

	VipCustomer(int a, String b) {
		super(a, b);
		super.grade = "VIP";
		super.bounsRatio = 5;
		saleRatio = 10;
	}
	
	@Override
	public String toString() {
		return super.toString() + saleRatio+ "%" + "           " + agentid;
	}
	
	@Override
	public double calcPrice(double price) {
		
		double bouns = (double)price*0.05;
		super.bounsPoint += bouns;
		
		double sale = (double)price*0.1;
		
		price = price -sale;
		
		System.out.println(name + "고객님 " + price + "원 지불 하셨습니다");
		System.out.println(name + "고객님의 등급은 " + grade + "이고 현재 포인트는 " + bounsPoint +"원이고 할인은 "+ sale+"원 되었습니다" );
		return price;
	}
	
	
	
	
}
















public class Customer_Management {

	public static void main(String[] args) {
		
		Set <Customer> customerset = new HashSet();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("=============================================================================================");
			System.out.println("1.일반고객 등록  |  2. VIP고객등록  | 3.Gold 고객 등록 | 4. 정보출력 | 5. 물품구매 | 6. 종료");
			System.out.println("=============================================================================================");
			System.out.print("선택 >>");
			int  num = sc.nextInt();
			
			// 일반고객 등록
			if(num ==1 ) {

				System.out.println("==일반고객 등록 입니다==");
				System.out.print("고객 아이디 :");
				int id = sc.nextInt();
				System.out.print("고객 이름 : ");
				String name = sc.next();
				Customer cus = new Customer(id, name);
				customerset.add(cus);
			
				
			// VIP 고객 등록
			}else if (num ==2) {
				
				System.out.println("==VIP고객 등록 입니다==");
				System.out.print("고객 아이디 :");
				int id = sc.nextInt();
				System.out.print("고객 이름 : ");
				String name = sc.next();
				System.out.print("담당에이전트(ID) 등록 : ");
				int agent = sc.nextInt();
				VipCustomer vcus = new VipCustomer(id, name);
				vcus.setAgentid(agent); 
				customerset.add(vcus);
			
				
			// GOld 고객 등록
			}else if (num == 3) {
				
				System.out.println("==GOLD고객 등록 입니다==");
				System.out.print("고객 아이디 :");
				int id = sc.nextInt();
				System.out.print("고객 이름 : ");
				String name = sc.next();
				GoldCustomer gcus = new GoldCustomer(id, name);
				customerset.add(gcus);
				
				
			// 고객 정보 출력	
			}else if (num ==4) {
				System.out.println("==고객 정보 출력 입니다==");
				System.out.println("고객ID	고객이름	고객등급	보너스적립률  할인률	에이젼트ID<VIP고객>");
				for(Customer c : customerset) {
					System.out.println(c);
				}
			
				
			// 물품구매	
			}else if (num == 5) {
				System.out.println("==물품구매==");
				System.out.print("고객 아이디 :");
				int id = sc.nextInt();
				
				// 같은 id 찾기 
				Iterator<Customer> ir = customerset.iterator();
				Customer c1 = null;
				while(ir.hasNext()) {
					Customer c2 = ir.next();
					if(id == c2.id) {
						c1 = c2;
					}
				}
				System.out.print("물품가격을 입력 해주세요 : ");
				int price = sc.nextInt();
				
				c1.calcPrice(price);
				
				
			// 종료	
			}else if (num ==6) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
