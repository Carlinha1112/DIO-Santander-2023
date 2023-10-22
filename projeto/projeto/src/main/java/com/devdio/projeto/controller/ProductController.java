package com.devdio.projeto.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devdio.projeto.entities.Department;
import com.devdio.projeto.entities.Product;


@RestController
@RequestMapping(value = "/products")
public class ProductController {

	@GetMapping
	public List<Product> getObjects() {
		Department d1 = new Department(1L, "Cozinha");
		Department d2 = new Department(2L, "Cama, Mesa e Banho");
		
		Product p1 = new Product(1L, "Jogo de pratos", 550.0, d1);
		Product p2 = new Product(2L, "Jogo de copos", 250.0, d1);
		Product p3 = new Product(3L, "Lençol King", 200.0, d2);
		
		List<Product> list = Arrays.asList(p1, p2, p3);
		
		return list;

	}
}
