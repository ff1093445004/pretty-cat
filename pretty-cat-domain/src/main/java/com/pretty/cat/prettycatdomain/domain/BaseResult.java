package com.pretty.cat.prettycatdomain.domain;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class BaseResult implements Serializable {
	private long total;
	private List list;
}
