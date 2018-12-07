package com.pretty.cat.prettycatproduct.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.pretty.cat.prettycatapi.api.ProductFeignClient;

@FeignClient(value = "pretty-cat-es")
public interface ProductApi extends ProductFeignClient {

}
