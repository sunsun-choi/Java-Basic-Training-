package assignments.object_class;


//클래스만들기연습( Generate Getters and Setters를 사용하지 않고 직접 작성하기 )
public class Product {//클래스 영역 시작

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
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	//imformation
	public String imformation() {
		return "pName : " + pName + ", price : " + price + ", brand : " + brand;
	}
	
	
	
}//클래스 영역 끝 
