package xyz.wangcaide.egg.platform.upms.entity;

import xyz.wangcaide.egg.platform.data.entity.BaseEntity;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

/**
 * Entity Station 岗位
 * @author : wangcaide@outlook.com
 * @date : 2022-10-13
 */
@TableName("UPMS_STATION")
@Data
public class Station extends BaseEntity {
    /** ID */
    @TableId(value = "STATION_ID",type = IdType.AUTO)
    private Long stationId ;
    /** 岗位名称 */
    @TableField("STATION_NAME")
    private String stationName ;
    /** 岗位描述 */
    @TableField("STATION_DESCRIPTION")
    private String stationDescription ;
    /** 岗位级别 */
    @TableField("STATION_LEVEL")
    private Long stationLevel ;
    /** 状态 */
    @TableField("STATUS")
    private String status ;

}