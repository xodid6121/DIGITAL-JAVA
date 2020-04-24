package day6;

public class MethodEx3 {

	/* 매개변수가 일반 변수이면 매개변수의 원본값이 변경되지 않는다.
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 =10, num2 = 20;
		System.out.printf("num1=%d, num2=%d(main)\n",num1,num2);
		swap(num1,num2);
		System.out.printf("num1=%d, num2=%d(main)\n",num1,num2);
	
		int arr[] = new int[4];
		for(int tmp : arr) {
			System.out.print(tmp+"");
		}
		System.out.println();
		
		setArray(arr,5);
		
		
	}
	public static void swap(int num1,int num2) {
		int tmp = num1;
		num1 = num2;
		num2 = tmp;
		System.out.printf("num1=%d, num2=%d(swap)\n",num1,num2);
	}	
	/* 기능 : 배열의 모든 값을 num로 변경하는 메서드
	 * */
	public static void setArray(int []arr, int num) {
		for(int i = 0; i<arr.length; i++) {
			arr[i] = num;
		}
	}
}
