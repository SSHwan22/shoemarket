package com.market.shoes.model.vo;

import lombok.Data;

@Data
public class CartItem {
	private int userNo;
	private int itemNo;
	private int itemSize;
	private Integer itemCount;
}
