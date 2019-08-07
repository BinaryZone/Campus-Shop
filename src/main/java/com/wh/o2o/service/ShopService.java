package com.wh.o2o.service;

import org.springframework.web.multipart.MultipartFile;

import com.wh.o2o.dto.ShopExecution;
import com.wh.o2o.entity.Shop;
import com.wh.o2o.exceptions.ShopOperationException;

public interface ShopService {
	ShopExecution addShop(Shop shop,MultipartFile shopImg);
	/**
	 * 根据id查询店铺详情
	 * 
	 * @param shopId
	 * @return
	 */
	Shop getByShopId(long shopId);
	/**
	 * 修改店铺
	 * 
	 * @param shop
	 * @param shopImg
	 * @return
	 */
	ShopExecution modifyShop(Shop shop, MultipartFile shopImg) throws ShopOperationException;
}
