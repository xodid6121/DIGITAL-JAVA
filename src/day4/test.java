package day4;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// hello~ 두 정수와 문자하나를 입력받아 출력하는 코드를 작성하세요.
		// 입력 : 1 a 2
		// 출력 : 1 a 2
		
		int num1, num2;
	    char op;
	    Scanner scan=new Scanner(System.in);
		System.out.println("두 정수와 문자하나를 입력하세요 : ");
		num1 = scan.nextInt();
		op = scan.next().charAt(0);
		num2 = scan.nextInt();
		System.out.printf("%d %s %d\n",num1,op, num2);
		scan.close();
		//============================================
		// 입력받은 문자 op가 +이면 두 수의 합을 출력하고
		// op가 -와 같다면 두 수의 차를 출력하고
		// op가 /와 같다면 두수의 나눈 결과를 출력하고
		// op가 *와 같다면 두수의 곱한 결과를출력하고
		// op가 %와 같다면 두수의 나머지 결과를 출력하세요.
		
		if(op == '+'){
		System.out.printf("%d %c %d = %d\n",num1,op,num2,num1+num2 );							 			
						}
		else if(op == '-'){
			System.out.printf("%d %c %d = %d\n",num1,op,num2,num1-num2 );							 			
							} 			
		else if(op == '/'){
			System.out.printf("%d %c %d = %.2f\n",num1,op,num2,(double)num1/num2 );							 			
							} 
		else if(op == '*'){
			System.out.printf("%d %c %d = %d\n",num1,op,num2,num1*num2 );							 			
							} 
		else if(op == '%'){
			System.out.printf("%d %c %d = %d\n",num1,op,num2,num1%num2 );							 			
							} 
		else{
			System.out.println(op + "는 산술 연산자가 아닙니다.");							 			
							} 
		
		System.out.println("====================================================");
		
		switch(op) {
		case '+':
			System.out.printf("%d %c %d = %d\n",num1,op,num2,num1+num2 );
			break;
		case '-':
			System.out.printf("%d %c %d = %d\n",num1,op,num2,num1-num2 );
			break;
		case '/':
			System.out.printf("%d %c %d = %.2f\n",num1,op,num2,(double)num1/num2 );
			break;
		case '*':
			System.out.printf("%d %c %d = %d\n",num1,op,num2,num1*num2 );
			break;
		case '%':
			System.out.printf("%d %c %d = %d\n",num1,op,num2,num1%num2 );
			break;
		default:
			System.out.println(op + "는 산술 연산자가 아닙니다.");
		}
		
	}
}