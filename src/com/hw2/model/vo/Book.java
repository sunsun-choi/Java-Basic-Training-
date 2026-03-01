package com.hw2.model.vo;


public class Book {//클래스 영역시작
	
	//필드명
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	//생성자명
	public Book() {}
	public Book(String title, int price, double discountRate, String author) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	
	
	//메소드부
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//information
	public String information() {
		return title + "   " + price  + "   " + discountRate  + "   " + author;
	}
	
	//discount
	//****변수조합계산식은 필드부가 아닌 메소드부에서 만들어준다****
	//**필드부는 재료만!
	//**계산은 메소드부에서! 
	
	public void showDiscountTag() {
		int discountPrice = (int)(price * (1 - discountRate));
		System.out.println("도서명 = " + title);
		System.out.println("할인된 가격 = " + discountPrice);
	}
	
/*	---------------만드는동안 실수한 것------------------------
	!!!!오류!!!!
	출력문이 너무 길면 복잡하니까 계산식을 새로운 메소드로 빼야하지 않을까? -> x
	- 계산식을 새로운 메소드로 뺄 경우 메소드밖에서 변수가 적용되지 않음.
	- 필드에 새로운 변수를 선언해도 내가만든 계산식 메소드를 호출하지 않는이상 작동하지 않음.
	- 우리가 원하는건 "출력"을 할 때 계산까지 완료된 결과물이 필요함
	
	<<옳은 방법>>
	---> 출력문 안에 계산식을 함께 넣음으로서 계산 후 출력되도록 만들어야함.
	
	******새롭게 암기할 것******
	필드부는 외부에서 받는 값 or 고정값만 선언한다 (계산식x)
	한번의 동작으로 함께 수행되어야 하는 동작은 같은 메소드 안에서 작성한다.
	
	
	*/
	
}//클래스 영역끝
