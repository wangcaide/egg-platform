package xyz.wangcaide.egg.platform.upms.entity;

import xyz.wangcaide.egg.platform.data.entity.BaseEntity;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

import java.util.Date;

/**
 * Entity Organization 组织
 * @author : wangcaide@outlook.com
 * @date : 2022-10-13
 */
@TableName("UPMS_ORGANIZATION")
@Data
public class Organization extends BaseEntity {
    /** ID */
    @TableId(value = "ORGANIZATION_ID",type = IdType.AUTO)
    private Long organizationId ;
    /** 上级机构ID */
    @TableField("PARENT_ORGANIZATION_ID")
    private Long parentOrganizationId ;
    /** 机构码 */
    @TableField("ORGANIZATION_CODE")
    private String organizationCode ;
    /** 机构类型，公司/部门 */
    @TableField("ORGANIZATION_TYPE")
    private String organizationType ;
    /** 机构名称 */
    @TableField("ORGANIZATION_NAME")
    private String organizationName ;
    /** 机构描述 */
    @TableField("ORGANIZATION_DESCRIPTION")
    private String organizationDescription ;
    /** 成立时间 */
    @TableField("ESTABLISHMENT_DATE")
    private Date establishmentDate ;
    /** 状态 */
    @TableField("STATUS")
    private String status ;

}