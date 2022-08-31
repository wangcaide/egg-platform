package xyz.wangcaide.egg.platform.upms.entity;

import xyz.wangcaide.egg.platform.data.entity.BaseEntity;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Entity AccountRoleRelation 账户角色关系
 * @author : wangcaide@outlook.com
 * @date : 2022-8-31
 */
@Entity(name="UPMS_ACCOUNT_ROLE_RELATION")
@Data
public class AccountRoleRelation extends BaseEntity {
    /** ID */
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id ;
    /** 账户ID */
    @Column(name = "账户ID")
    private Long accountId ;
    /** 角色ID */
    @Column(name = "角色ID")
    private Long roleId ;
    /** 状态 */
    @Column(name = "状态")
    private String status ;

}