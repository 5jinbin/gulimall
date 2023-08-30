package com.xunqi.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xunqi.common.to.SkuReductionTo;
import com.xunqi.common.utils.PageUtils;
import com.xunqi.gulimall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;


public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuReduction(SkuReductionTo skuReductionTo);
}

