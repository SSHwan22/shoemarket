package com.market.shoes.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.market.shoes.model.vo.Item;
import com.market.shoes.model.vo.ItemSize;

@Mapper
@Repository
public interface ItemMapper {

	List<Object> itemList(String brandName);
	
	Item itemDetail(int itemNo);
	
	List<ItemSize> itemSize(int itemNo);
	
}
