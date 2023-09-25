package com.market.shoes.model.vo;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Order {
	private int order;
	private LocalDate orderDate;
	private int userNo;
	private int orderTotalPrice;
}
