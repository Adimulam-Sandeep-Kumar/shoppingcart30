package ai.jobiak.session;

import java.io.Serializable;

public class Product implements  Serializable {
	
	private String productId;
	private String description;
	private double price;
	
	public Product() {

	}

	public Product(String productId, String description, double price) {
		super();
		this.productId = productId;
		this.description = description;
		this.price = price;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", description=" + description + ", price=" + price + "]";
	}
	
}
