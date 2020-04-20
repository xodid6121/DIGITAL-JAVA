package day2;

public class operator13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//for문 기본 예제 : 1부터 5까지 출력하는 예제
// 1. 반복횟수 : i는 1부터 9까지 1씩증가
// 2. 규칙성 7 x i = 7*i 를출력
//		7 x i = 7
//		7 x i = 14
//		7 x i = 21
//		7 x i = 28
//		7 x i = 35
//		7 x i = 42
//		7 x i = 49
//		7 x i = 56
//		7 x i = 63
	
		
		int i, num=7;
		for(i=1; i<=9; i+=1) {
		System.out.printf("%d x %d = %d\n",num ,i ,num*i);
	
	}

		
		
}

}