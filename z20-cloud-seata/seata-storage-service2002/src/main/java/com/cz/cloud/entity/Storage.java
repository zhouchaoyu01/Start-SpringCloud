package com.cz.cloud.entity;

import lombok.Data;

/**
 * @author zhouchaoyu
 * @time 2023-12-10-21:27
 */
@Data
public class Storage {

    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}