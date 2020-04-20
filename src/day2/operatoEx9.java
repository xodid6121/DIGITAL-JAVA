package day2;

public class operatoEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // switch문을 이용한 홀짝 판변 예제
		
		int num =10;
		switch(num %2) {
		case 0:
			System.out.println(num +"는짝수이다.");
			break;
			
		case 1:
			System.out.println(num +"는홀수이다.");
			break;
	
		}
	
	
	}

}
