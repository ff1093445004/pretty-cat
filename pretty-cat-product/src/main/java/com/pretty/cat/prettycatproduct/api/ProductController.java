package com.pretty.cat.prettycatproduct.api;

import com.pretty.cat.prettycatdomain.domain.BaseRequest;
import com.pretty.cat.prettycatproduct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pretty.cat.prettycatdomain.domain.BaseResult;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/product/findByName", method = RequestMethod.GET)
	public BaseResult findByName(@RequestBody BaseRequest baseRequest) {
		return productService.findByName(baseRequest);
	}

}
