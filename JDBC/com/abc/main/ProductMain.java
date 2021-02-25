package com.abc.main;

import java.util.Scanner;

import com.abc.bean.Product;
import com.abc.service.ProductService;

public class ProductMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Product Id:");
		int pid = sc.nextInt();
		
		System.out.println("Enter Product Name:");
		String pname = sc.next();
		
		System.out.println("Enter Product Price:");
		double price = sc.nextDouble();
		
		ProductService service = new ProductService();
		
		Product product = new Product();
		product.setProductId(pid);
		product.setName(pname);
		product.setPrice(price);	
		
		boolean result = service.addProduct(product);
		
		if(result) {
			System.out.println("Product added.");
		}
		else {
			System.out.println("Something wrong");
		}		
		
		sc.close();	

	}

}
