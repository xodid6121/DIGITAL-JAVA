package day6;

import java.util.Scanner;

public class TestEx3 {

	public static void main(String[] args) {
		/* 여러명 학생의 성적을 입력받아 해당학생의 성적을 학점으로 출력하세요.
		 * 학생의 성적이 음수가 입력되면 종료되도록하세요. 
		 * 100~90:a
		 * 89~80 :b
		 * 79~70 :c
		 * 69~60 :d
		 * 59 ~0 :f
		 * 100점이상 : 잘못된수입니다.
		 * 예시 : 성적을 입력하세요. : 100 
		 * 100는 A학점
		 * 예시 : 성적을 입력하세요. : 89
		 * 89는 B학점
		 * 예시 : 성적을 입력하세요. : 79 
		 * 79는 C학점
		 * 예시 : 성적을 입력하세요. : 69 
		 * 69는 D학점
		 * 예시 : 성적을 입력하세요. : 59 
		 * 59는 F학점
		 * 예시 : 성적을 입력하세요. : 120 
		 * 잘못된 점수입니다.
		 * */ 

		int num1;
		Scanner scan=new Scanner(System.in);
		for(int i=1; ;i++) {
				System.out.println("성적을 입력하세요.(종료하려면 음수를 입력하세요)");
			num1 = scan.nextInt();
			if(num1<=100 && num1>=90) {
				System.out.println("A입니다.");
			}else if(num1<=89 && num1>=80) {
				System.out.println("B입니다.");
			}else if(num1<=79 && num1>=70) {
				System.out.println("C입니다.");
			}else if(num1<=69 && num1>=60) {
				System.out.println("D입니다.");
			}else if(num1<=59 && num1>=0) {
				System.out.println("F입니다.");
			}else if(num1>100){
				System.out.println("잘못된점수입니다.");	
			}else {
				System.out.println("지금까지 입력확인한 학생의수는 " + (i-1) + "명입니다");
				System.out.println("종료");
				break;
			}
			
		
		}
	
	}

}
