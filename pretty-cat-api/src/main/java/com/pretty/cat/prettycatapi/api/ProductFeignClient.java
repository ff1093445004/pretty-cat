package com.pretty.cat.prettycatapi.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pretty.cat.prettycatapi.model.BaseResult;

@RestController
public interface ProductFeignClient {

	@RequestMapping(value = "/findByName", method = RequestMethod.GET)
	BaseResult findByName(@RequestParam("page") int page, @RequestParam("size") int size,
			@RequestParam("name") String name);
}
