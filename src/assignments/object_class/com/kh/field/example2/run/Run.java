package assignments.object_class.com.kh.field.example2.run;

import assignments.object_class.com.kh.field.example2.model.vo.Circle;

public class Run {//클래스영역시작

	public static void main(String[] args) {//메소드영역시작
		
		Circle c = new Circle();
		c.getAreaOfCircle();
		c.getSizeOfCircle();
		
		c.incrementRadius();
		c.getAreaOfCircle();
		c.getSizeOfCircle();
		
		

	}//메소드영역끝

}//클래스영역끝
