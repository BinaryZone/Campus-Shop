package com.wh.o2o.service;

import org.springframework.web.multipart.MultipartFile;

import com.wh.o2o.dto.ShopExecution;
import com.wh.o2o.entity.Shop;

public interface ShopService {
	ShopExecution addShop(Shop shop,MultipartFile shopImg);
}
