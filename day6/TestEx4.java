package day6;

public class TestEx4 {

	public static void main(String[] args) {
		/* 정수형 배열 5개짜리를 생성하여 배열의 값을 출력하세요 */
   
		int arr[] = new int[5]; //배열을 선언하고 생성했다.
		
		printArray(arr); // 00000출력
		//배열의값을 0번지부터 마지막까지 접근하는 반복문
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i;
			//0번지에 0을 1번지에 1을.. 4번지에는 4가 저장되도록 작성하시오.
		}
		printArray(arr); //바꾼값을 출력확인하는것
		/* num에 1을 저장후  num의 값이 arr에 있는지 없는지 확인하여 있으면 있습니다.
		 * 없으면 없습니다라고 출력하는 코드를 작성하세요
		 * */
		int num = 4;
		for(int i=0; i<arr.length; i++ ) {
			if(arr[i] == num) {
				System.out.println("\n" + num + "는 있습니다.");
				break;
			}
			// arr.length-1은 배열 arr마지막번지
			// 앞에서 중복검사를 하기 때문에 마지막번지이면서 여기까지 왔다는 것은
			// 마지막번지까지 중복된 내용이 없다는 뜻이다.
			if(i==arr.length-1) {
				System.out.println("\n" + num + "는 없습니다.");
			}
	    	
	    }
	    
	 
	
	}
	/* 기능 : 배열이 주어지면 주어진 배열의 각 원소의 값들을 출력하는 메서드 
	 * 매개변수 : 배열 => int[] arr
	 * 리턴타입 : 없음
	 * 메소드명 : printArray
	 */
	public static void printArray(int []arr) {
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
			System.out.println();		
	}
	
	
}






	
	
