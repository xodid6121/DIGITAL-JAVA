package day4;

public class test3 {

	public static void main(String[] args) {
		
		
		 	// 정수 10개짜리 배열에 값을 랜덤으로 생성하여 저장하고(중복o)
		
		int number[] = new int [10]; 	 
		int max=10;
		int min=1;
		
		for(int i=0; i<number.length; i++) { number[i]=(int)(Math.random()*(max-min*1))+min;
			
		}
		for(int tmp:number) {
		System.out.printf("%3d",tmp);
		
		}
 }
}
			
	 // 저장된 배열 값 중에서 가장 큰값과 가장 작은 값을 출력하는 코드를 작성 하세요.
      

	