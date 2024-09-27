package com.github.bobofans.hbtrip.system.sms.mapper;

import com.github.bobofans.hbtrip.common.mybatis.mapper.BaseMapperX;
import com.github.bobofans.hbtrip.system.sms.entity.SmsModelEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 短信模版表 Mapper 接口
 * </p>
 *
 * @author bobofans
 * @since 2024-09-25 09:36:39
 */
@Mapper
public interface SmsModelMapper extends BaseMapperX<SmsModelEntity> {

    default SmsModelEntity selectByCode(String code){
        return selectOne(SmsModelEntity::getSmsCode,code);
    }

}
