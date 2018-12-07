package com.pretty.cat.prettycates.api;

import com.pretty.cat.prettycatapi.api.ProductFeignClient;
import com.pretty.cat.prettycatapi.model.BaseResult;
import com.pretty.cat.prettycates.service.ProductSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductSearchApi implements ProductFeignClient {

	@Autowired
	private ProductSearchService productSearchService;

	@Override
	public BaseResult findByName(@RequestParam("page") int page, @RequestParam("size") int size,
			@RequestParam("name") String name) {
		return productSearchService.findByNameHighLight(page, size, name);
	}
}
