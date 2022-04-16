package Department;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

/*
 	��ȭ���� �� ���� ���α׷� (��Ӱ� ������)
 	
 	�� ��� : 1. �Ϲ� ��(Silver) : ���ʽ� ����Ʈ(1% ����), ������(����) 
 			 2. Gold �� : ���ʽ� ����Ʈ(2% ����), ������(5%)
 			 3. VIP �� : ���ʽ� ����Ʈ(5% ����), ������(10%), ��翡����Ʈ�� ����	
 */

class Customer{				//�Ϲ� ��(Silver)
	int customerID;			//�� ID
	String customerName;	//�� �̸�
	String customerGrade;	//�� ���("Silver", "Gold", "VIP")
	double bounsPoint;		//���ʽ� ����Ʈ �� :
	double bounsRatio;		//���ʽ� ����Ʈ ������ : 	"Silver : 1%", "Gold : 2%", "VIP : 5%"
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


	
	public double calcPrice(int price) {  // ���� Ŭ�������� �������̵� �ؼ� ó��
		bounsPoint = bounsPoint + price*bounsRatio; 
		return price; // ���ε� ������ ����
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
	
	double saleRatio;		//��ǰ ������ : �����ڿ��� �⺻���� 
	
	//�����ڿ��� �⺻���� 2���� �ʵ��� ���� �ε� : custonerGrade : Gold , bonusRatio : 2%
	
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
	private int agentID;	//������, setter, �ʵ�(X)
	double saleRatio;		//��ǰ ������ : 10%
	
	public VIPCustomer(int customerID, String customerName, int agentID ) {
		super(customerID, customerName);
		this.agentID = agentID;
		customerGrade = "VIP";
		bounsRatio = 0.05;
		saleRatio = 0.1; 
	}
	//�����ڿ��� �⺻���� 2���� �ʵ��� ���� �ε� : custonerGrade : VIP , bonusRatio : 5%
	
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
1. �Ϲݰ� ���	|   2. VIP �����      |  3. Gold �� ���   4. ���� ���    5. ��ǰ����  5. ���� 
=========================================================================================
���� >> 1
==�Ϲݰ� ��� �Դϴ�. ==
�� ���̵� : 
���̸� : 

���� >>2
==VIP �� ��� �Դϴ�. ==
�� ���̵� : 
���̸� : 
��翡����Ʈ(ID) ��� : 

���� >>3
==Gold �� ��� �Դϴ�. ==
�� ���̵� : 
���̸� : 

���� >>4
==�� ���� ���  �Դϴ�. ==
��ID	���̸�	�����	���η� ���ʽ�����Ʈ����	 ������ƮID<VIP��>


���� >>5
==��ǰ������ ������ �ּ��� ==
�� ���̵� : 
���� ��ǰ ���� :  

000 ���� 000 �� ���� �ϼ̽��ϴ�. 
000 ������ ����� 000 �̰� ���� ����Ʈ�� 000 �̰� ������ 000�� �Ǿ����ϴ�. 

*/



public class Customer_Managment {
	public static void main(String[] args) {
		
		Set<Customer> customerList = new HashSet<>();
		//��ID �ߺ� ���� �ʵ��� ó��
		Scanner sc = new Scanner(System.in);
		Customer silver = new Customer(0, null);
		VIPCustomer vip = new VIPCustomer(0, null, 0);
		GoldCustomer gold = new GoldCustomer(0, null);
		
		while(true) {
			System.out.println("============================================================================");
			System.out.println(" 1. �Ϲ� �� | 2. VIP ����� | 3. Gold ����� | 4. ���� ��� | 5. ��ǰ���� | 6. ����");
			System.out.println("============================================================================");
			System.out.println("���� >>");
			int Num = sc.nextInt();
			
			if(Num == 1) {
				System.out.println(" ----�Ϲ� �� ����Դϴ�.----");
				System.out.println("- �� ���̵� : ");
				silver.setCustomerID(sc.nextInt());
				System.out.println("- �� �̸� : ");
				silver.setCustomerName(sc.next());
				System.out.println();

				customerList.add(silver);
				System.out.println( silver.getCustomerName() + "���� ������ ���������� �ԷµǾ����ϴ�.");
			} else if(Num == 2){
				System.out.println(" ----VIP �� ����Դϴ�.----");
				System.out.println("- �� ���̵� : ");
				vip.setCustomerID(sc.nextInt());
				System.out.println("- �� �̸� : ");
				vip.setCustomerName(sc.next());
				System.out.println("- ������Ʈ ���̵� : ");
				vip.setAgentID(sc.nextInt());
				System.out.println();

				customerList.add(vip);
				System.out.println(vip.getCustomerName() + "���� ������ ���������� �ԷµǾ����ϴ�.");
			} else if(Num == 3) {
				System.out.println(" ----Gold �� ����Դϴ�.----");
				System.out.println("- �� ���̵� : ");
				gold.setCustomerID(sc.nextInt());
				System.out.println("- �� �̸� : ");
				gold.setCustomerName(sc.next());
				System.out.println();
				
				customerList.add(gold);
				System.out.println(gold.getCustomerName() + "���� ������ ���������� �ԷµǾ����ϴ�.");
			} else if (Num == 4) {
				System.out.println("��ID	���̸�	�����	���η�	���ʽ�����Ʈ����	������ƮID<VIP��>");
				for(Customer k : customerList) {
					System.out.println(k);
				}
			} else if(Num == 5) {
				System.out.println("----��ǰ ������ �������ּ���----");
				System.out.println("- �� ���̵� : ");
				int customerID = sc.nextInt();
				System.out.println("- ���� ��ǰ ���� : ");
				int price = sc.nextInt();
				System.out.println();
				if(customerID == silver.getCustomerID()) {
					silver.calcPrice(price);
					System.out.println(silver.getCustomerName() + " ������ " + price + " �� �����ϼ̽��ϴ�.");
					System.out.println(silver.getCustomerName() + " ������ ����� " + silver.getCustomerGrade() + " �̰�, ���� ����Ʈ�� " + silver.bounsPoint + " �Դϴ�." );
				}else if(customerID == gold.getCustomerID()) {
					gold.calcPrice(price);
					System.out.println(gold.getCustomerName() + " ������ " + price + " �� �����ϼ̽��ϴ�.");
					System.out.println(gold.getCustomerName() + " ������ ����� " + gold.getCustomerGrade() + " �̰�, ���� ����Ʈ�� " + gold.bounsPoint + " �̰�, ������ " + price*gold.saleRatio + " �� �Ǿ����ϴ�.");	
					
				}else if(customerID == vip.getCustomerID()) {
					vip.calcPrice(price);
					System.out.println(vip.getCustomerName() + " ������ " + price + " �� �����ϼ̽��ϴ�.");
					System.out.println(vip.getCustomerName() + " ������ ����� " + vip.getCustomerGrade() + " �̰�, ���� ����Ʈ�� " + vip.bounsPoint + " �̰�, ������ " + price*vip.saleRatio + " �� �Ǿ����ϴ�." );	
				}else {
					System.out.println("��� ���� ���� ȸ���Դϴ�.");
				}
			} else if (Num == 6) {
				break;
			}
			
			}
			System.out.println("���α׷��� ����Ǿ����ϴ�.");
			sc.close();
		}
	}

