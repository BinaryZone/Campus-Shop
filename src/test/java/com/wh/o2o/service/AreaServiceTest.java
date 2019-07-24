package com.wh.o2o.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.wh.o2o.BaseTest;
import com.wh.o2o.entity.Area;

public class AreaServiceTest extends BaseTest{
	@Autowired
	private AreaService areaService;
	@Test
	public void testGetAreaList() {
		List<Area> areaList = areaService.getAreaList();
		System.out.println(areaList.toString());
	}
}
