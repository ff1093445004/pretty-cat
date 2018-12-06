package com.pretty.cat.prettycatproduct.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pretty.cat.prettycatdomain.domain.BaseResult;

@RestController
public class ProductSearchController {

	@RequestMapping(value = "/product/findByNameHighLight", method = RequestMethod.GET)
	public BaseResult findByNameHighLight(@RequestParam("page") int page, @RequestParam("size") int size,
			@RequestParam("name") String name) {
		return null;
	}

}
