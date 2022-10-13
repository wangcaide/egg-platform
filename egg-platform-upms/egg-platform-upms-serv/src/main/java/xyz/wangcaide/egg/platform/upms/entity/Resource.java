package xyz.wangcaide.egg.platform.upms.entity;

import xyz.wangcaide.egg.platform.data.entity.BaseEntity;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

/**
 * Entity Resource 资源(系统/菜单/按键/链接)
 * @author : wangcaide@outlook.com
 * @date : 2022-10-13
 */
@TableName("UMPS_RESOURCE")
@Data
public class Resource extends BaseEntity {
    /** ID */
    @TableId(value = "RESOURCE_ID",type = IdType.AUTO)
    private Long resourceId ;
    /** 资源类型，系统/菜单/按键/链接 */
    @TableField("RESOURCE_TYPE")
    private String resourceType ;
    /** 资源链接 */
    @TableField("RESOURCE_URL")
    private String resourceUrl ;
    /** 资源名称 */
    @TableField("RESOURCE_NAME")
    private String resourceName ;
    /** 资源描述 */
    @TableField("RESOURCE_DESCRIPTION")
    private String resourceDescription ;
    /** 状态 */
    @TableField("STATUS")
    private String status ;

}