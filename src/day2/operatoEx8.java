package day2;

import java.util.Scanner;

public class operatoEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* 정수형 변수 num를 선언하고, num의 값을 초기화 하여
		 * num가 2의 배수이면 2의 배수라고 출력하고,
		 * 3의 배수이면 3의배수라고 출력하고,
		 * 6의배수이면 6의배수라고 출력하고,
		 * 2,3,6의 배수가 아니면 2,3,6의 배수가 아닙니다 라고 출력하는 코드를 작성하세요
		 * 예 : 6 => 6의배수입니다.
		 */
        
	 int num;
	 
	 Scanner scan = new Scanner(System.in);
	 System.out.println("정수를 입력하세요.");
	 num = scan.nextInt();
     if(num % 2 == 0 && num %3 != 0) {
    	 System.out.println(num + "는 2의 배수입니다.");
     }

     else if(num % 3 == 0 && num % 2 != 0) {
    	 System.out.println(num + "는 3의 배수입니다.");
     }
     
     else if(num % 6 == 0) {
    	 System.out.println(num + "는 6의 배수입니다.");
     }
	
     else {
    	 System.out.println(num + "는 2,3,6의 배수가아닙니다.");
     }
	
	
	
	
	
	}
}