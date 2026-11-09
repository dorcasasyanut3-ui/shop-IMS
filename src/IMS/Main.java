package IMS;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product("A01 ", "flash 32 ", "electronics ", 5000.0, 100);
		
		Product product2 = new Product("B01", "Alps book", "stationery", 4000.0, 500);
		
		Product product3 = new Product("C01", "Bic pen", "stationery", 500.0, 300);
		
		Product product4 = new Product("D01", "Tiger pencil", "stationery", 100.0, 100);
		
		Product product5 = new Product("E01", "Ream of paper", "stationery", 15000.0, 500);
		
		
		Product[] inventory = {product1, product2, product3, product4, product5};
		
		System.out.println(" products ");
		
		displayProducts(inventory);
		
		
		product1.setUnit_price(6000.0);
		
		product1.setQuantity_in_stock(150);
		
		
		System.out.println("after update");
		displayProducts(inventory);
		
//		Product badProduct = new Product("B02", "Alps book", "stationery", -4000, -100);
//		System.out.println("price is: " + badProduct.getUnit_price() + " quantity is: " + badProduct.getQuantity_in_stock() );

	}
	
	public static void displayProducts(Product[] products) {
    	for(Product item: products) {
    		System.out.println(item.getProduct_ID() + " " + item.getProduct_name() + " " + item.getProduct_category() + " " + item.getUnit_price() + " " + item.getQuantity_in_stock());
    	
    		
    	}
    }
	
	
}


    
    	
    
    
    
