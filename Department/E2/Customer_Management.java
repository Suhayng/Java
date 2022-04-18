package Department.E2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

/*
  백화점의 고객관리 프로그램. (상속과 다형성 문제)
  
  고객등급 :  1. Silver고객 : 보너스 포인트(1% 적립) / 할인율 없음
  			2. Gold 고객 : 보너스 포인트(2% 적립) / 할인율 (5%)
  			3. VIP 고객 : 보너스 포인트(5%적립) / 할인율 (10%) , 담당 에이전트 존재
 */



class Customer{ 		// 일반고객 (Silver)
	int customerId;  // 고객 아이디
	String customerName; // 고객이름
	String customerGrade;	// 고객 등급 (실버 골드 브이아이피)
	double bonusP;	// 보너스포인트값 
	double bonusRatio; //보너스 적립율 (silver -> 1%.....
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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

	public double getBonusP() {
		return bonusP;
	}

	public void setBonusP(double bonusP) {
		this.bonusP = bonusP;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}

	// 생성자에서 기본으로 두개의 필드, (고객 등급, 보너스 적립율)은 기본값으로 지정해줘야 함
	public Customer() {
		customerGrade = "Silver";
		bonusRatio = 0.01;
	}
	
	public Customer(int customerId, String customerName, String customerGrade, double bonusRatio) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerGrade = customerGrade;
		this.bonusRatio = bonusRatio;
	}
	
	// 물품의 가격을 받아서 보너스 포인트를 적립하는 코드
	public double calcPrice(int price) {			// 하위 클래스에서 오버라이딩해서 처리
		// 값을 인풋받아서 보너스 포인트를 적용하고 보너스 포인트 필드에 적용해줌 
		bonusP = bonusP + (price * bonusRatio);
		
		return price; //할인된 가격을 리턴
	}
	
	@Override
		public String toString() {
			
			return "고객ID\t\t " + customerId + "\t고객이름\t\t" + customerName + "\t고객등급\t\t" + customerGrade + "\t보너스포인트비율\t\t " + bonusRatio ;
		}
	
	//중복 X
	@Override
		public boolean equals(Object obj) {
			if (obj instanceof Customer) {
				if (this.customerId == ((Customer)obj).customerId) {
					return true;
				}
			}
			return false;
		}
	
	@Override
		public int hashCode() {
			return Objects.hash(customerId);
		}
}

class GoldCustomer extends Customer {
	double saleRatio;  //  물품 할인율 : 생성자에서 기본으로 지정해줘야 하는 할인율(일반고객에는 없으므로 따로 지정해 줬음)
	
	//생성자에서 기본으로 3개의 필드의 값은 로드
	public GoldCustomer() {
		customerGrade = "Gold";
		bonusRatio = 0.02;
		saleRatio = 0.05;
	}
	
	public GoldCustomer(int customerId, String customerName, String customerGrade, double bonusRatio, double saleRatio) {
		super(customerId, customerName, customerGrade, bonusRatio);
		this.saleRatio = saleRatio;
	}
	
	
	
	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	

	@Override
	public double calcPrice(int price) {
		bonusP = bonusP + (price * bonusRatio);
		price = (int) (price - (price * saleRatio));
		return price;
	}
	
	@Override
	public String toString() {
		return "고객ID\t\t " + customerId + "\t고객이름\t\t" + customerName + "\t고객등급\t\t" + customerGrade + "\t할인율\t\t" + saleRatio  + "\t보너스포인트비율\t\t " + bonusRatio ;
	}
}

class VipCustomer extends Customer {
	private int agentID;   // private -> 생성자나 setter를 통해 접근해야 함. 필드로 접근 못함
	double saleRatio; // 물품 할인율 : 10%
	
	//생성자에서 기본으로 4개의 필드의 값은 로드
	public VipCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public VipCustomer(int customerId, String customerName, String customerGrade, double bonusRatio, double saleRatio, int agentID) {
		super(customerId, customerName, customerGrade, bonusRatio);
		this.saleRatio = saleRatio;
		this.agentID = agentID;
		
	}
	
	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
	@Override
	public double calcPrice(int price) {
		bonusP = bonusP + (price * bonusRatio);
		price = (int) (price - (price * saleRatio));
		return price;
	}
	
	@Override
	public String toString() {
		return "고객ID\t\t " + customerId + "\t고객이름\t\t" + customerName + "\t고객등급\t\t" + customerGrade + "\t할인율\t\t" + saleRatio  + "\t보너스포인트비율\t\t " + bonusRatio + "\tAgentID(Vip고객)\t\t" + agentID;
	}
	
}

public class Customer_Management {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashSet<Customer> hashSet = new HashSet<Customer>();  // 고객 아이디가 중복되지 않게
		
