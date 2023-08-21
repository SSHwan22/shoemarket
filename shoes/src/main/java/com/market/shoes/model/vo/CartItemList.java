package com.market.shoes.model.vo;

import lombok.Data;

@Data
public class CartItemList {
	private int itemNo;
	private String itemCode;
	private String name;
	private int price;
	private String size;
	private String count;
	private String imgLocation;
}
