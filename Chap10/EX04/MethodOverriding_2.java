package Chap10.EX04;

class Animal2 {
	void run() {}
}

class Tiger extends Animal2 {	
	@Override
	void run () {
		System.out.println("호랑이는 네발로 달립니다.");
	}
	void tigerEat () {
		System.out.println("호랑이는 동물을 먹습니다.");
	}
}

class Egle extends Animal2 { 
	@Override
	void run () {
		System.out.println("독수리는 하늘을 납니다.");
	}
	void egleEat () {
		System.out.println("독수리는 다른 새를 잡아 먹습니다.");
	}
}

class Snake extends Animal2 {
	@Override
	void run () {
		System.out.println("뱀은 기어다닙니다.");
	}
}


public class MethodOverriding_2 {

	public static void main(String[] args) {

		// 1. 모든 객체는 Animal2 타입으로 업캐스팅해서 생성
		Animal2 a = new Tiger();
		Animal2 b = new Egle();
		Animal2 c = new Snake();

		// 2. Animal2 배열에 각 객체를 저장
		Animal2[] arr = {a, b, c};
		
		// 3. for문으로 배열의 객채를 출력. run()를 실행
		for (int i = 0; i < arr.length ; i++) {
			arr[i].run();
		}
	
		// 4. Enhanced For 문을 사용해서 객체의 run() 메소드 출력
		for ( Animal2 k : arr ) {
			k.run();
		}

		
		// 5. 다운 캐스팅 (instanceof 사용해서) ==> tigerEat(), egleEat() 메소드 출력
			
		if ( a instanceof Tiger ) {
			Tiger a_down = (Tiger) a;
			a_down.tigerEat();
		}
		
		if ( b instanceof Egle ) {
			Egle b_down = (Egle) b;
			b_down.egleEat();
		}
		if (c instanceof Snake) {
			Snake c_down = (Snake) c;
		}

	}
}
