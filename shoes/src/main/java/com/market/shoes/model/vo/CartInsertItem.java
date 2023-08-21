package com.market.shoes.model.vo;

import lombok.Data;

@Data
public class CartInsertItem {
	private int userNo;
	private int itemNo;
	private int itemSize;
	private int itemCount;
}
