package com.market.shoes.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.market.shoes.model.vo.Member;
import com.market.shoes.model.vo.Order;
import com.market.shoes.model.vo.OrderItem;

@Mapper
@Repository
public interface OrderMapper {

	int insertOrder(Order o);

	int insertOrderItem(List<OrderItem> orderItems);
	
	int deleteCart(List<OrderItem> orderItems);

	int updateStock(OrderItem orderItem);

}
