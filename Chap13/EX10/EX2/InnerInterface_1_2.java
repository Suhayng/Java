package Chap13.EX10.EX2;

class Abc {   
	//1. 객체 생성후 필드에 직적 값을 할당. (d1)
	//2. 생성자를 통해서 값 할당, (d2)
	//3. setter를 통해서 값할당 (d3)
	
	Def d;		//필드 블락 
				//생성자 블락 
	
	Abc() {} 		//기본생성자 
	Abc(Def d){		//생성자를 통해서 필드의 기본값 할당. 
		this.d = d; 
	}
	void setD (Def d) {  //setter를 통해서 필드의 기본값 할당 
		this.d = d; 
	}
	
	
	interface Def { //Abc.Def 
		void run ();
		void fly (); 
	}	
	void ghi() {
		d.run();
		d.fly(); 
	}
}

public class InnerInterface_1_2 {
	public static void main(String[] args) {
		
		//1. 객체 생성후 필드에 직적 값을 할당. (d1)
		Abc d1 = new Abc();
		d1.d = (Abc.Def) new Abc.Def() {	
			public void run() { System.out.println("고양이가 달립니다. ");	}
			public void fly() { System.out.println("고양이는 날지 못합니다. ");}
		};
		d1.ghi();
		System.out.println("=============");
		//2. 생성자를 통해서 값 할당, (d2)
		Abc d2 = new Abc(
				new Abc.Def() {		//이너 인터페이스 	
					public void run() {System.out.println("개는 펄쩍 펄쩍 달립니다.");}				
					public void fly() {System.out.println("개는 날지 못합니다. ");}
				}); 
		d2.ghi();
		System.out.println("=====================");
		//3. setter를 통해서 값할당 (d3)
		Abc d3 = new Abc(); 
		d3.setD( new Abc.Def() {
			public void run() {System.out.println("독수리는 달리지 못합니다.");}
			public void fly() {System.out.println("독수리는 날라다닙니다.");}
		});	
		d3.ghi();
	}
}