		while (true) {
			System.out.println("=============================================================================================\r\n"
					+ "1. 일반고객 등록	|   2. VIP 고객등록      |  3. Gold 고객 등록   4. 정보 출력    5. 물품구매  6. 종료 \r\n"
					+ "=============================================================================================\r\n"
					+ "선택 >>");
			
			int selectNum = scanner.nextInt();
			if (selectNum ==1) {
				Customer customer = new Customer();
				System.out.println("==일반고객 등록 입니다. ==");
				
				System.out.println("고객 ID를 입력하세요 >>> ");
				int c_id = scanner.nextInt();
				
				System.out.println("고객 이름을 입력하세요 >>>");
				String c_Name = scanner.next();
				
				hashSet.add(new Customer(c_id, c_Name, customer.getCustomerGrade(), customer.getBonusRatio()));
				
				System.out.println("잘 등록되었습니다. ");
				
			}else if (selectNum == 2) {
				VipCustomer customer = new VipCustomer();
				System.out.println("==Vip고객 등록 입니다. ==");
				
				System.out.println("고객 ID를 입력하세요 >>> ");
				int c_id = scanner.nextInt();
				
				System.out.println("고객 이름을 입력하세요 >>>");
				String c_Name = scanner.next();
				
				System.out.println("담당 Agent의 ID를 입력하세요 >>>");
				int a_id = scanner.nextInt();
				
				
				hashSet.add(new VipCustomer(c_id, c_Name, customer.getCustomerGrade(), customer.getBonusRatio(), customer.getSaleRatio(), a_id));
				
			}else if (selectNum == 3) {
				GoldCustomer customer = new GoldCustomer();
				System.out.println("==Gold고객 등록 입니다. ==");
				
				System.out.println("고객 ID를 입력하세요 >>> ");
				int c_id = scanner.nextInt();
				
				System.out.println("고객 이름을 입력하세요 >>>");
				String c_Name = scanner.next();
				
				hashSet.add(new GoldCustomer(c_id, c_Name, customer.getCustomerGrade(), customer.getBonusRatio(), customer.getSaleRatio()));
				
			}else if (selectNum == 4) {
				System.out.println("==고객 정보 출력  입니다. ==");
				
				for (Customer customer : hashSet) {
					System.out.println(customer);
				}
				
			}else if (selectNum == 5) {
				Customer customer = new Customer();
				GoldCustomer Gcustomer = new GoldCustomer();
				VipCustomer vCustomer = new VipCustomer();
				System.out.println("==물품가격을 지불해 주세요==");
				System.out.println("고객 ID를 입력하세요 >>> ");
				int c_id = scanner.nextInt();
				System.out.println("구매한 물품의 가격을 입력하세요 >>> ");
				int price = scanner.nextInt();
	
				Iterator<Customer> iterator = hashSet.iterator();
				while (iterator.hasNext()) {
					Customer customer2 = iterator.next();
					if(c_id == customer2.getCustomerId()) {
						c_id = customer2.getCustomerId();
						if (customer2.getCustomerGrade().equals("Gold")) {
							int Gprice = (int) Gcustomer.calcPrice(price) ;
							System.out.println( customer2.getCustomerName() + "고객님" + Gprice + " 원 지불하셨습니다. ");
							System.out.println(customer2.getCustomerName() + "고객님의 등급은 " + customer2.getCustomerGrade() + "이고 현재 포인트는 " + Gcustomer.getBonusP()  + "할인은 " + (price - Gprice)  + "원 되었습니다. ");
							
						}if(customer2.getCustomerGrade().equals("VIP")) {
							int Vprice = (int) vCustomer.calcPrice(price) ;
							System.out.println( customer2.getCustomerName() + "고객님" + Vprice + " 원 지불하셨습니다. ");
							System.out.println(customer2.getCustomerName() + "고객님의 등급은 " + customer2.getCustomerGrade() + "이고 현재 포인트는 " + vCustomer.getBonusP()  + "할인은 " + (price - Vprice)  + "원 되었습니다. ");
						}if(customer2.getCustomerGrade().equals("Silver")) {
							int Sprice = (int) customer.calcPrice(price) ;
							System.out.println( customer2.getCustomerName() + "고객님" + Sprice + " 원 지불하셨습니다. ");
							System.out.println(customer2.getCustomerName() + "고객님의 등급은 " + customer2.getCustomerGrade() + "이고 현재 포인트는 " + customer.getBonusP()  + "할인은 " + (price - Sprice)  + "원 되었습니다. ");
						}
					}
				}
			}else if (selectNum == 6) {
				break;
			}
		}
		scanner.close();
		System.out.println("프로그램이 종료되었습니다.");
	}

}
