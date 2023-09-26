package com.market.shoes.model.vo;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;

@Data
public class Order {
	private int orderNo;
	private LocalDate orderDate;
	private int userNo;
	private String address;
	private int orderTotalPrice;
	private List<OrderItem> orderItems;
}
