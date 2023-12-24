package com.cz.cloud.service;


/**
 * @author zhouchaoyu
 * @time 2023-12-10-14:59
 */
public interface StorageService {

    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
