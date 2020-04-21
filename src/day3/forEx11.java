package day3;

public class forEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*  *        i=1  *=1
	 *  ** 	     i=2  *=2
	 *  ***      i=3  *=3
	 *  ****     i=4  *=4
	 *  *****    i=5  *=5
	 *                *=i
	 */                 
	
		
		for(int i=1; i<=5; i++) {
			for(int j=1 ; j<=5-i; j++) {
				System.out.print(" ");
                }
				for(int j=1 ; j<=i ; j++) {
				System.out.print("*");
										}
					System.out.println();
									}		
			
	
	}

}
