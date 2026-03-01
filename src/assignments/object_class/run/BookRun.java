package assignments.object_class.run;

import assignments.object_class.Book;

public class BookRun {//클래스영역시작

	public static void main(String[] args) {//메소드영역시작
		
		Book b1 = new Book("자바1", "출판사1", "오저자", 25000, 0.0);
		Book b2 = new Book("자바2", "출판사2", "김저자", 30000, 0.05);
		
		System.out.println(b1.information());
		System.out.println(b2.information());
	}//메소드영역끝

}//클래스영역끝
