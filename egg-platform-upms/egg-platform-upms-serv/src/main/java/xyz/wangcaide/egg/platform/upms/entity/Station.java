package xyz.wangcaide.egg.platform.upms.entity;

import xyz.wangcaide.egg.platform.data.entity.BaseEntity;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Entity Station 岗位
 * @author : wangcaide@outlook.com
 * @date : 2022-8-31
 */
@Entity(name="UPMS_STATION")
@Data
public class Station extends BaseEntity {
    /** ID */
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long stationId ;
    /** 岗位名称 */
    @Column(name = "岗位名称")
    private String stationName ;
    /** 岗位描述 */
    @Column(name = "岗位描述")
    private String stationDescription ;
    /** 岗位级别 */
    @Column(name = "岗位级别")
    private Long stationLevel ;
    /** 状态 */
    @Column(name = "状态")
    private String status ;

}