package com.market.shoes.controller.item;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.market.shoes.model.service.item.ItemService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ItemController {
	
	private final ItemService itemService;
	
	@GetMapping("/api/test")
	public String test() {
		return "";
	}
	
	@GetMapping("/item")
	public String itemList(HttpServletRequest req, @RequestParam(value="brand", required=false) String brand) {
		return new Gson().toJson(itemService.shopPage(req, brand));
	}
	
	@GetMapping("/shop/{itemNo}")
	public String itemDetail(HttpServletRequest req, @PathVariable("itemNo") int itemNo) {
		return new Gson().toJson(itemService.itemDetail(req, itemNo));
	}
}