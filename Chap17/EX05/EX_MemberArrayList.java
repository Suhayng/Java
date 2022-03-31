package Chap17.EX05;

import java.util.ArrayList;

class Member {					// DTO, VO : �� �������� �����͸� �޾Ƽ� �������ִ� Ŭ����
	private int memberid;
	private String memberName;
	
	public Member (int memberid, String memberName) {		// �����ڸ� ���ؼ� �ʵ��� �� �Ҵ�
		this.memberid = memberid;
		this.memberName = memberName;
	}

	public int getMemberid() {
		return memberid;
	}

	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	@Override
		public String toString() {
			return memberName + "ȸ������ ���̵�� " + memberid + " �Դϴ�." ;
		}
}

class MemberArrayList {			// MemberArrayList �� ��üȭ �ϸ� ArrayList ��ü�� ���� �ȴ�.
	private ArrayList<Member> arrayList;
	
	public MemberArrayList () {		// �⺻ ������ 
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {		// Member ��ü�� �޾Ƽ� �� ������ �濡 ���� �߰��ϴ� �޼ҵ�
		
		arrayList.add(member);
		System.out.println(arrayList);
	}
	
	public void addMember2(int a, Member member) {					// �Ű� ���� 2���� �޾Ƽ� -Ư�� index �� ��ȣ�� ���� �߰�(����)! 
		
	}
	
	public boolean removeMember (int memberid) {
		// Array List �� ����� Memberid �� �˻��ؼ� �ش� ��ü�� �����ϴ� �޼ҵ�
		
		return false;
	}
	
	public void showAllMember() {
		// ArrayList�� ����� ��� ����� ������ ����ϴ� �޼ҵ�
		
	}
}

public class EX_MemberArrayList {
	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		Member memberPark = new Member(1003, "�ڼ���");
		Member memberHong = new Member(1004, "ȫ�浿");
		
		memberArrayList.addMember(memberLee);		// �� ��ü�� �����ؼ� ArrayList �� ����
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		// Ư�� index �濡 �߰��� �����  
		//memberArrayList.addMember(3, );
		
		// ��� ����� ���� ���
		memberArrayList.showAllMember();
		
		// Ư�� id �� ���� ����� ����
		memberArrayList.removeMember(1003);			
		
		
		
	}
}
