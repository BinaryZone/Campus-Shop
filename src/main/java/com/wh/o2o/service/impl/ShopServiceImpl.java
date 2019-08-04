package com.wh.o2o.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.wh.o2o.dao.ShopDao;
import com.wh.o2o.dto.ShopExecution;
import com.wh.o2o.entity.Shop;
import com.wh.o2o.enums.ShopStateEnum;
import com.wh.o2o.exceptions.ShopOperationException;
import com.wh.o2o.service.ShopService;
import com.wh.o2o.util.ImageUtil;
import com.wh.o2o.util.PathUtil;

@Service
public class ShopServiceImpl implements ShopService{
	@Autowired
	private ShopDao shopDao;
	@Override
	@Transactional
	public ShopExecution addShop(Shop shop, MultipartFile shopImg) {
		if (shop == null) {
			return new ShopExecution(ShopStateEnum.NULL_SHOP_INFO);
		}else {
			try {
				shop.setEnableStatus(0);
				shop.setCreateTime(new Date());
				shop.setLastEditTime(new Date());
				int effectNum = shopDao.insertShop(shop);
				if (effectNum <= 0) {
					throw new ShopOperationException("店铺创建失败");
				}else {
					if (shopImg != null) {
						// 存储图片
						try {
							addShopImg(shop,shopImg);
						} catch (Exception e) {
//							e.printStackTrace();
							throw new ShopOperationException("addShopImg error"+e.getMessage());
						}
						// 更新店铺的图片地址
						effectNum = shopDao.updateShop(shop);
						if (effectNum <= 0) {
							throw new ShopOperationException("更新图片地址失败");
						}
					}
				}
			} catch (Exception e) {
//				e.printStackTrace();
				throw new ShopOperationException("addShop error" + e.getMessage());
			}
		}
		return new ShopExecution(ShopStateEnum.CHECK,shop);
	}
	public void addShopImg(Shop shop, MultipartFile shopImg) {
		// 获取shop图片目录的相对值路径
		String dest = PathUtil.getShopImagePath(shop.getShopId());
		String shopImgAddr = ImageUtil.generateThumbnail(shopImg, dest);
		// 将图片路径存储用于更新店铺信息
		shop.setShopImg(shopImgAddr);
	}

}
