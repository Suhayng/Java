package Ex;
public class Ex10 {
	public static void main(String[] args) {
		
		for ( int i = 1 ; i <= 99 ; i++) {
			int a = i % 10;
			 int b = i / 10;
			if ((a==3||a==6||a==9) && (b==3||b==6||b==9)) {
				System.out.println(i + " ¹Ú¼ö Â¦Â¦");
			}
			else if ((a!=3||a!=6||a!=9) && (b==3||b==6||b==9)) {
				System.out.println(i + " ¹Ú¼ö Â¦");
			}
			else if ((a==3||a==6||a==9) && (b!=3||b!=6||b!=9)) {
			}
		}
	}
}
