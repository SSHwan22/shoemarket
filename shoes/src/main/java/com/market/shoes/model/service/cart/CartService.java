package com.market.shoes.model.service.cart;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.market.shoes.model.vo.CartItem;
import com.market.shoes.model.vo.CartItemList;

public interface CartService {
	
	int cartItemInsert(CartItem cartItem);
	
	List<CartItemList> cartList(HttpServletRequest req, String userNo);
	
	int cartItemDelete(CartItem cartItem);

}
