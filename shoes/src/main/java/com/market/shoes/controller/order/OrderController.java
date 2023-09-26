package com.market.shoes.controller.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.market.shoes.model.service.order.OrderService;
import com.market.shoes.model.vo.Member;
import com.market.shoes.model.vo.Order;
import com.market.shoes.model.vo.OrderItem;

import lombok.RequiredArgsConstructor;

@RestController
//@RequestMapping("/cart")
@RequiredArgsConstructor
public class OrderController {

	private final OrderService orderService;
	
	@PostMapping("/cart/pay")
	public String orderSave(@RequestBody Order order) {
		
		int result = orderService.insertOrder(order);
		
		
		if(result>0) {
			return "구매 성공";
		}else {
			return "구매 실패";
		}
		
	}
}
