package com.wh.o2o.dao;

import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.wh.o2o.BaseTest;
import com.wh.o2o.entity.Area;
import com.wh.o2o.entity.PersonInfo;
import com.wh.o2o.entity.Shop;
import com.wh.o2o.entity.ShopCategory;

public class ShopDaoTest extends BaseTest{
	@Autowired
	private ShopDao shopDao;
	@Test
	public void testQueryShop() {
		Shop shop = shopDao.selectByShopId(20);
		System.out.println("areaName:" + shop.getArea().getAreaName());
		System.out.println("shopCategoryName:" + shop.getShopCategory().getShopCategoryName());
	}
	
	public void testInsertShop() {
		Shop shop = new Shop();
		PersonInfo owner = new PersonInfo();
		Area area = new Area();
		ShopCategory shopCategory = new ShopCategory();
		owner.setUserId(1L);
		area.setAreaId(2);
		shopCategory.setShopCategoryId(1L);
		shop.setOwner(owner);
		shop.setArea(area);
		shop.setShopCategory(shopCategory);
		shop.setShopName("test");
		shop.setShopDesc("test");
		shop.setShopAddr("test");
		shop.setPhone("test");
		shop.setShopImg("test");
		shop.setCreateTime(new Date());
		shop.setEnableStatus(1);
		shop.setAdvice("审核中");
		int num = shopDao.insertShop(shop);
		System.out.println(num);
	}
	@Test
	@Ignore
	public void testUpdateShop() {
		Shop shop = new Shop();
		shop.setShopId(1L);
		shop.setShopDesc("测试描述");
		shop.setShopAddr("测试地址");
		shop.setLastEditTime(new Date());
		int num = shopDao.updateShop(shop);
		System.out.println(num);
	}
}
