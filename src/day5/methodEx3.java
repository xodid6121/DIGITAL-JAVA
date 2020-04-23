package day5;

import java.util.Scanner;

public class methodEx3 {

	public static void main(String[] args) {
	 int n1, n2;
	 char o;
	 Scanner scan = new Scanner(System.in);
	 System.out.println("두정수와 연산자를입력하세요(예 :1 + 2 : ");
	 n1 = scan.nextInt();
	 o = scan.next().charAt(0);
	 n2 = scan.nextInt();
	System.out.printf("%d %c %d = %.2f\n",n1,o,n2,math(n1,o,n2));
	}

	/* 기능 : 두 정수와 산술 연산자가 주어지면 산술 연산결과를 알려주는 메서드
	 * 단, 예외 상황은 없다고 가정한다.
	 * 잘못된 연산자가 들어오거나, 0으로 나누는 경우
	 * 기능 : 두정수의 최대 공약수를 알려주는 메서드
	 
	 * 메소드명 : math
	 * 매개변수 : 산술연산자 => int num1, int num2, char op 
	 * 리턴타입 : 산술 연산결과 => 실수 => double
	 */ 
 public static double math(int num1, char op ,int num2) {
	 		 double res = 0.0;
			 switch(op) {
			 case '+' : res =num1 + num2; break;
			 case '-' : res =num1 - num2; break;
			 case '*' : res =num1 * num2; break;
			 case '/' : res = (double)num1 / num2; break;
			 case '%' : res =num1 % num2; break;
			 }
	 return res;
 }

}	

