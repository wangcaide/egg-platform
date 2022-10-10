package xyz.wangcaide.egg.platform.upms.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * ResourceVO 资源(系统/菜单/按键/链接)
 * @author : wangcaide@outlook.com
 * @date : 2022-10-10
 */
@Schema(name = "资源(系统/菜单/按键/链接)")
@Data
public class ResourceVO implements Serializable {
    /** 资源类型，系统/菜单/按键/链接 */
    @Schema(name = "资源类型，系统/菜单/按键/链接")
    private String resourceType ;
    /** 资源链接 */
    @Schema(name = "资源链接")
    private String resourceUrl ;
    /** 资源名称 */
    @Schema(name = "资源名称")
    private String resourceName ;
    /** 资源描述 */
    @Schema(name = "资源描述")
    private String resourceDescription ;
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