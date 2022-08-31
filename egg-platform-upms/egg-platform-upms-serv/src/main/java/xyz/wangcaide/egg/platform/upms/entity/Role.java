package xyz.wangcaide.egg.platform.upms.entity;

import xyz.wangcaide.egg.platform.data.entity.BaseEntity;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Entity Role 账户角色信息
 * @author : wangcaide@outlook.com
 * @date : 2022-8-31
 */
@Entity(name="UPMS_ROLE")
@Data
public class Role extends BaseEntity {
    /** ID */
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long roleId ;
    /** 角色码 */
    @Column(name = "角色码")
    private String roleCode ;
    /** 角色名称 */
    @Column(name = "角色名称")
    private String roleName ;
    /** 状态 */
    @Column(name = "状态")
    private String status ;

}