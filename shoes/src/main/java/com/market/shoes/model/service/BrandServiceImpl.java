package com.market.shoes.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.market.shoes.model.dao.BrandMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BrandServiceImpl implements BrandService{
	
	private final BrandMapper brandMapper;
	
	@Override
	public List<String> brandList() {
		return brandMapper.brandList();
	}

}
