package xyz.wangcaide.egg.platform.upms.entity;

import xyz.wangcaide.egg.platform.data.entity.BaseEntity;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

/**
 * Entity Contact 联系方式
 * @author : wangcaide@outlook.com
 * @date : 2022-10-13
 */
@TableName("UPMS_CONTACT")
@Data
public class Contact extends BaseEntity {
    /** id */
    @TableId(value = "CONTACT_ID",type = IdType.AUTO)
    private Long contactId ;
    /** 联系方式(手机/邮箱/地址) */
    @TableField("CONTACT_TYPE")
    private String contactType ;
    /** 联系信息 */
    @TableField("CONTACT_INFO")
    private String contactInfo ;
    /** 个人信息ID */
    @TableField("PERSON_ID")
    private Long personId ;
    /** 首选联系方式，Y/N */
    @TableField("IS_PRIMARY")
    private String isPrimary ;
    /** 状态 */
    @TableField("STATUS")
    private String status ;

}