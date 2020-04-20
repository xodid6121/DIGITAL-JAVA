package day2;

public class operatoEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     
		System.out.println("안녕 난이태양이야");
	 
 // 아래 코드에서 동작은 콘솔에 값을 출력하는 것이다.
  int num1=10, num2=10;
  System.out.println("증가전 : num1 =" + num1 +", num2 =" +num2);
  System.out.println("증가중 : num1 =" + ++num1 +", num2 =" +num2++);
  System.out.println("증가후 : num1 =" + num1 +", num2 =" +num2);
	
  System.out.println("----------------------------");
  System.out.println("증가전 : num1 =" + num1 +", num2 =" +num2);
  ++num1;
  System.out.println("증가중 : num1 =" + num1 +", num2 =" +num2);
  ++num2;
  System.out.println("증가후 : num1 =" + num1 +", num2 =" +num2);
  
  System.out.println("----------------------------");
 
  System.out.println("증가전 : num1 =" + num1 +", num2 =" +num2);
  num1++;
  System.out.println("증가중 : num1 =" + num1 +", num2 =" +num2);
  num2++;
  System.out.println("증가후 : num1 =" + num1 +", num2 =" +num2);
  

// 아래 코드에서 동작은 저장하는 것(=)이다.
// int x = ++num1;
// int y = num2++;
// ++num1;
// num2++;
 
  System.out.println("----------------------------");        
        
// 정수 연산자 정수=> 정수
// 정수 연상자 실수=> 실수
// 실수 연산자 정수=> 실수
// 실수 연산자 실수=> 실수
// - 정수 / 정수는 결과가 정수여서 소수점이 사라져 원하는 결과가 나오지 않을수 있다.    
	
	 System.out.println(1/2); // 정수/정수 = 정수
	 System.out.println(1.0/2); // 실수/정수 = 실수
	 System.out.println(2.0/4); // 실수/정수 = 실수
	 

	
	
	
	}

}
