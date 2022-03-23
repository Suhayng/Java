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
		Animal a1 = new Cat ("�����" , 10);
		Animal a2 = new Tiger ("ȣ����", 5);
		Animal a3 = new Eagle ("������", 15);
		
		// 1. Animal �迭 ��ü
		
		Animal[] arr = {a1, a2, a3};
	
		// 2. For ���� ����ؼ� ��ü�� ��½� �̸��� ���̸� ��� .cry() , .run()
		
		for (int i = 0; i < arr.length ; i++) {
			arr[i].cry();
			arr[i].run();
		}
		
		// 3. Enhanced For ���� ����ؼ� �̸��� ���̸� ��� .cry() , .run()
		
		for ( Animal k : arr) {
			k.cry();
			k.run();
		}
		
	}
}
