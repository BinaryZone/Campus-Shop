package com.wh.o2o.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.IOUtils;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import com.wh.o2o.BaseTest;
import com.wh.o2o.dto.ShopExecution;
import com.wh.o2o.entity.Area;
import com.wh.o2o.entity.PersonInfo;
import com.wh.o2o.entity.Shop;
import com.wh.o2o.entity.ShopCategory;
import com.wh.o2o.enums.ShopStateEnum;

public class ShopServiceTest extends BaseTest{
	@Autowired
	private ShopService shopService;
	@Test
	public void testModifyShop() throws IOException {
		Shop shop = new Shop();
		shop.setShopId(20L);
		shop.setShopName("修改店铺测试");
		String filePath = "E:\\eclipsejavaee\\o2o\\images\\cat.jpg";
		shopService.modifyShop(shop, path2MultipartFile(filePath));
		System.out.println("修改后图片：" + shop.getShopImg());
	}
	@Test
	@Ignore
	public void testAddShop() throws IOException {
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
		shop.setEnableStatus(ShopStateEnum.CHECK.getState());
		shop.setAdvice("审核中");
		String filePath = "E:\\eclipsejavaee\\o2o\\images\\cat.jpg";
		ShopExecution se = shopService.addShop(shop, path2MultipartFile(filePath));
		System.out.println(se.getState());
	}
	private MultipartFile path2MultipartFile(String filePath) throws IOException {
		File file = new File(filePath);
		FileInputStream input = new FileInputStream(file);
		MultipartFile multipartFile = new MockMultipartFile("file", file.getName(), "text/plain",
				IOUtils.toByteArray(input));
		return multipartFile;
	}
}
