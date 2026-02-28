package assignments.object_class.run;

import assignments.object_class.Product;

public class Run {//클래스영역시작

	public static void main(String[] args) {//메소드영역시작
		
		Product p = new Product();
		p.setpName("이름");
		p.setPrice(3000);
		p.setBrand("브랜드");
		
		System.out.println(p.information());
		
		
		
	}//메소드영역끝

}//클래스영역끝
