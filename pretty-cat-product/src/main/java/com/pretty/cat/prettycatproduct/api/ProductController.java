package com.pretty.cat.prettycatproduct.api;

import com.pretty.cat.prettycatapi.model.BaseRequest;
import com.pretty.cat.prettycatapi.model.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pretty.cat.prettycatproduct.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/product/findByName", method = RequestMethod.GET)
	public BaseResult findByName(@RequestBody BaseRequest baseRequest) {
		return productService.findByName(baseRequest);
	}

}
