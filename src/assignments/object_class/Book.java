package assignments.object_class;


//클래스만들기 : 생성자 실습 예제
public class Book {//클래스영역시작

	//필드부
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	//생성자부
	public Book() {}
	public Book (String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	//*** 생성자 속에 생성자 호출해서 재활용하기!***
	public Book(String title, String publisher, String author, int price, double discountRate) {
		this(title, publisher, author);
		this.price = price;
		this.discountRate = discountRate;
	}
	
	//메소드부
	//information
	public String information() {
		return "제목 : " + title + ", 출판사 : " + publisher + ", 저자 : " + author
				+ ", 가격 : " + price + ", 할인률 : " + discountRate;
	}
	//setter
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	//getter
	public String getTitle() {
		return title;
	}
	public String getPublisher() {
		return publisher;
	}
	public String getAuthor(){
		return author;
	}
	public int getPrice() {
		return price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	
	
}//클래스영역끝
