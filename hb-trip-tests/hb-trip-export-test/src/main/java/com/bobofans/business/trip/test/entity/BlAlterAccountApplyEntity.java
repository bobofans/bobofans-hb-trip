package com.bobofans.business.trip.test.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * bl_alter_account_apply
 * </p>
 *
 * @author bobofans
 * @since 2024-09-20 17:21:57
 */
@Data
@Accessors(chain = true)
@TableName("bl_alter_account_apply")
public class BlAlterAccountApplyEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 变更申请编号
     */
    @TableField("alter_account_apply_code")
    private String alterAccountApplyCode;

    /**
     * 合同编号
     */
    @TableField("contract_no")
    private String contractNo;

    /**
     * 回款银行卡号
     */
    @TableField("pay_account")
    private String payAccount;

    /**
     * 回款银行账户名
     */
    @TableField("pay_account_name")
    private String payAccountName;

    /**
     * 回款账户开户行
     */
    @TableField("pay_account_open_bank")
    private String payAccountOpenBank;

    /**
     * 回款账户开户行编码
     */
    @TableField("pay_account_open_bank_code")
    private String payAccountOpenBankCode;

    /**
     * 回款账户银行
     */
    @TableField("pay_account_bank")
    private String payAccountBank;

    /**
     * 回款账户银行编码
     */
    @TableField("pay_account_bank_code")
    private String payAccountBankCode;

    /**
     * 回款银行卡号
     */
    @TableField("new_pay_account")
    private String newPayAccount;

    /**
     * 回款银行账户名
     */
    @TableField("new_pay_account_name")
    private String newPayAccountName;

    /**
     * 回款账户开户行
     */
    @TableField("new_pay_account_open_bank")
    private String newPayAccountOpenBank;

    /**
     * 回款账户开户行编码
     */
    @TableField("new_pay_account_open_bank_code")
    private String newPayAccountOpenBankCode;

    /**
     * 回款账户银行
     */
    @TableField("new_pay_account_bank")
    private String newPayAccountBank;

    /**
     * 回款账户银行编码
     */
    @TableField("new_pay_account_bank_code")
    private String newPayAccountBankCode;

    /**
     * 备注
     */
    @TableField("remark")
    private String remark;

    /**
     * 状态：0-待发起 1-审核中 2-审核通过 3-审核不通过
     */
    @TableField("status")
    private String status;

    /**
     * 创建人编号
     */
    @TableField("creator_account")
    private String creatorAccount;

    /**
     * 创建人名称
     */
    @TableField("creator_name")
    private String creatorName;

    /**
     * 创建人组织编号
     */
    @TableField("creator_org_code")
    private String creatorOrgCode;

    @TableField(value = "gmt_create", fill = FieldFill.INSERT)
    private LocalDateTime gmtCreate;

    @TableField(value = "gmt_modify", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime gmtModify;

    /**
     * 重新发起标识
     */
    @TableField("re_add_flag")
    private String reAddFlag;

    /**
     * 是否需要评审: 0-不需要 1-需要
     */
    @TableField("is_need_review")
    private String isNeedReview;
}
