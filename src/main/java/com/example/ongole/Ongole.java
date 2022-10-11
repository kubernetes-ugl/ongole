package com.example.ongole;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ongole {
	
		@RequestMapping("/")
		public String welcome() {
			return "<h1>Welcome to Ongole</h1>";
		}
		@RequestMapping("/welcome")
		public String welcom() {
			return "<h1>Welcome to KothaPatnam Beach</h1>";
		}
}
