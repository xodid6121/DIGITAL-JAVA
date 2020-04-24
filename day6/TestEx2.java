package day6;

import java.util.Scanner;

public class TestEx2 {

	public static void main(String[] args) {
		/* 문자를 입력받아 출력하는 과정을 q가 입력될때까지 반복하세요.
		 * */ 
		char ch;
		Scanner scan=new Scanner(System.in);
		System.out.print("문자를 입력하세요.");
		for(int i= 0; i <= i; i++){
				ch = scan.next().charAt(0);
							
				if(ch !='q')  
					System.out.println("입력받은문자 :" + ch);
					else {  
					System.out.println("종료합니다 :" + ch);
				break;
					}
	    }
		scan.close();
		
	}	
			
}



