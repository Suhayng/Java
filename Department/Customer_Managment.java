package Department;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

/*
 	백화점의 고객 관리 프로그램 (상속과 다형성)
 	
 	고객 등급 : 1. 일반 고객(Silver) : 보너스 포인트(1% 적립), 할인율(없음) 
 			 2. Gold 고객 : 보너스 포인트(2% 적립), 할인율(5%)
 			 3. VIP 고객 : 보너스 포인트(5% 적립), 할인율(10%), 담당에이전트가 존재	
 */

class Customer{				//일반 고객(Silver)
	int customerID;			//고객 ID
	String customerName;	//고객 이름
	String customerGrade;	//고객 등급("Silver", "Gold", "VIP")
	double bounsPoint;		//보너스 포인트 값 :
	double bounsRatio;		//보너스 포인트 적립율 : 	"Silver : 1%", "Gold : 2%", "VIP : 5%"
	double saleRatio;	
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "Silver";
		bounsRatio = 0.01;
	}
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}


	
	public double calcPrice(int price) {  // 하위 클래스에서 오버라이딩 해서 처리
		bounsPoint = bounsPoint + price*bounsRatio; 
		return price; // 할인된 가격을 리턴
	}
	

	@Override
		public int hashCode() {
			return Objects.hash(customerID);
		}
	
	@Override
		public boolean equals(Object obj) {
			if(obj instanceof Customer) {
				if(customerID ==((Customer)obj).customerID) {
					return true;
				}
			}
			return false;
		}

	public int compare(Customer o1, Customer o2) {
		if(o1.getCustomerID() < o2.getCustomerID()) { 	
			return -1;
		}else if(o1.getCustomerID() == o2.getCustomerID()) {
			return 0;
		}else {
			return 1;
		}
	}
	
	

	
	public String toString() {
		return customerID + "\t" + customerName + "\t" + customerGrade + "\t" + saleRatio*100 +"%" + "\t" + bounsRatio*100 +"%" + "\t";
}

}

class GoldCustomer extends Customer{
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "Gold";
		bounsRatio = 0.02;
		saleRatio = 0.05;
	}
	
	double saleRatio;		//물품 할인율 : 생성자에서 기본으로 
	
	//생성자에서 기본으로 2개의 필드의 값은 로드 : custonerGrade : Gold , bonusRatio : 2%
	
	@Override
	public double calcPrice(int price) {
		bounsPoint += price * bounsRatio;
		return price - (double)(price * saleRatio);
	}
	
	public String toString() {
		return customerID + "\t" + customerName + "\t" + customerGrade + "\t" + saleRatio*100 +"%" + "\t"  + bounsRatio*100 +"%" ;
	}
}

class VIPCustomer extends Customer {
	private int agentID;	//생성자, setter, 필드(X)
	double saleRatio;		//물품 할인율 : 10%
	
	public VIPCustomer(int customerID, String customerName, int agentID ) {
		super(customerID, customerName);
		this.agentID = agentID;
		customerGrade = "VIP";
		bounsRatio = 0.05;
		saleRatio = 0.1; 
	}
	//생성자에서 기본으로 2개의 필드의 값은 로드 : custonerGrade : VIP , bonusRatio : 5%
	
	public int getAgentID() {
		return agentID;
	}
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
	@Override
	public double calcPrice(int price) {
		bounsPoint += price * bounsRatio;
		return price - (double)(price * saleRatio);
	}

	public String toString() {
		return customerID + "\t" + customerName + "\t" + customerGrade + "\t" + saleRatio*100 +"%" + "\t" + bounsRatio*100 +"%" + "\t\t" +agentID;
	}
}

/*

=========================================================================================
1. 일반고객 등록	|   2. VIP 고객등록      |  3. Gold 고객 등록   4. 정보 출력    5. 물품구매  5. 종료 
=========================================================================================
선택 >> 1
==일반고객 등록 입니다. ==
고객 아이디 : 
고객이름 : 

선택 >>2
==VIP 고객 등록 입니다. ==
고객 아이디 : 
고객이름 : 
담당에이젼트(ID) 등록 : 

선택 >>3
==Gold 고객 등록 입니다. ==
고객 아이디 : 
고객이름 : 

선택 >>4
==고객 정보 출력  입니다. ==
고객ID	고객이름	고객등급	할인률 보너스포인트비율	 에이젼트ID<VIP고객>


선택 >>5
==물품가격을 지불해 주세요 ==
고객 아이디 : 
구매 물품 가격 :  

000 고객님 000 원 지불 하셨습니다. 
000 고객님의 등급은 000 이고 현재 포인트는 000 이고 할인은 000원 되었습니다. 

*/



