package day2;

public class operator16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // num가 주어지면 주어진 num의 약수를 출력하는 코드를 for문으로 작성하세요.
		// 약수 : 나누었을때 나머지가 0인 수
		// 4의 약수 : 1,2,4
		// 1. 반복횟수 : i=1부터 num 까지 1씩 증가
	    // 2. 규칙성 : i가 num의 약수이면 i를 출력  num를 i로 (나누었을때 나머지가)  0과(같다)(면) i를 출력
		// 3. 반복문 종료후 : x
		
		int i, num=4;
		for(i=1; i<=num; i++) {
		if(num % i == 0) {
	
	    System.out.println(i);
	
		}
		}
	
	
	}

}
