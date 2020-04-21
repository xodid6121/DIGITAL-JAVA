package day3;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

public class whileExEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /* 두정수 num1과 num2의 최소 공배수를 구하는 코드를 작성하세요
         * 최소공배수 : 두 수의 공배수중 가장 작은 공배수
         * 공배수 : 두 수의 배수중 공통인 배수
         * 10의 배수 :10 20 30 40 ...
         * 15의 배수 : 15 30 45 60 ...
         * 10과 15의 최소 공배수 : 30
         * 1.반복횟수 : i는 1부터 num1*num2까지 1씩 증가
         * 2.규칙성 : i가 num1의 배수이고 i가 num2의 배수이면 i를 출력하고 반복문을 종료해라.
         * 3.반복문 종료 후 : 없음
         * while (조건식) { 실행문; 증감 연산식;}
         */
		
		
	
		
	    int num1=123224, num2=2;
	  // 1.반복횟수 : i는 1부터 num1*num2까지 1씩 증가
	    int i;
	    int cnt=0;
	    i=1;
	    while(i <= num1*num2) {
	    	cnt++;
	    	if(i % num1 == 0 && i % num2 ==0) {
	// 2.규칙성 : i가 num1의 배수이고 i가 num2의 배수이면 i를 출력하고 반복문을 종료해라.
			System.out.printf("%d와 %d의 최소 공배수 : %d, 반복횟수 : %d\n", num1 , num2 ,i, cnt);
			break;
	    	
			
	    			}
	    	i++;
	    		}
	    
	    i=num1;
	    cnt=0;
	    while(i <= num1*num2) {
	    	cnt++;
	    	if(i % num1 == 0 && i % num2 ==0) {
	    		System.out.printf("%d와 %d의 최소 공배수 : %d, 반복횟수 : %d\n", num1 , num2 ,i, cnt);
				break;
	    	
			
	    	}
	    	i+=num1;
	    }
	    
	    
	    
	        /* 위 예제는 i가 1부터 시작해서 최소 공배수를 구하기 때문에 최소 공배수가 큰 경우
	         * 반복 횟수가 많아진다.
	         * 그래서 아래처럼 i를 num1부터 시작하여 num1의 배수로 한다면 반복횟수가 줄어든다.
	         * 
	         */
	}
}


