package com.market.shoes.model.service.item;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface ItemService {

	Map<String, List<Object>> shopPage(HttpServletRequest req, String brand);
	
	Map<String, Object> itemDetail(HttpServletRequest req, int itemNo);
}
