package day4;

public class test4 {

	public static void main(String[] args) {

		        
		  int number[] = new int [10]; 	 
		  int max=10;
		  int min=1;
				
		  for(int i=0; i<number.length; i++){number[i]=(int)(Math.random()*(max-min*1))+min;
		  }
		  for(int tmp:number) {
		  System.out.printf("%3d",tmp);
		  }
		  System.out.println();
		  for(int i=0; i<number.length-1; i++) {
			  for(int j=0; j<number.length; j++) {
	              if(number[j]>number[j+1]) {
	            	  int tmp = number[j];
	            	  number[j]=number[j+1];
	            	  number[j+1] = tmp;
	           }
	              for(int tmp:number) {
	        		  System.out.printf("%3d",tmp);
	        		  
	              }
			  }
		  }
	}
}