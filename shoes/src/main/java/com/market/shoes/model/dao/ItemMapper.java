package com.market.shoes.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.market.shoes.model.vo.Item;

@Mapper
@Repository
public interface ItemMapper {

	List<Object> itemList(String brandName);
	
	Item itemDetail(int itemNo);
	
}
