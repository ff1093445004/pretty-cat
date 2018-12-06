package com.pretty.cat.prettycates.api;

import com.pretty.cat.prettycatdomain.domain.BaseResult;
import com.pretty.cat.prettycates.service.ProductSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductSearchApi {

	@Autowired
	private ProductSearchService productSearchService;

	@RequestMapping(value = "/product/findByNameHighLight", method = RequestMethod.GET)
	public BaseResult findByNameHighLight(@RequestParam("page") int page, @RequestParam("size") int size,
			@RequestParam("name") String name) {
		return productSearchService.findByNameHighLight(page, size, name);
	}
}
