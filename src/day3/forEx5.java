package day3;

public class forEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int i;
		// for( ; ; ){
        // System.out.println("hello")};			
		//	의도적인 무한루프
		
		
		int sum = 0;
		//for( i=1 ; i<=5 ; sum++){
		// System.out.println("hello");}
		// i값이 변경되지 않아 무한루프에 빠짐
		
		//i가 계속감속하여 언더플로우로 인해 정수최대값이 되는 순간까지 반복
		//for(i=1;i<=5;i--){
		//System.out.println("hello");}
		
	    //반복문이 한번도 실행되지 않은 경우
		for(i=10; 1<=5; 1++){
		System.out.println("hello");
		}
		
		//변수는 선언한 위치부터 변수가 선언되 {}안에서 유효하다
		for(int j=1; j<=5; j++) {
		System.out.println("hello");}
		}
	
	     //에러 발생, j의 사용 범위 밖에서 j를 사용했기 때문에
	     //System.out.println(j);
	   
	
	
	
	
	                                        }
                  	}


