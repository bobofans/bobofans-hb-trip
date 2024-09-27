package com.github.bobofans.hbtrip.system.sms.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;

import com.github.bobofans.hbtrip.common.mybatis.entity.BaseDO;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * <p>短信模版表</p>
 * @author bobofans
 * @since 2024-09-25 09:36:39
 */
@TableName(value = "sms_model",autoResultMap = true)
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class SmsModelEntity extends BaseDO {

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 短信模版code
     */
    @TableField("sms_code")
    private String smsCode;

    /**
     * 短信分类
     */
    @TableField("sms_type")
    private String smsType;

    /**
     * 短信标题
     */
    @TableField("sms_title")
    private String smsTitle;

    /**
     * 短信模版内容
     */
    @TableField("sms_content")
    private String smsContent;

    /**
     * 需排除的占位符
     */
    @TableField("exclude_placeholder")
    private String excludePlaceholder;

    /**
     * 外部短信模板编码
     */
    @TableField("template_code")
    private String templateCode;

    @TableField("rich_content")
    private String richContent;

    /**
     * 是否外部模版代码标识
     */
    @TableField("outer_code_flag")
    private Integer outerCodeFlag;

    /**
     * 状态:1-启用，0-禁用
     */
    @TableField("status")
    private String status;

    /**
     * 创建时间
     */
    @TableField(value = "gmt_create", fill = FieldFill.INSERT)
    private LocalDateTime gmtCreate;

    /**
     * 修改时间
     */
    @TableField(value = "gmt_modify", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime gmtModify;
}
