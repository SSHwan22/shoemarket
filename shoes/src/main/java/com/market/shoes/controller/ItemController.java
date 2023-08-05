package com.market.shoes.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.market.shoes.model.service.ItemService;

@RestController
public class ItemController {

	private ItemService itemService;
	
	public ItemController() {
		
	}
	
	@Autowired
	public ItemController(ItemService itemService) {
		this.itemService = itemService;
	}
	
	
	@GetMapping("/api/test")
	public String test() {
		return new Gson().toJson(itemService.itemDetail(1));
	}
	
	@GetMapping("/item")
	public String itemList(HttpServletRequest req) {
		return new Gson().toJson(itemService.itemList(req));
	}
}
