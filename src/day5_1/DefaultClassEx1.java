package day5_1;
//클래스에 접근제한자 Public이 붙는조건
// -파일명과 클래스 이름이 같은 경우에서 Public을 붙을 수 있다.
public class DefaultClassEx1 {
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("접근제한자 : public");
	}
}
 	// DefaultClassEx2 클래스는 접근 제한자가 Default이므로 같은 패키지나 같은
	// 클래스에서 불러올수있다. 다른 패키지에서는DefaultClassEx2를 불러올수없다
class DefaultClassEx2 {
	public static void main(String[] args)	{
		System.out.println("접근제한자 : default");
		
		point p1 = new point();
		p1.x1=10;
		
		//point클래스 x2는 private이기 때문에 다른 클래스에서 사용할 수 없다
		//p1.x2 =10;
	}

}
//point : 2차원 좌표평면에서 점1개를 나타내는 클래스
class point{
	int x1;  //x축의 좌표
	int y1;  //y축의 좌표
	private int x2;                      //나만 사용가능, 일반적으로 클래스에 붙이지는 않는다.
	private int y2;
	public int x3;                       //누구나 사용가능
	public int y3;
	public point() {
		x1 = x2 = x3 =0;
		y1 = y2 = y3 =0;
		System.out.println("point의 기본 생성자 호출");
	}
	//생성자 오버로딩
	public point(int x, int y) {
		x1 = x2 = x3 = x;
		y1 = y2 = y3 = y;
		System.out.println("point의 기본 생성자 오버로딩 호출");
	}
}
