package Department.E2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

/*
  ��ȭ���� ������ ���α׷�. (��Ӱ� ������ ����)
  
  ����� :  1. Silver�� : ���ʽ� ����Ʈ(1% ����) / ������ ����
  			2. Gold �� : ���ʽ� ����Ʈ(2% ����) / ������ (5%)
  			3. VIP �� : ���ʽ� ����Ʈ(5%����) / ������ (10%) , ��� ������Ʈ ����
 */



class Customer{ 		// �Ϲݰ� (Silver)
	int customerId;  // �� ���̵�
	String customerName; // ���̸�
	String customerGrade;	// �� ��� (�ǹ� ��� ���̾�����)
	double bonusP;	// ���ʽ�����Ʈ�� 
	double bonusRatio; //���ʽ� ������ (silver -> 1%.....
	
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

	// �����ڿ��� �⺻���� �ΰ��� �ʵ�, (�� ���, ���ʽ� ������)�� �⺻������ ��������� ��
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
	
	// ��ǰ�� ������ �޾Ƽ� ���ʽ� ����Ʈ�� �����ϴ� �ڵ�
	public double calcPrice(int price) {			// ���� Ŭ�������� �������̵��ؼ� ó��
		// ���� ��ǲ�޾Ƽ� ���ʽ� ����Ʈ�� �����ϰ� ���ʽ� ����Ʈ �ʵ忡 �������� 
		bonusP = bonusP + (price * bonusRatio);
		
		return price; //���ε� ������ ����
	}
	
	@Override
		public String toString() {
			
			return "��ID\t\t " + customerId + "\t���̸�\t\t" + customerName + "\t�����\t\t" + customerGrade + "\t���ʽ�����Ʈ����\t\t " + bonusRatio ;
		}
	
	//�ߺ� X
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
	double saleRatio;  //  ��ǰ ������ : �����ڿ��� �⺻���� ��������� �ϴ� ������(�Ϲݰ����� �����Ƿ� ���� ������ ����)
	
	//�����ڿ��� �⺻���� 3���� �ʵ��� ���� �ε�
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
		return "��ID\t\t " + customerId + "\t���̸�\t\t" + customerName + "\t�����\t\t" + customerGrade + "\t������\t\t" + saleRatio  + "\t���ʽ�����Ʈ����\t\t " + bonusRatio ;
	}
}

class VipCustomer extends Customer {
	private int agentID;   // private -> �����ڳ� setter�� ���� �����ؾ� ��. �ʵ�� ���� ����
	double saleRatio; // ��ǰ ������ : 10%
	
	//�����ڿ��� �⺻���� 4���� �ʵ��� ���� �ε�
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
		return "��ID\t\t " + customerId + "\t���̸�\t\t" + customerName + "\t�����\t\t" + customerGrade + "\t������\t\t" + saleRatio  + "\t���ʽ�����Ʈ����\t\t " + bonusRatio + "\tAgentID(Vip��)\t\t" + agentID;
	}
	
}

public class Customer_Management {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashSet<Customer> hashSet = new HashSet<Customer>();  // �� ���̵� �ߺ����� �ʰ�
		
