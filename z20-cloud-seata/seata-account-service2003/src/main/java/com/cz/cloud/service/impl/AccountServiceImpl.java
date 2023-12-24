package com.cz.cloud.service.impl;

/**
 * @author zhouchaoyu
 * @time 2023-12-10-21:40
 */

import com.cz.cloud.dao.AccountDao;
import com.cz.cloud.service.AccountService;
import io.seata.core.context.RootContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;/**
 * 账户业务实现类
 * Created by zzyy on 2019/11/11.
 */
@Service
public class AccountServiceImpl implements AccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);


    @Resource
    AccountDao accountDao;

    /**
     * 扣减账户余额
     */
    @Override
    public void decrease(Long userId, BigDecimal money) {
        LOGGER.info("------->account-service中扣减账户余额开始");
        LOGGER.info("Seata全局事务id=================>{}", RootContext.getXID());
        //模拟超时异常，全局事务回滚
        //暂停几秒钟线程
        try { TimeUnit.SECONDS.sleep(30); } catch (InterruptedException e) { e.printStackTrace(); }
        accountDao.decrease(userId,money);
        LOGGER.info("------->account-service中扣减账户余额结束");

    }

}
