package assignments.object_class.com.kh.field.example2.model.vo;

public class Circle {//클래스영역시작
	
	//필드부
	public static final double PI = 3.14; //기울임꼴이 없지만 대문자이므로 상수!
	private static int radius = 1; 
	
	//생성자부
	public Circle() {}
	
	//메소드부
	public void incrementRadius() {
		radius += 1;
	}
	
	// ***return 없이 출력을 지시하는 다이어그램!***
	// vo 클래스에서 출력문을 만들어 끝낸다
	public void getAreaOfCircle() {
		System.out.println(radius * radius * PI);
	}
	public void getSizeOfCircle() {
		System.out.println(2 * radius * PI); 
	}
}//클래스영역끝
