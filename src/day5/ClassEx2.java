package day5;

public class ClassEx2 {

	public static void main(String[] args) {
	Point1.printCount();
	Point1 p1 = new Point1();
	p1.printPoint1();
	p1.moveXY(4, 5);
	p1.printPoint1();
	p1.setX1(2);
	p1.printPoint1();
	p1.setY1(2);
	p1.printPoint1();	
	Point1 p2=new Point1(10,10);
	p2.printPoint1();
	Point1.printCount();
	
	}
}



class Point1{
	private int x1,y1;
	/* 기능 : 현재 좌표를 출력하는 기능
	 * 매개변수 : 없음
	 * 리턴타입 : 없음
	 * 메소드명 : printPoint
	 */
	private static int count;
	public void printPoint1() {
		System.out.printf("(%d,%d)\n",x1,y1);
	}
	/* 기능 : x,y좌표가 주어지면 해당 좌표로 이동하는 기능
	 * 매개변수 : x,y좌표 => int x, int y
	 * 리턴타입 : 없음
	 * 메소드명 : moveXY
	 */
	public void moveXY(int x, int y) {
		x1 = x;
		y1 = y;
	}
	//getter와 setter
	//getter는 멤버편수가 private인 경우 직접 멤버 변수의 값을 가져올수없기 때문에 접근가능한 
	//멤버 변수의 값을 가져올수있는 메서드이다.
	//setter는 멤버편수가 private인 경우 직접 멤버 변수의 값을 가져올수없기 때문에 설정가능한
	//멤버 변수의 값을 설정할수있는 메서드이다.
	public int getX1() {
		return x1;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public int getY1() {
		return y1;
	}
	public void setY1(int y1) {
		this.y1 = y1;
	}
	//생성자가 하나도없으면 기본생성자를 생략해도 클래스에 기본생성자가 자동으로 만들어진다. 
	//생성자 오버로딩이 되어있고 기본 생성자가 없으면, 이때는 자동으로 기본 생성자를 만들지않아서 기본생성자를 이용한 객체를 만들수없다.
	public Point1() {
		count++;
	}
	 	public Point1(int x, int y) {
		x1 = x; y1= y;
		count++;
	}	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Point1.count = count;
	}
	public static void printCount() {
		//에러발생, 클래스 메소드에는 객체(멤버)변수를 사용할수없다
		//System.out.printlm(x1);
		System.out.println("지금까지만들어진 좌표의개수:"+count);
	}
}





