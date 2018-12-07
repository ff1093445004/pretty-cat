package com.pretty.cat.prettycatapi.model;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class BaseResult implements Serializable {
	private long total;
	private List list;
}
