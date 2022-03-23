package Ex;
public class Ex09 {
	public static void main(String[] args) {
		
		int random[] = new int[10];
		int sum = 0;
		
		System.out.print("·£´ýÇÑ Á¤¼öµé : ");
		for(int i = 0 ; i < random.length; i++) {
			random [i] = (int)(Math.random()*10+1);
			System.out.print(random[i] + " ");
			sum += random[i];
		}
		System.out.println();
		System.out.println("Æò±ÕÀº " + sum/10.0);
		
		
	}
}
