package com.market.shoes.model.service.cart;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.market.shoes.model.vo.CartInsertItem;
import com.market.shoes.model.vo.CartItemList;

public interface CartService {
	
	int cartInsert(CartInsertItem cartItem);
	
	List<CartItemList> cartList(HttpServletRequest req, String userNo);

}
