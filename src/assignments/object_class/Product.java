package assignments.object_class;


//클래스만들기연습1-자동화프로그램없이 타자연습 (파일삭제돼서 다시만들기)
public class Product {//메소드영역시작
	//필드부
	private String pName;
	private int price;
	private String brand;
	
	//생성자부
	public Product() {}
	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}
	
	//메소드부
	//setter
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	//getter
	public String getpName() {
		return pName;
	}
	public int setPrice() {
		return price;
	}
	public String setBrand() {
		return brand;
	}
	//information
	public String information() {
		return "pName : " + pName + ", price : " + price + ", brand : " + brand;
	}
	
}//메소드영역끝
