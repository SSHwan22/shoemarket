package com.market.shoes.model.service;

import java.util.List;

import com.market.shoes.model.vo.Item;

public interface ItemService {

	List<Item> itemDetail(int itemNo);
}
