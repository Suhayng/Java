package Chap17.EX05;

import java.util.ArrayList;

class Member {					// DTO, VO : 각 계층간에 데이터를 받아서 전달해주는 클래스
	private int memberid;
	private String memberName;
	
	public Member (int memberid, String memberName) {		// 생성자를 통해서 필드의 값 할당
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
			return memberName + "회원님의 아이디는 " + memberid + " 입니다." ;
		}
}

class MemberArrayList {			// MemberArrayList 를 객체화 하면 ArrayList 객체가 생성 된다.
	private ArrayList<Member> arrayList;
	
	public MemberArrayList () {		// 기본 생성자 
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {		// Member 객체를 받아서 맨 마지막 방에 값을 추가하는 메소드
		
		arrayList.add(member);
		System.out.println(arrayList);
	}
	
	public void addMember2(int a, Member member) {					// 매개 변수 2개를 받아서 -특정 index 방 번호에 값을 추가(삽입)! 
		
	}
	
	public boolean removeMember (int memberid) {
		// Array List 에 저장된 Memberid 를 검색해서 해당 객체를 삭제하는 메소드
		
		return false;
	}
	
	public void showAllMember() {
		// ArrayList에 저장된 모든 사용자 정보를 출력하는 메소드
		
	}
}

public class EX_MemberArrayList {
	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서원");
		Member memberHong = new Member(1004, "홍길동");
		
		memberArrayList.addMember(memberLee);		// 각 객체를 생성해서 ArrayList 에 저장
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		// 특정 index 방에 추가적 사용자  
		//memberArrayList.addMember(3, );
		
		// 모든 사용자 정보 출력
		memberArrayList.showAllMember();
		
		// 특정 id 를 가진 사용자 제거
		memberArrayList.removeMember(1003);			
		
		
		
	}
}
