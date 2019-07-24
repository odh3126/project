package ch18_exception.exam;

public class JavaBookSale implements Sale {
	private int price;
	private int percent;
	private String productName;
	

	public JavaBookSale(String productName, int price, int percent) {
		this.productName = "마음을 자극하는 자바프로그래밍";
		this.price = 20000;
		this.percent = 10;
		
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPercent() {
		return percent;
	}
	public void setPercent(int percent) {
		this.percent = percent;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public int calculatePrice() {
		
		return 0;
	}
	public String toString() {
		return "책제목 : " + productName + "\n가격 : " + price + "원\n할인율 : " + percent + "%";
	}
	
	
	
}
