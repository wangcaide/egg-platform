package xyz.wangcaide.egg.platform.upms.entity;

import xyz.wangcaide.egg.platform.data.entity.BaseEntity;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Entity PersonAccountRelation 个人信息账户关系表
 * @author : wangcaide@outlook.com
 * @date : 2022-8-31
 */
@Entity(name="UPMS_PERSON_ACCOUNT_RELATION")
@Data
public class PersonAccountRelation extends BaseEntity {
    /** ID */
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id ;
    /** 个人信息表ID */
    @Column(name = "个人信息表ID")
    private Long persionId ;
    /** 账户id */
    @Column(name = "账户id")
    private Long accountId ;
    /** 状态 */
    @Column(name = "状态")
    private String status ;

}