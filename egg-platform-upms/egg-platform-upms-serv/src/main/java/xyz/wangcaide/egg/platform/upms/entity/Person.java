package xyz.wangcaide.egg.platform.upms.entity;

import xyz.wangcaide.egg.platform.data.entity.BaseEntity;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Entity Person 个人信息
 * @author : wangcaide@outlook.com
 * @date : 2022-8-31
 */
@Entity(name="UPMS_PERSON")
@Data
public class Person extends BaseEntity {
    /** ID */
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long personId ;
    /** 名字 */
    @Column(name = "名字")
    private String firstName ;
    /** 姓 */
    @Column(name = "姓")
    private String lastName ;
    /** 证件类型 */
    @Column(name = "证件类型")
    private String idType ;
    /** 证件号 */
    @Column(name = "证件号")
    private String idNumber ;
    /** 状态 */
    @Column(name = "状态")
    private String status ;

}