package com.market.shoes.controller;

import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.market.shoes.model.service.BrandService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class BrandController {

	private final BrandService brandService;
	
	public String brandList() {
		return new Gson().toJson(brandService.brandList());
	}
}
