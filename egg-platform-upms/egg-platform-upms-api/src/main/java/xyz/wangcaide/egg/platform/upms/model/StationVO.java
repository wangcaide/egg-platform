package xyz.wangcaide.egg.platform.upms.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * StationVO 岗位
 * @author : wangcaide@outlook.com
 * @date : 2022-10-10
 */
@Schema(name = "岗位")
@Data
public class StationVO implements Serializable {
    /** 岗位名称 */
    @Schema(name = "岗位名称")
    private String stationName ;
    /** 岗位描述 */
    @Schema(name = "岗位描述")
    private String stationDescription ;
    /** 岗位级别 */
    @Schema(name = "岗位级别")
    private Long stationLevel ;
    /** 状态 */
    @Schema(name = "状态")
    private String status ;
    /** 创建人 */
    @Schema(name = "创建人")
    private String createdBy ;
    /** 创建时间 */
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(name = "创建时间")
    private Date createdTime ;

}