package assignments.object_class.run;

import assignments.object_class.Product;

//클래스 만들기 연습
public class Run {//클래스 영역 시작

	public static void main(String[] agrs) {//메소드 영역 시작
		
		Product p = new Product();
		p.setBrand("Brand");
		p.setpName("name");
		p.setPrice(3000);
		
		System.out.println(p.imformation());
		
		
	}//메소드영역끝
	
	
	
}//클래스 영역 끝