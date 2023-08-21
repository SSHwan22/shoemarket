package com.market.shoes.model.service.cart;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.market.shoes.model.dao.CartMapper;
import com.market.shoes.model.vo.CartInsertItem;
import com.market.shoes.model.vo.CartItemList;
import com.market.shoes.model.vo.Item;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CartServiceImp implements CartService{

	private final CartMapper cartMapper;

	@Override
	public int cartInsert(CartInsertItem cartItem) {
		return cartMapper.cartInsert(cartItem);
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
	
	
}
