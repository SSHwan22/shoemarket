package com.market.shoes.model.vo;

import lombok.Data;

@Data
public class OrderItem {
	private int orderItemNo;
	private int count;
	private int orderPrice;
	private int orderNo;
	private int itemNo;
}
