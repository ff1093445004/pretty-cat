package com.pretty.cat.prettycatapi.model;

import lombok.Data;

@Data
public class BaseRequest {
	private String queryParam;
	private int size;
	private int page;
}
