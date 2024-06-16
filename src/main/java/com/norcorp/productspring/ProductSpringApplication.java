package com.norcorp.productspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class ProductSpringApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ProductSpringApplication.class, args);

		ProductService service = context.getBean(ProductService.class);

//		System.out.println("========================================");
//		System.out.println("Get the list of all products");
//		System.out.println("--------------");
//		List<Product> products = service.getAllProducts();
//		for (Product p:products) {
//			System.out.println(p);
//		}

		// add a product to the database
		//service.addProduct(new Product("Samsung LED", "TV", "Green Table", 2024));

		// get a product by his name in the database
		Product p = service.getProduct("Mac Studio");
		System.out.println(p);
	}

}
