package com.example.Product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/p")
public class ProductController {
	
	@GetMapping(path = "/")
	public boolean get() {
		return true;
	}

}
