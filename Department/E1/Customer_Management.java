package Department.E1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
 * ��ȭ���� ���� ���� ���α׷�(��Ӱ� ������)
 * 
 * ���� ��� :	1. 	�Ϲݰ���(Silver) : ���ʽ� ����Ʈ(1%����) ������ ����
 *  		2.	Gold���� : ���ʽ� ����Ʈ(2%����) ����(5%)
 *  		3.	VIP���� : ���ʽ� ����Ʈ(5%����) ����(10%), ��� ���� ����
 */



class Customer {
	int customerID; // ���� ID
	String customerName;
	String customerGrade; // ���� ���("Silver", "Gold", "VIP")
	double bonusPoint; // ���ʽ� ����Ʈ ��
	double bonusRatio; // ���ʽ� ����Ʈ ������ : �ǹ� 1%, ���2%, VIP5%

	public double calcPrice(int price) {
		// ��ǰ�� ������ �޾Ƽ� bonus����Ʈ �����ϴ� �ڵ�
		bonusRatio = 0.01;
		bonusPoint = bonusPoint + (price * bonusRatio);
		return price;
	}

	// �����ڿ��� �⺻���� 2���� �ʵ��� ���� �ε� : customerGrade, bonusRatio : 1%
	public String toString() {
		customerGrade = "Silver";
		bonusRatio = 0.01;
		return "����ID : " + customerID + ", ������ : " + customerName + ", ������� : " + customerGrade + ", ����Ʈ �� : "
				+ bonusPoint + ", ������ : " + bonusRatio;
	}

}

class GoldCustomer extends Customer {
	double saleRatio; // ��ǰ ������ : �����ڿ��� �⺻���� : 5%

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
		return "����ID : " + customerID + ", ������ : " + customerName + ", ������� : " + customerGrade + ", ����Ʈ �� : "
				+ bonusPoint + ", ������ : " + bonusRatio + ", ������ : " + this.saleRatio;
	}

	// �����ڿ��� �⺻���� 2���� �ʵ��� ���� �ε� : customerGrade, bonusRatio : % saleRatio : 5%

}

class VipCustomer extends GoldCustomer {

	private int agentID; // �ٷ� ������ �� ����. ������ or setter�� ����

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
		return "����ID : " + customerID + ", ������ : " + customerName + ", ������� : " + customerGrade + ", ����Ʈ �� : "
				+ bonusPoint + ", ������ : " + bonusRatio + ", ������" + this.saleRatio + ", ������ƮID : " + agentID;
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
							+ "1. �Ϲݰ��� ��� |   2. VIP �������   |  3. Gold ���� ��� |  4. ���� ���  |  5. ��ǰ����  | 6. ���� \r\n"
							+ "=============================================================================================");
			int num = sc.nextInt();
			if (num == 1) {
				System.out.println("�Ϲ� ���� ���");
				System.out.print("���� ���̵� : ");
				customer.customerID = sc.nextInt();
				System.out.print("���� �̸� :");
				customer.customerName = sc.next();
				customerSet.add(customer);
				System.out.println("��� �Ϸ�");
			} else if (num == 2) {
				System.out.println("VIP ���");
				System.out.print("VIP���� ���̵� : ");
				vipCustomer.customerID = sc.nextInt();
				System.out.print("���� �̸� :");
				vipCustomer.customerName = sc.next();
				System.out.println("��� ������ƮID ��� : ");
				vipCustomer.setAgentID(sc.nextInt());
				customerSet.add(vipCustomer);
				System.out.println("��� �Ϸ�");
			} else if (num == 3) {
				System.out.println("��� ���� ���");
				System.out.print("���� ���̵� : ");
				goldCustomer.customerID = sc.nextInt();
				System.out.print("���� �̸� :");
				goldCustomer.customerName = sc.next();
				customerSet.add(goldCustomer);
				System.out.println("��� �Ϸ�");
			} else if (num == 4) {
				System.out.print("ã���� ����ID��ȣ�� �Է� �ϼ��� : ");
				int searchId = sc.nextInt();
				for (Customer k : customerSet) {
					if (k.customerID == searchId) {
						System.out.println(k.toString());
					}
				}
			} else if (num == 5) {
				System.out.println("�����Ͻ� ���� ID�� �Է��Ͽ� �ּ���");
				int searchId = sc.nextInt();
				for (Customer k : customerSet) {
					if (k.customerID == searchId) {
						System.out.println("��Ǯ������ ������ �ֻ���");
						System.out.println("���� ��ǰ ���� : ");
						int price = sc.nextInt();
						System.out.println(k.calcPrice(price) + "���� �Ǿ����ϴ�");
						System.out.println(k.customerName + "�������� �����" + k.customerGrade + "�̰�, ���� ����Ʈ�� " + k.bonusPoint
								+ "�̰�, ������ " + k.bonusRatio + "% �Ǽ̽��ϴ�.");
					}
				}
			} else if (num == 6) {
				System.out.println("�ý����� �����մϴ�.");
				break;
			}
		}
	}

}