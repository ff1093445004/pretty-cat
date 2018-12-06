package com.pretty.cat.prettycatdomain.domain;

import lombok.Data;

@Data
public class BaseRequest {
	private String queryParam;
	private int size;
	private int page;
}
