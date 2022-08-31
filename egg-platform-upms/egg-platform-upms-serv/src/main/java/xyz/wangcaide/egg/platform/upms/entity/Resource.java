package xyz.wangcaide.egg.platform.upms.entity;

import xyz.wangcaide.egg.platform.data.entity.BaseEntity;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Entity Resource 资源(系统/菜单/按键/链接)
 * @author : wangcaide@outlook.com
 * @date : 2022-8-31
 */
@Entity(name="UMPS_RESOURCE")
@Data
public class Resource extends BaseEntity {
    /** ID */
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long resourceId ;
    /** 资源类型，系统/菜单/按键/链接 */
    @Column(name = "资源类型，系统/菜单/按键/链接")
    private String resourceType ;
    /** 资源链接 */
    @Column(name = "资源链接")
    private String resourceUrl ;
    /** 资源名称 */
    @Column(name = "资源名称")
    private String resourceName ;
    /** 资源描述 */
    @Column(name = "资源描述")
    private String resourceDescription ;
    /** 状态 */
    @Column(name = "状态")
    private String status ;

}