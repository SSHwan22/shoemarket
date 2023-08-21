package com.market.shoes.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.market.shoes.model.vo.CartInsertItem;
import com.market.shoes.model.vo.CartItemList;

@Mapper
@Repository
public interface CartMapper {

	int cartInsert(CartInsertItem cartItem);

	List<CartItemList> cartList(String userNo);
}
