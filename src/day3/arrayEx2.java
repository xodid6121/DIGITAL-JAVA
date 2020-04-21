package day3;

public class arrayEx2 {

	private static int[][] arr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		 int num1=10;
		 int num2=20;
		 
		 num1=num2;
	     System.out.println(num1);
	     System.out.println("---------------------------------");   
	     
	     int arr1[] = new int [] {1,2,3,4};
	     int arr2[] = new int [] {9,8,7,6};
	     //arr2[0] =1;
	     //아래 코드가 실행되면 arr2가 만든 배열을 arr1과 arr2가 공유하게 됨. 
	     //arr2가 만든 배열을 arr1과 arr2가 공유하게됨
	     //arr1 = arr2;
	     for(int i=0; i<arr1.length; i++) {
	    	 System.out.print(arr1[i] + "");
	     arr1[1] = arr1[i]; 
	     }
	     System.out.println();  
	     for(int i=0; i<arr2.length;i++) { 
	    	 System.out.print(arr2[i] + "");
	     }
	  
	     }
	}
  
