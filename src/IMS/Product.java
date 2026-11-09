package IMS;

public class Product {
	
	private String product_ID;
	private String product_name;
	private String product_category;
	private double unit_price;
	private int quantity_in_stock;
	
	public Product(String product_ID, String product_name, String product_category, double unit_price, int quantity_in_stock) {
		this.product_ID = product_ID;
		this.product_name = product_name;
		this.product_category = product_category;
		setUnit_price(unit_price);
		setQuantity_in_stock(quantity_in_stock);
		
		
		
	}
	
	public String getProduct_ID() {
		return product_ID;
	}
	
	public String getProduct_name() {
		return product_name;
	}
	
	public String getProduct_category() {
		return product_category;
	}
	
	public double getUnit_price() {
		return unit_price;
	}
	
	public int getQuantity_in_stock() {
		return quantity_in_stock;
	}
	
	
	public void setProduct_ID(String product_ID) {
		this.product_ID = product_ID;
	}
	
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	
	public void setProduct_category(String product_category) {
		this.product_category = product_category;
	}
	
	public void setUnit_price(double unit_price) {
		if(unit_price < 0) {
			System.out.println(" price can't be negative");
			this.unit_price = 0;
		}else {
			this.unit_price = unit_price;
		}
	}
	
	public void setQuantity_in_stock(int quantity_in_stock) {
		if(quantity_in_stock < 0) {
			System.out.println(" quantity can't be negative");
			this.quantity_in_stock = 0;
		}else {
			this.quantity_in_stock = quantity_in_stock;
		}
		
	}
	
	
	
	
	
	
	
	

}
