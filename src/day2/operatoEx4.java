package day2;

public class operatoEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//비트 연산자 예제
		
		 int num1 =12, num2 =10;
		 int num3 = num1 & num2;
		 int num4 = num1 | num2;
		 int num5 = num1 ^ num2;
		 int num6 = ~num1;
		 System.out.println("num1 & num2 =" + num3);
		 System.out.println("num1 | num2 =" + num4);
		 System.out.println("num1 ^ num2 =" + num5);
		 System.out.println("~num1 = " + num6);
		 
// num1 & num2 =8 
// num1 | num2 =14  
// num1 ^ num2 =6 
// ~num1 = -13
		 System.out.println("----------------");
		 
		  //비트쉬프트 연산자 예제
		 System.out.println("10<<1 :" + (10<<1));
		 System.out.println("10<<2 :" + (10<<2));
		 System.out.println("10<<3 :" + (10<<3));
		 
		 System.out.println("10<<1 :" + (10>>1));
		 System.out.println("10<<2 :" + (10>>2));
		 System.out.println("10<<3 :" + (10>>3));
		
	}

}
