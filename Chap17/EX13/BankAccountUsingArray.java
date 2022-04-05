package Chap17.EX13;

import java.util.Scanner;

class Account {
	private String ano;		// ���� ��ȣ
	private String owner;	// ������, �̸�
	private int balance;	// ���� �ݾ�(�ʱ� �ݾ�)
	
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	//getter, setter
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	
}

public class BankAccountUsingArray { 
	// �迭�� ����ؼ� Account ��ü ���
	private static Account[] accountArray = new Account[100];	// �迭�� ��ü ����
	private static Scanner scanner = new Scanner(System.in);
	
	private static void createAccount() {
		//�ڵ� �ۼ� : 1. ���� ����, ��ĳ�ʷ� 1)���¹�ȣ 2)�̸� 3)�ʱ�����ݾ� ��ǲ ����
		// �迭 ��ü�� ����
		System.out.println("���¹�ȣ�� �Է��ϼ��� : ");
		String ano = scanner.next();
		System.out.println("�̸��� �Է��ϼ��� : ");
		String owner = scanner.next();
		System.out.println("�ʱ� �ݾ��� �Է��ϼ��� : ");
		int balance = scanner.nextInt();
		
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null ) {
				accountArray[i] = new Account(ano, owner, balance);
				System.out.println("���°� �����Ǿ����ϴ�.");
				break;
			}
			
		}
	}
	private static void accountList() {
		//�ڵ� �ۼ� : 2. ���� ��� ���, �迭�� ����� ��ü�� �����ͼ� ���¹�ȣ, �̸�, ���� �ݾ��� ���
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				break;
			}
			System.out.println(accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
		}
	}
	private static void deposit() {
		//�ڵ� �ۼ� : 3. ����, ���¹�ȣ�� �޾Ƽ� ��ü���� �ش� ���¸� ã�Ƽ� , �Ա� �ݾ��� ��ǲ : �ش� ���¿� ����
		System.out.println("���¹�ȣ�� �Է��ϼ��� : ");
		String ano = scanner.next();
		System.out.println("�Ա��� �ݾ��� �Է��ϼ��� : ");
		int deposit = scanner.nextInt();
	
		if(findAccount(ano) == null) {
			System.out.println("�Է��� ���¸� ã�� ���߽��ϴ�.");
		} else {
			findAccount(ano).setBalance(findAccount(ano).getBalance()+ deposit);
			System.out.println("�Ա��� �����Ͽ����ϴ�.");
		}
	}
	private static void withdraw() {
		//�ڵ� �ۼ� : 4. ���, ���¹�ȣ�� ��ǲ �޾Ƽ� �ش� ���¸� ��ü���� ã�Ƽ� ���.
		System.out.println("���¹�ȣ�� �Է��ϼ��� : ");
		String ano = scanner.next();
		System.out.println("����� �ݾ��� �Է��ϼ��� :");
		int withdraw = scanner.nextInt();
		
		if(findAccount(ano) == null) {
			System.out.println("�Է��� ���¸� ã�� ���߽��ϴ�.");
		} else {
			if(withdraw > findAccount(ano).getBalance()) {
				System.out.println("�ܾ׺��� ū �׼��� �Է��Ͽ����ϴ�.");
			} else {
				findAccount(ano).setBalance(findAccount(ano).getBalance() - withdraw);
				System.out.println("����� �����Ͽ����ϴ�.");
			}
		}
	}
	
	// �迭���� Account ��ü ���� ano[���¹�ȣ] �� ������ ���¸� ã�Ƽ� ã�� ��ü�� �������� ������
	private static Account findAccount(String ano) {
		// �˻��ؼ� account �� ������
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				break;
			}if (accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		return null;
	}
		

	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. ���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ����");
			System.out.println("-------------------------------------------------");
			System.out.println("���� >> ");
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				createAccount();	//�޼ҵ� ȣ��
			}else if (selectNo == 2) {
				accountList();
			}else if (selectNo == 3) {
				deposit();
			}else if (selectNo == 4) {
				withdraw();
			}else if(selectNo == 5) {
				run = false;
				//break;
			}
		}
		scanner.close();
		System.out.println("���α׷� ����");
		
	}
}
