package day4;

public class test2 {

	public static void main(String[] args) {
		//1. 정수 10개를 저장할수 있는 배열을 선언 하고 생성하세요.
		
		//2. 1부터 10까지 차례대로 배열에 저장하세요.

		//3. 저장된 배열의 값을 출력하세요.
		
		//4. 인덱스(번지)가 짝수이면 현재 저장된 수에 2를 곱해서 저장하세요. 향상for
		
		//5. 저장된 배열의 값을 다시 출력하세요. 
	
	    
	    int number[] = new int [10];                    
	    //1. 정수 10개를 저장할수 있는 배열을 선언 하고 생성하세요.
	   
	    for(int i=0; i<number.length; i++){                  
	    number[i] = i + 1; 	System.out.printf(" %2d ",number[i]);  
	    //2.1부터 10까지 차례대로 배열에 저장하세요.
	    //3. 저장된 배열의 값을 출력하세요.
	    
	  }	
System.out.println("\n********************************************");       
		for(int i=0; i<number.length; i+=2) {
			number[i] = number[i]*2;
		}
	    
		for(int tmp: number) {
			System.out.printf(" %2d ", tmp);
		}
		//4. 인덱스(번지)가 짝수이면 현재 저장된 수에 2를 곱해서 저장하세요. 향상for

	}
}
