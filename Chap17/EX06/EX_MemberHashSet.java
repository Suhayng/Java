package Chap17.EX06;

// HashSet ���� ��ȯ
// Member Ŭ������ memberid �÷���

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Member {					// DTO, VO : �� �������� �����͸� �޾Ƽ� �������ִ� Ŭ����
	private int memberid;
	private String memberName;
	
	public Member (int memberid, String memberName) {		// �����ڸ� ���ؼ� �ʵ��� �� �Ҵ�
		this.memberid = memberid;
		this.memberName = memberName;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			this.memberid = ((Member)obj).memberid;
			return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(memberid);
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

class MemberHashSet {			// MemberArrayList �� ��üȭ �ϸ� ArrayList ��ü�� ���� �ȴ�.
	private Set<Member> hashSet;
		
	public MemberHashSet () {		// �⺻ ������ 
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {		// Member ��ü�� �޾Ƽ� �� ������ �濡 ���� �߰��ϴ� �޼ҵ�
		hashSet.add(member);		
	}
	
	
	public	void removeMember (int memberid) {
		// iterator ����ؼ� remove
		
		Iterator <Member> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			if(hashSet.equals(iterator.next())) {
				iterator.remove();
			}
		}
		System.out.println(memberid + " �� ���� ���� �ʽ��ϴ�. ");
	}
	
	public void showAllMember() {
		// iterator
		Iterator <Member> iterator2 = hashSet.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next() + " ");
		}
		
	}
	public void showSize() {
		System.out.println(hashSet.size());
	}
}

public class EX_MemberHashSet {
	public static void main(String[] args) {

		MemberHashSet memberhashSet = new MemberHashSet();	// ��ü�� �����ϴ� ���� arrayList �ʵ尡 Ȱ��ȭ 
			// �޼ҵ� ȣ���ϱ� ���ؼ� ��ü ����
			// addMember(), addMember2(), removeMember(), showAllMemeber()
		
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		Member memberPark = new Member(1003, "�ڼ���");
		Member memberHong = new Member(1004, "ȫ�浿");
		Member memberLee2 = new Member(1001, "������");
		
		memberhashSet.addMember(memberLee);		// �� ��ü�� �����ؼ� ArrayList �� ����
		memberhashSet.addMember(memberSon);
		memberhashSet.addMember(memberPark);
		memberhashSet.addMember(memberHong);
		memberhashSet.addMember(memberLee2);
		
		memberhashSet.showSize();		// 4�� ��� �Ǿ���
		
		// ��� ����� ���� ���
	
		memberhashSet.showAllMember();
		
			
		
		
		
	}
}
