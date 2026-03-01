package com.hw1.model.vo;

public class Product {//클래스 영역시작
	
	//필드부
	private String productId;
	private String productName;
	private String productArea;
	private int price;
	private double tax;
	
	//생성자부
	public Product() {}
	public Product(String productId, String productName, String productArea, int price, double tax) {
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
	}
	
	//필드부
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductArea() {
		return productArea;
	}
	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	//information
	public String information() {
		return productId + "   " + productName  + "   " + productArea  + "   " + price  + "   " + tax;
	}
	//세금포함가격
	public void totalPrice(){
		int totalPrice = price + (int)(price * tax);
		System.out.printf("상품명 = %s \n부가세 포함 가격 = %d원\n", productName, totalPrice);
	}
	
}//클래스영역 끝
