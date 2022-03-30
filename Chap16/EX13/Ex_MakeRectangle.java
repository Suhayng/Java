package Chap16.EX13;

// �� ���� ��ǥ ���� ����ؼ� ���̸� ���ϴ� ���α׷��� �ۼ��ϼ��� ���ʸ� Ŭ���� / ���ʸ� �޼ҵ� ���

class Point <T,V > {	// ������ ��ǥ�� ��� Ŭ����
	T x;	// ������ x ��ǥ
	V y;	// ������ y ��ǥ
	public double p2;
	
	Point (T x, V y){	// ������, Setter ��� �����ڸ� ���ؼ� ��ǥ�� �Ҵ�
		this.x = x;
		this.y = y;
	}
	
	public Point (int i, int j) {
		// TODO Auto-generated constructor stub
	}

	public T getX ( ) {
		return x;
	}
	public V getY() {
		return y;
	}
}

class GenericMethod{
	
	public static<T, V> double makeRectangle (Point <T,V> p1, Point<T,V> p2) {
		
		double width = (double)p2.getX() - (double)p1.getX();
		double height = (double)p2.getY() - (double)p1.getY();
		
		return width * height;
	}
	
	
	
}

public class Ex_MakeRectangle {
	public static void main(String[] args) {
		
		Point<Double,Double> p1 = new Point <Double,Double>(1.0,2.0);
		Point<Double ,Double> p2 = new Point <Double,Double>(10.0,8.0);
		
		double rect = GenericMethod.<Double,Double> makeRectangle(p1,p2);
		System.out.println("�� ������ ������� �簢���� ���̴� : " + rect );
	
	}
}




