package com.market.shoes.model.service.item;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.market.shoes.model.vo.Item;

public interface ItemService {

	Map<String, List<Object>> shopPage(HttpServletRequest req, String brand);
	
	Item itemDetail(HttpServletRequest req, int itemNo);
}