		while (true) {
			System.out.println("=============================================================================================\r\n"
					+ "1. �Ϲݰ� ���	|   2. VIP �����      |  3. Gold �� ���   4. ���� ���    5. ��ǰ����  6. ���� \r\n"
					+ "=============================================================================================\r\n"
					+ "���� >>");
			
			int selectNum = scanner.nextInt();
			if (selectNum ==1) {
				Customer customer = new Customer();
				System.out.println("==�Ϲݰ� ��� �Դϴ�. ==");
				
				System.out.println("�� ID�� �Է��ϼ��� >>> ");
				int c_id = scanner.nextInt();
				
				System.out.println("�� �̸��� �Է��ϼ��� >>>");
				String c_Name = scanner.next();
				
				hashSet.add(new Customer(c_id, c_Name, customer.getCustomerGrade(), customer.getBonusRatio()));
				
				System.out.println("�� ��ϵǾ����ϴ�. ");
				
			}else if (selectNum == 2) {
				VipCustomer customer = new VipCustomer();
				System.out.println("==Vip�� ��� �Դϴ�. ==");
				
				System.out.println("�� ID�� �Է��ϼ��� >>> ");
				int c_id = scanner.nextInt();
				
				System.out.println("�� �̸��� �Է��ϼ��� >>>");
				String c_Name = scanner.next();
				
				System.out.println("��� Agent�� ID�� �Է��ϼ��� >>>");
				int a_id = scanner.nextInt();
				
				
				hashSet.add(new VipCustomer(c_id, c_Name, customer.getCustomerGrade(), customer.getBonusRatio(), customer.getSaleRatio(), a_id));
				
			}else if (selectNum == 3) {
				GoldCustomer customer = new GoldCustomer();
				System.out.println("==Gold�� ��� �Դϴ�. ==");
				
				System.out.println("�� ID�� �Է��ϼ��� >>> ");
				int c_id = scanner.nextInt();
				
				System.out.println("�� �̸��� �Է��ϼ��� >>>");
				String c_Name = scanner.next();
				
				hashSet.add(new GoldCustomer(c_id, c_Name, customer.getCustomerGrade(), customer.getBonusRatio(), customer.getSaleRatio()));
				
			}else if (selectNum == 4) {
				System.out.println("==�� ���� ���  �Դϴ�. ==");
				
				for (Customer customer : hashSet) {
					System.out.println(customer);
				}
				
			}else if (selectNum == 5) {
				Customer customer = new Customer();
				GoldCustomer Gcustomer = new GoldCustomer();
				VipCustomer vCustomer = new VipCustomer();
				System.out.println("==��ǰ������ ������ �ּ���==");
				System.out.println("�� ID�� �Է��ϼ��� >>> ");
				int c_id = scanner.nextInt();
				System.out.println("������ ��ǰ�� ������ �Է��ϼ��� >>> ");
				int price = scanner.nextInt();
	
				Iterator<Customer> iterator = hashSet.iterator();
				while (iterator.hasNext()) {
					Customer customer2 = iterator.next();
					if(c_id == customer2.getCustomerId()) {
						c_id = customer2.getCustomerId();
						if (customer2.getCustomerGrade().equals("Gold")) {
							int Gprice = (int) Gcustomer.calcPrice(price) ;
							System.out.println( customer2.getCustomerName() + "����" + Gprice + " �� �����ϼ̽��ϴ�. ");
							System.out.println(customer2.getCustomerName() + "������ ����� " + customer2.getCustomerGrade() + "�̰� ���� ����Ʈ�� " + Gcustomer.getBonusP()  + "������ " + (price - Gprice)  + "�� �Ǿ����ϴ�. ");
							
						}if(customer2.getCustomerGrade().equals("VIP")) {
							int Vprice = (int) vCustomer.calcPrice(price) ;
							System.out.println( customer2.getCustomerName() + "����" + Vprice + " �� �����ϼ̽��ϴ�. ");
							System.out.println(customer2.getCustomerName() + "������ ����� " + customer2.getCustomerGrade() + "�̰� ���� ����Ʈ�� " + vCustomer.getBonusP()  + "������ " + (price - Vprice)  + "�� �Ǿ����ϴ�. ");
						}if(customer2.getCustomerGrade().equals("Silver")) {
							int Sprice = (int) customer.calcPrice(price) ;
							System.out.println( customer2.getCustomerName() + "����" + Sprice + " �� �����ϼ̽��ϴ�. ");
							System.out.println(customer2.getCustomerName() + "������ ����� " + customer2.getCustomerGrade() + "�̰� ���� ����Ʈ�� " + customer.getBonusP()  + "������ " + (price - Sprice)  + "�� �Ǿ����ϴ�. ");
						}
					}
				}
			}else if (selectNum == 6) {
				break;
			}
		}
		scanner.close();
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

}
