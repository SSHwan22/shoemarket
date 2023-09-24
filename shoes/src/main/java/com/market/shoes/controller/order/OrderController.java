package com.market.shoes.controller.order;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
//@RequestMapping("/cart")
@RequiredArgsConstructor
public class OrderController {

	private OrderService orderService;
	
	@GetMapping("/cart/pay")
	public void orderSave(HttpServletRequest request) {
		System.out.println("order");
		Enumeration e = request.getParameterNames();
		while (e.hasMoreElements()) {
			String name = (String) e.nextElement();
			String[] values = request.getParameterValues(name);
			for (String value : values) {
				System.out.println("name=" + name + ",value=" + value);
			}
		}
		
		
	}
}
