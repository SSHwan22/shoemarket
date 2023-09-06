package com.market.shoes.model.service.cart;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.market.shoes.model.dao.CartMapper;
import com.market.shoes.model.vo.CartItem;
import com.market.shoes.model.vo.CartItemList;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CartServiceImp implements CartService{

	private final CartMapper cartMapper;

	@Override
	public int cartItemInsert(CartItem cartItem) {
		return cartMapper.cartItemInsert(cartItem);
	}

	public List<CartItemList> cartList(HttpServletRequest req, String userNo) {
		List<CartItemList> itemList = cartMapper.cartList(userNo);
		for(int i=0; i<itemList.size(); i++) {
			itemList.get(i).setImgLocation(req.getScheme()+"://"
					+req.getServerName()+":"
					+req.getServerPort()+"/img/"
					+itemList.get(i).getImgLocation());
		}
		
		return cartMapper.cartList(userNo);
	}

	@Override
	public int cartItemDelete(CartItem cartItem) {
		return cartMapper.cartItemDelete(cartItem);
	}
	
	
}
