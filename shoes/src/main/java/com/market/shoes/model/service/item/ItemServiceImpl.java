package com.market.shoes.model.service.item;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.market.shoes.model.dao.BrandMapper;
import com.market.shoes.model.dao.ItemMapper;
import com.market.shoes.model.vo.Item;
import com.market.shoes.model.vo.ItemSize;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService{

	private final ItemMapper itemMapper;
	private final BrandMapper brandMapper;
	
	@Override
	public Map<String, List<Object>> shopPage(HttpServletRequest req, String brand) {
		Map<String, List<Object>> map = new HashMap<>();
		
		List<Object> itemList = itemMapper.itemList(brand);
		List<Object> brandList = brandMapper.brandList();
		
		for(int i=0; i<itemList.size(); i++) {
			((Item) itemList.get(i)).setImgLocation(req.getScheme()+"://"
					+req.getServerName()+":"
					+req.getServerPort()+"/img/"
					+((Item) itemList.get(i)).getImgLocation());
		}
		
		brandList.add(0, "All");

		map.put("item", itemList);
		map.put("brand", brandList);
		
		return map;
	}

	@Override
	public Map<String, Object> itemDetail(HttpServletRequest req, int itemNo) {
		Item item = itemMapper.itemDetail(itemNo);
		List<ItemSize> itemSize = itemMapper.itemSize(itemNo);
		
		item.setImgLocation(
				req.getScheme()+"://"
				+req.getServerName()+":"
				+req.getServerPort()+"/img/"
				+item.getImgLocation()
				);
		
		Map<String, Object> itemInfo = new HashMap<>();
		itemInfo.put("item", item);
		itemInfo.put("size", itemSize);
		
		return itemInfo;
	}
	

}