public class Customer_Managment {
	public static void main(String[] args) {
		
		Set<Customer> customerList = new HashSet<>();
		//고객ID 중복 되지 않도록 처리
		Scanner sc = new Scanner(System.in);
		Customer silver = new Customer(0, null);
		VIPCustomer vip = new VIPCustomer(0, null, 0);
		GoldCustomer gold = new GoldCustomer(0, null);
		
		while(true) {
			System.out.println("============================================================================");
			System.out.println(" 1. 일반 고객 | 2. VIP 고객등록 | 3. Gold 고객등록 | 4. 정보 출력 | 5. 물품구매 | 6. 종료");
			System.out.println("============================================================================");
			System.out.println("선택 >>");
			int Num = sc.nextInt();
			
			if(Num == 1) {
				System.out.println(" ----일반 고객 등록입니다.----");
				System.out.println("- 고객 아이디 : ");
				silver.setCustomerID(sc.nextInt());
				System.out.println("- 고객 이름 : ");
				silver.setCustomerName(sc.next());
				System.out.println();

				customerList.add(silver);
				System.out.println( silver.getCustomerName() + "님의 정보가 정상적으로 입력되었습니다.");
			} else if(Num == 2){
				System.out.println(" ----VIP 고객 등록입니다.----");
				System.out.println("- 고객 아이디 : ");
				vip.setCustomerID(sc.nextInt());
				System.out.println("- 고객 이름 : ");
				vip.setCustomerName(sc.next());
				System.out.println("- 에이전트 아이디 : ");
				vip.setAgentID(sc.nextInt());
				System.out.println();

				customerList.add(vip);
				System.out.println(vip.getCustomerName() + "님의 정보가 정상적으로 입력되었습니다.");
			} else if(Num == 3) {
				System.out.println(" ----Gold 고객 등록입니다.----");
				System.out.println("- 고객 아이디 : ");
				gold.setCustomerID(sc.nextInt());
				System.out.println("- 고객 이름 : ");
				gold.setCustomerName(sc.next());
				System.out.println();
				
				customerList.add(gold);
				System.out.println(gold.getCustomerName() + "님의 정보가 정상적으로 입력되었습니다.");
			} else if (Num == 4) {
				System.out.println("고객ID	고객이름	고객등급	할인률	보너스포인트비율	에이젼트ID<VIP고객>");
				for(Customer k : customerList) {
					System.out.println(k);
				}
			} else if(Num == 5) {
				System.out.println("----물품 가격을 지불해주세요----");
				System.out.println("- 고객 아이디 : ");
				int customerID = sc.nextInt();
				System.out.println("- 구매 물품 가격 : ");
				int price = sc.nextInt();
				System.out.println();
				if(customerID == silver.getCustomerID()) {
					silver.calcPrice(price);
					System.out.println(silver.getCustomerName() + " 고객님은 " + price + " 원 지불하셨습니다.");
					System.out.println(silver.getCustomerName() + " 고객님의 등급은 " + silver.getCustomerGrade() + " 이고, 현재 포인트는 " + silver.bounsPoint + " 입니다." );
				}else if(customerID == gold.getCustomerID()) {
					gold.calcPrice(price);
					System.out.println(gold.getCustomerName() + " 고객님은 " + price + " 원 지불하셨습니다.");
					System.out.println(gold.getCustomerName() + " 고객님의 등급은 " + gold.getCustomerGrade() + " 이고, 현재 포인트는 " + gold.bounsPoint + " 이고, 할인은 " + price*gold.saleRatio + " 원 되었습니다.");	
					
				}else if(customerID == vip.getCustomerID()) {
					vip.calcPrice(price);
					System.out.println(vip.getCustomerName() + " 고객님은 " + price + " 원 지불하셨습니다.");
					System.out.println(vip.getCustomerName() + " 고객님의 등급은 " + vip.getCustomerGrade() + " 이고, 현재 포인트는 " + vip.bounsPoint + " 이고, 할인은 " + price*vip.saleRatio + " 원 되었습니다." );	
				}else {
					System.out.println("등록 되지 않은 회원입니다.");
				}
			} else if (Num == 6) {
				break;
			}
			
			}
			System.out.println("프로그램이 종료되었습니다.");
			sc.close();
		}
	}

