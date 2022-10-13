package xyz.wangcaide.egg.platform.upms.entity;

import xyz.wangcaide.egg.platform.data.entity.BaseEntity;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

/**
 * Entity Role 账户角色信息
 * @author : wangcaide@outlook.com
 * @date : 2022-10-13
 */
@TableName("UPMS_ROLE")
@Data
public class Role extends BaseEntity {
    /** ID */
    @TableId(value = "ROLE_ID",type = IdType.AUTO)
    private Long roleId ;
    /** 角色码 */
    @TableField("ROLE_CODE")
    private String roleCode ;
    /** 角色名称 */
    @TableField("ROLE_NAME")
    private String roleName ;
    /** 状态 */
    @TableField("STATUS")
    private String status ;

}