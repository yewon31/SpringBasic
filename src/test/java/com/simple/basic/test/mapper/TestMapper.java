package com.simple.basic.test.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {

	public String getTime();

}
