package ch18_exception.exam;

public class ComputerSale implements Sale {
	private int price;
	private int percent;
	private String productName;
	

	public ComputerSale(String productName, int price, int percent) {
		this.productName = "삼보컴퓨터";
		this.price = 790_000;
		this.percent = 30;
		
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
		return "제품명 : " + productName + "\n가격 : " + price + "원\n할인율 : " + percent + "%";
	}
	
}
	
	
