package com.market.shoes.controller.cart;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.market.shoes.model.service.cart.CartServiceImp;
import com.market.shoes.model.vo.CartItem;
import com.market.shoes.model.vo.CartItemList;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/cart")
@RequiredArgsConstructor
public class CartController {

	private final CartServiceImp cartService;
	
	@GetMapping("/insert/{itemNo}")// 중복등록에 대한 처리 고민해봐야 함.
	public int CartItemInsert(CartItem cartItem) {
		return cartService.cartItemInsert(cartItem);
	}
	
	@GetMapping("/items")
	public List<CartItemList> cartList(HttpServletRequest req, String userNo) {
		return cartService.cartList(req, userNo);
	}
	
	@GetMapping("/delete/{itemNo}")
	public int CartItemDelete(CartItem cartItem) {
		return cartService.cartItemDelete(cartItem);
	}
}
