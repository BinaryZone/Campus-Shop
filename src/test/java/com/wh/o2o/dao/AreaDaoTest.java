package com.wh.o2o.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.wh.o2o.BaseTest;
import com.wh.o2o.entity.Area;

public class AreaDaoTest extends BaseTest{
	@Autowired
	private AreaDao areaDao;
	@Test
	public void testQueryArea() {
		List<Area> areaList = areaDao.queryArea();
		System.out.println(areaList.toString());
	}
}
