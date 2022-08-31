package xyz.wangcaide.egg.platform.upms.entity;

import xyz.wangcaide.egg.platform.data.entity.BaseEntity;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Entity PersonOrganizationRelation 个人机构关系
 * @author : wangcaide@outlook.com
 * @date : 2022-8-31
 */
@Entity(name="UPMS_PERSON_ORGANIZATION_RELATION")
@Data
public class PersonOrganizationRelation extends BaseEntity {
    /** ID */
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id ;
    /** 个人ID */
    @Column(name = "个人ID")
    private Long personId ;
    /** 机构ID */
    @Column(name = "机构ID")
    private Long organizationId ;
    /** 状态 */
    @Column(name = "状态")
    private String status ;

}