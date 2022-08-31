package xyz.wangcaide.egg.platform.upms.entity;

import xyz.wangcaide.egg.platform.data.entity.BaseEntity;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Entity Organization 组织
 * @author : wangcaide@outlook.com
 * @date : 2022-8-31
 */
@Entity(name="UPMS_ORGANIZATION")
@Data
public class Organization extends BaseEntity {
    /** ID */
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long organizationId ;
    /** 上级机构ID */
    @Column(name = "上级机构ID")
    private Long parentOrganizationId ;
    /** 机构码 */
    @Column(name = "机构码")
    private String organizationCode ;
    /** 机构类型，公司/部门 */
    @Column(name = "机构类型，公司/部门")
    private String organizationType ;
    /** 机构名称 */
    @Column(name = "机构名称")
    private String organizationName ;
    /** 机构描述 */
    @Column(name = "机构描述")
    private String organizationDescription ;
    /** 成立时间 */
    @Column(name = "成立时间")
    private Date establishmentDate ;
    /** 状态 */
    @Column(name = "状态")
    private String status ;

}