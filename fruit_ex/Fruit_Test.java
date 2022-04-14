package fruit_ex;

import java.util.ArrayList;
import java.util.Scanner;

/*
 	상속을 다루는 문제 하위의 생성자에 super() 메소드 사용.
 	
 */

class Fruit {
	String fruitName;	//과일 이름
	String color;		//과일 색깔
	int large;			//과일 크기
	
	public Fruit() {};
	
	public Fruit(String fruitName, String color, int large) {
		this.fruitName = fruitName;
		this.color = color;
		this.large = large;
	}
	
	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getLarge() {
		return large;
	}

	public void setLarge(int large) {
		this.large = large;
	}

	public String toString() {	//과일의 정보를 출력하는 메소드
		return "과일의 이름은 " + fruitName + "이고, 색깔은 " + color + "이고, 크기는 " + large + " 입니다." ;
	}
}

class Apple extends Fruit {

	Apple(String fruitName, String color, int large) {
		super(fruitName, color, large);
	}
	
	
}

class Orange extends Fruit {

	Orange(String fruitName, String color, int large) {
		super(fruitName, color, large);
	}
	
}

class Banana extends Fruit{

	Banana(String fruitName, String color, int large) {
		super(fruitName, color, large);
	}
	
}

/*  1. 코드 작성 : 스캐너 인풋 받는 코드
 *  선택 >>
 	=================================================
 	 1. 사과  |  2. 오렌지 | 3. 바나나 | 4. 정보 출력 |5. 종료
 	==================================================
 	
 	 선택 >> 1
 	 과일명 :
 	 색깔 :
 	 크기 :
 	 
 	 2. 코드 작성 : 스캐너로 인풋 받은 값으로 각각의 객체를 생성해서 ArrayList에 저장
 	 
 	 3. 선택 >> 4 객체를 가져와서 객체를 출력했을 떄 ArrayList의 모든 객체를 가져와서 
 	 			 객체 정보 출력, Enhanced For 문 사용
 			출력 결과 : 과일의 이름은 <사과>이고, 색깔은 <빨간색>이고, 크기는 <10> 입니다.
 				     과일의 이름은 <오렌지>이고, 색깔은 <오렌지색>이고, 크기는 <20>입니다.
 */


public class Fruit_Test {
	public static void main(String[] args) {
		
		ArrayList<Fruit> fruitList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
	
		
		while(true) {
		System.out.println("=================================================");
		System.out.println(" 1. 사과 | 2. 오렌지 | 3. 바나나 | 4. 정보 출력 | 5. 종료");
		System.out.println("=================================================");
		System.out.println("선택 >>");
		int Num = sc.nextInt();
		
		if(Num == 1) {
			System.out.println("- 과일명 : ");
			String fruitName = sc.next();
			System.out.println("- 색깔 : ");
			String color = sc.next();
			System.out.println("- 크기 : ");
			int large = sc.nextInt();
			
			fruitList.add(new Apple(fruitName, color, large));
			System.out.println(fruitName + "의 정보가 정상적으로 입력되었습니다.");
		} else if(Num == 2){
			System.out.println("- 과일명 : ");
			String fruitName = sc.next();
			System.out.println("- 색깔 : ");
			String color = sc.next();
			System.out.println("- 크기 : ");
			int large = sc.nextInt();
			
			fruitList.add(new Orange(fruitName, color, large));
			System.out.println(fruitName + "의 정보가 정상적으로 입력되었습니다.");
		} else if(Num == 3) {
			System.out.println("- 과일명 : ");
			String fruitName = sc.next();
			System.out.println("- 색깔 : ");
			String color = sc.next();
			System.out.println("- 크기 : ");
			int large = sc.nextInt();
			
			fruitList.add(new Banana(fruitName, color, large));
			System.out.println(fruitName + "의 정보가 정상적으로 입력되었습니다.");
		} else if (Num == 4) {
			for(Fruit k : fruitList) {
				System.out.println(k);
			}
		} else if (Num == 5) {
			break;
		}
		
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

	
	}
