package com.wh.o2o.dao;

import com.wh.o2o.entity.Shop;

public interface ShopDao {
	/**
	 * 新增店铺
	 * @param shop
	 * @return
	 */
	int insertShop(Shop shop);
	/**
	 * 更新店铺信息
	 * @param shop
	 * @return
	 */
	int updateShop(Shop shop);
	/**
	 * 根据shopid查询店铺信息
	 * @param shopId
	 * @return
	 */
	Shop selectByShopId(long shopId);
}
