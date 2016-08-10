package com.springMvc.shopping;

import java.util.ArrayList;
import java.util.List;

public class ProductBean {
	
	private List<String> products=new ArrayList<String>();
	ProductDetails productDetails;
	
	
	
	public List<String> getProducts() {
		return products;
	}

	public void setProducts(List<String> products) {
		this.products = products;
	}

	

}