package com.market.shoes.model.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.market.shoes.model.dao.ItemMapper;
import com.market.shoes.model.vo.Item;

@Service
public class ItemServiceImpl implements ItemService{

	private ItemMapper itemMapper;
	private HttpServletRequest req;
	
	public ItemServiceImpl() {
	}
	
	@Autowired
	public ItemServiceImpl(ItemMapper itemMapper) {
		this.itemMapper = itemMapper;
	}
	
	@Override
	public List<Item> itemDetail(int itemNo) {
		List<Item> item = itemMapper.itemDetail(itemNo);
		item.get(0).setImgLocation("http://localhost:8080/img/nikeshoes1.jpg");
		System.out.println(item);
		return item;
	}

	@Override
	public List<Item> itemList() {
		
		List<Item> itemList = itemMapper.itemList();
		
		for(int i=0; i<itemList.size(); i++) {
//			itemList.get(i).setImgLocation(req.getScheme()+"://"
//					+req.getServerName()+":"
//					+req.getServerPort()+"/"
//					+itemList.get(i).getImgLocation());
			itemList.get(i).setImgLocation("http://localhost:8080/img/"+itemList.get(i).getImgLocation());
		}
		return itemList;
	}

}
