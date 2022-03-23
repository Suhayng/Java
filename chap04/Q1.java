package chap04;
public class Q1 {
	public static void main(String[] args) {
		 //Q1
			for (int i = 1 ; i <= 19 ; i++) {
				for (int j = 1; j<=9 ; j++) {
					if(i % 2 == 0) {
						continue;
					}
				int result = (i*j);
				System.out.println(i  + " * " + j + " = " + result  );
				}
			}
				System.out.println();
				System.out.println("====================");
	
		//Q2
		   for (int i = 1 ; i <= 19 ; i++) {
			   for (int j = 1 ; j <=9 ; j++) {
				   if(i % 3 != 0) {
					   continue;
				   }
			   int result = (i*j);
			   System.out.println(i  + " * " + j + " = " + result  );
			   }
		   }
		
	
	}
}
