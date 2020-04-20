package day2;

public class operator15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// 1부터5까지의 합을 구하는 코드를 for문으로 작성하세요.
	// 1. 반복횟수 : i는 1부터 5까지 1씩증가
	// 2. 규칙성 
    // sum = 0;
	// i = 1
    // 반복문 종료후 1~5까지의합 sum을 출력
		
		int i, sum=0;
		for(i=1; i <=5; i++) 
			sum = sum + i;           //sum += i;
          		System.out.println("1부터 5까지의 합 : " + sum);
		
		}
 		
	}


