package com.market.shoes.model.service.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.market.shoes.model.dao.OrderMapper;
import com.market.shoes.model.vo.Order;
import com.market.shoes.model.vo.OrderItem;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{

	private final OrderMapper orderMapper;
	
	@Override
	public int insertOrder(Order order) {
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		int result4 = 0;
		
		result1 = orderMapper.insertOrder(order);
		
		for(OrderItem orderItem : order.getOrderItems()) {
			orderItem.setOrderNo(order.getOrderNo());
			orderItem.setUserNo(order.getUserNo());
		}
		
		if(result1>0) {
			result2 = orderMapper.insertOrderItem(order.getOrderItems());
		}

		if(result2>0) {
			result3 = orderMapper.deleteCart(order.getOrderItems());
		}
		
		if(result3>0) {
			for(OrderItem orderItem : order.getOrderItems()) {
				result4 *= orderMapper.updateStock(orderItem);
			}
		}
		
		return result1*result2*result3*result4;
	}

}
