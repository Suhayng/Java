package Chap17.EX06;

// HashSet ���� ��ȯ
// Member Ŭ������ memberid �÷��� equals(), hashCode() �������ؼ� ������ ��ü�� �ν�

/* 
   * �߿� * : Set�� �ߺ��� ���� ������ �� ����.
		- Wrapper Ŭ������ Integer, Long, Double, Float, Charactor, Byte, Short, Boolean
		    			 equals(), hashCode() �޼ҵ尡 ������ �Ǿ� �ִ�.
		- Ư�� ��ü�� ���� �� �� ��ü��  Set�� ������ ��� �� ��ü�� Object Ŭ������ equals(), hashCode() ������ ����� �Ѵ�.
		- ��ü�� Ư�� �ʵ��� ���� ���� �� �ߺ��� �ĺ��ϴ� �ʵ带 ����    			  
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Member {					// DTO, VO : �� �������� �����͸� �޾Ƽ� �������ִ� Ŭ����
	private int memberid;		// Set �� ���� �ĺ���,  memberid �ʵ��� ���� ���� �� ���� ��ü�̴ٶ�� ����
								// equals(), hashCode() 
	private String memberName;
	public Member (int memberid, String memberName) {		// �����ڸ� ���ؼ� �ʵ��� �� �Ҵ�
		this.memberid = memberid;
		this.memberName = memberName;
	}
	/*
	@Override			//member1.equals(member2) 	
	public boolean equals(Object obj) {		// ��ü�� ������ Object�� ��ĳ����	
		if(obj instanceof Member) {			// �ٿ� ĳ������ �� ��Ÿ�� ������ �����Ϸ���, Object�� Member ��ü�� ���� �Ǿ� ���� �� 
			this.memberid = ((Member)obj).memberid;	// obj�� Object�� ��ĳ���� �Ǿ �ٿ� ĳ����
			return true;
		}
		return false;
	}
	*/
	
	
	// equals() ������
	   @Override			//member1.equals(member2) 	
	public boolean equals(Object obj) {		// ��ü�� ������ Object�� ��ĳ����	
		if(obj instanceof Member) {	
			Member member = (Member) obj;
			if (this.memberid == member.memberid) {
				return true;
			} else {
				return false;
		}
	}
	return false;	// obj�� member Ÿ���� �������� ���� ��
	}
	
	/*   
	@Override
	public int hashCode() {
		return Objects.hash(memberid);
	}
	*/

	@Override
		public int hashCode() { 		// memberid �ʵ��� ���� ������ �� ������ hashCode �� ����
			//return memberid;			// this.memberid
			//return this.memberid;		// �ϳ��� �ʵ常�� �������� hashCode() ����,
			return Objects.hashCode(memberid);	// �������
					//Objects.hashCode(memberid, memberName); �������� �ʵ带 �������� hashCode�� ������ �� �ִ�.
		}   			// memberid, memberName �ʵ��� ���� ��� ���� �� ��� ������ hashCode()�� �����. 
	   
	   
	
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
	private Set<Member> hashSet;	// Set ���� : <Member> , �ʵ��� private ( ������, setter )
	
		// Set<Member> hashSet = new HashSet<Member>();
	
	public MemberHashSet () {		// �⺻ ������ ȣ��� Set�� ���� ���� Ȱ��ȭ.
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {		// Member ��ü�� �޾Ƽ� �� ������ �濡 ���� �߰��ϴ� �޼ҵ�
		hashSet.add(member);		// Member ��ü�� ��ǲ �޾� hashSet�� member ��ü�� ����, �ߺ� ����Ǹ� �ȵ�		
									// Member ��ü�� memberid �ʵ��� ���� ������ ���, ������ ��ü�̴� ��� ����
									// equals(), hashCode() �޼ҵ� ������ : memberid 
	}
	
	
	public	boolean removeMember (int memberid) {	// memberid �� Member ��ü ���� �ʵ��̹Ƿ� Set�� ����� ��ü�� �����;� �Ѵ�.
		// Set�� index �� �������� �����Ƿ� �⺻ for ���� ����� �� ����.
		// ���� for ���� ����� �� �ְ�, iterator �� ����� �� �ִ�.
		// iterator ����ؼ� remove
		
		/*Iterator <Member> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			if(hashSet.equals(iterator.next())) {
				iterator.remove();
			}
		}
		System.out.println(memberid + " �� ���� ���� �ʽ��ϴ�. ");*/
	
		Iterator<Member> ir = hashSet.iterator();		// iterator : ��ȸ��,
		while (ir.hasNext()) {							// hasNext() : hashSet�� ���� ������ �� true, false
			Member member = ir.next();					// Next(); ���� �����ְ� ���� ������ �̵�.
			int tempid = member.getMemberid();
			
			if (tempid == memberid) {
				hashSet.remove(member);
				return true;
			}
		}
			System.out.println("���̵� �������� �ʽ��ϴ�.");
			return false;
	
	}
	
	
	public void showAllMember() {
		// iterator
		Iterator<Member> ir = hashSet.iterator();	// ���� ����	
		while (ir.hasNext()) {
			Member member = ir.next();				// hashSet�� ���� ������ ��
			System.out.println(member);			// hashSet �� ��ü�� ���, toString() ������ : �ʵ��� ���� ���
		}
		
	}
	public void showSize() {
		System.out.println(hashSet.size());
	}
}

public class EX_MemberHashSet {
	public static void main(String[] args) {

		MemberHashSet memberhashSet = new MemberHashSet();	
			// ��ü�� �����ϴ� ���� arrayList �ʵ尡 Ȱ��ȭ 
			// �޼ҵ� ȣ���ϱ� ���ؼ� ��ü ����
			// addMember(), addMember2(), removeMember(), showAllMemeber()
		
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		Member memberPark = new Member(1003, "�ڼ���");
		Member memberHong = new Member(1004, "ȫ�浿");
		Member memberLee2 = new Member(1001, "������");
		Member memberLee3 = new Member(1001, "������");
		
		
		memberhashSet.addMember(memberLee);		// �� ��ü�� �����ؼ� ArrayList �� ����
		memberhashSet.addMember(memberSon);
		memberhashSet.addMember(memberPark);
		memberhashSet.addMember(memberHong);
		memberhashSet.addMember(memberLee2);
		memberhashSet.addMember(memberLee3);

		memberhashSet.showSize();		// 4�� ��� �Ǿ���
		
		// ��� ����� ���� ���
		memberhashSet.showAllMember();
		System.out.println("==================");
		
 		// Ư�� id ���� ����� ����
		memberhashSet.removeMember(1003);
		
		memberhashSet.showSize();		// 3�� ��� �Ǿ���
		
		
		
		
	}
}
