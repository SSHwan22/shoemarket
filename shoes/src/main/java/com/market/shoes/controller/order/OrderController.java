package com.market.shoes.controller.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.market.shoes.model.service.order.OrderService;
import com.market.shoes.model.vo.Order;
import com.market.shoes.model.vo.OrderItem;

import lombok.RequiredArgsConstructor;

@RestController
//@RequestMapping("/cart")
@RequiredArgsConstructor
public class OrderController {

	private OrderService orderService;
	
	@PostMapping("/cart/pay")
	public void orderSave(@RequestBody Map<String, Map<String, Object>> map) {
		System.out.println(map.get("params").get("userTotalPrice"));
		
		Order order = new Order();
		List<OrderItem> orderItems = new ArrayList<>();
		
//		order.setOrderTotalPrice(map.get("params"));
//		int result = orderService.insertOrder();
		
	}
}
