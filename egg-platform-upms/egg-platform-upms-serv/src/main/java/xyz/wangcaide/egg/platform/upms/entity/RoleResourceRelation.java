package xyz.wangcaide.egg.platform.upms.entity;

import xyz.wangcaide.egg.platform.data.entity.BaseEntity;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Entity RoleResourceRelation 角色资源关系
 * @author : wangcaide@outlook.com
 * @date : 2022-8-31
 */
@Entity(name="UPMS_ROLE_RESOURCE_RELATION")
@Data
public class RoleResourceRelation extends BaseEntity {
    /** id */
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id ;
    /** 角色id */
    @Column(name = "角色id")
    private Long roleId ;
    /** 资源id */
    @Column(name = "资源id")
    private Long resourceId ;
    /** 状态 */
    @Column(name = "状态")
    private String status ;

}