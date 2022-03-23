package Chap11.EX06;

abstract class Animal {
	String name;
	int age;
	
	abstract void cry();
	abstract void run();
}

class Cat extends Animal {
	Cat(String name, int age){
		
	}
	
	@Override
	void cry() {}
	
	@Override
	void run() {}

}

class Tiger extends Animal {
	Tiger(String name, int age){
		super.name = name;
		super.age = age;
	}
	
	@Override
	void cry() {
		System.out.println();
	}
	
	@Override
	void run() {
		System.out.println();
	}
}
class Eagle extends Animal {
	Eagle(String name, int age){
		super.name = name;
		super.age = age;
	}
	
	@Override
	void cry() {}
	
	@Override
	void run() {}
}

public class AbstractModifier_3 {
	public static void main(String[] args) {
		Animal a1 = new Cat ("고양이" , 10);
		Animal a2 = new Tiger ("호랑이", 5);
		Animal a3 = new Eagle ("독수리", 15);
		
		// 1. Animal 배열 객체
		
		Animal[] arr = {a1, a2, a3};
	
		// 2. For 문을 사용해서 객체를 출력시 이름과 나이를 출력 .cry() , .run()
		
		for (int i = 0; i < arr.length ; i++) {
			arr[i].cry();
			arr[i].run();
		}
		
		// 3. Enhanced For 문을 사용해서 이름과 나이를 출력 .cry() , .run()
		
		for ( Animal k : arr) {
			k.cry();
			k.run();
		}
		
	}
}
