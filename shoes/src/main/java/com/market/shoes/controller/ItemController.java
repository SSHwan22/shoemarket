package com.market.shoes.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.market.shoes.model.service.BrandService;
import com.market.shoes.model.service.ItemService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ItemController {
	
	private final ItemService itemService;
	private final BrandService brandService;
	
	@GetMapping("/api/test")
	public String test() {
		
		Map<String, List> map = new HashMap<>();
		
		map.put("item", itemService.itemDetail(1));
		map.put("brand", brandService.brandList());
		
		
		return new Gson().toJson(map);
	}
	
	@GetMapping("/item")
	public String itemList(HttpServletRequest req) {
		
		Map<String, List> map = new HashMap<>();
		
		map.put("item", itemService.itemList(req));
		map.put("brand", brandService.brandList());
		
		return new Gson().toJson(map);
	}
}
