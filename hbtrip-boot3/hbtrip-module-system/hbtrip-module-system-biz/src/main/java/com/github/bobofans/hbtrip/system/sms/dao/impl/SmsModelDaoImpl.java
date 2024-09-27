package com.github.bobofans.hbtrip.system.sms.dao.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.bobofans.hbtrip.system.sms.dao.SmsModelDao;
import com.github.bobofans.hbtrip.system.sms.entity.SmsModelEntity;
import com.github.bobofans.hbtrip.system.sms.mapper.SmsModelMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 短信模版表 服务实现类
 * </p>
 *
 * @author bobofans
 * @since 2024-09-25 09:36:39
 */
@Slf4j
@Repository
@RequiredArgsConstructor
public class SmsModelDaoImpl extends ServiceImpl<SmsModelMapper, SmsModelEntity> implements SmsModelDao {

}
