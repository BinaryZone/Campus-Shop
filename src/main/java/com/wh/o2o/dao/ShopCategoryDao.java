package com.wh.o2o.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wh.o2o.entity.ShopCategory;

public interface ShopCategoryDao {
	List<ShopCategory> selectShopCategory(@Param("shopCategoryCondition")ShopCategory shopCategoryCondition);
}
