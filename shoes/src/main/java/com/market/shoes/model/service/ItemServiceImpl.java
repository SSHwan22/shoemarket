package com.market.shoes.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.market.shoes.model.dao.ItemMapper;
import com.market.shoes.model.vo.Item;

@Service
public class ItemServiceImpl implements ItemService{

	private ItemMapper itemMapper;
	
	public ItemServiceImpl() {
	}
	
	@Autowired
	public ItemServiceImpl(ItemMapper itemMapper) {
		this.itemMapper = itemMapper;
	}
	
	@Override
	public List<Item> itemDetail(int itemNo) {
		List<Item> item = itemMapper.itemDetail(itemNo);
		item.get(0).setImgLocation("/img/nikeshoes1.jpg");
		System.out.println(item);
		return item;
	}

}
