package xyz.wangcaide.egg.platform.upms.entity;

import xyz.wangcaide.egg.platform.data.entity.BaseEntity;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Entity Contact 联系方式
 * @author : wangcaide@outlook.com
 * @date : 2022-8-31
 */
@Entity(name="UPMS_CONTACT")
@Data
public class Contact extends BaseEntity {
    /** id */
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long contactId ;
    /** 联系方式(手机/邮箱/地址) */
    @Column(name = "联系方式(手机/邮箱/地址)")
    private String contactType ;
    /** 联系信息 */
    @Column(name = "联系信息")
    private String contactInfo ;
    /** 个人信息ID */
    @Column(name = "个人信息ID")
    private Long personId ;
    /** 首选联系方式，Y/N */
    @Column(name = "首选联系方式，Y/N")
    private String isPrimary ;
    /** 状态 */
    @Column(name = "状态")
    private String status ;

}