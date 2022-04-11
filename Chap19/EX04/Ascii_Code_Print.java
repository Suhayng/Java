package Chap19.EX04;

/*
 	ASCII 코드 값 출력 : 1btye = 8bit, 제일 처음 비트는 부호 비트, 7bit (0 ~ 127)
 		1 ~ 32 비트 까지는 : 출력을 할 수 없는 특수한 코드, 예) null , 헤더의 시작, 경고음(7) 개행 10, (LF)..
 		127 : delete.
 		
 		실제 출력 가능은 33번 비트 ~ 126 비트
 		영문, 숫자, 특수문자
 		
 		출력 (33~126번)
 		====================================
 		ASCII	문자		  ASCII	 문자
 		====================================
 		33		!		  34	 $
 		35		#		  36	
 */


public class Ascii_Code_Print {
	public static void main(String[] args) {

		System.out.println("========================================");
		System.out.println("ASCII" + "\t" + "문자" + "\t\t" + "ASCII" + "\t" + "문자" );
		System.out.println("========================================");
		
		for(int i = 33 ; i <= 126 ; i+=2 ) {
					System.out.println(i + "\t" + (char)i + "\t\t" + (i+1) + "\t" + (char)(i+1));
			}
			} 
		}
		
		
	
