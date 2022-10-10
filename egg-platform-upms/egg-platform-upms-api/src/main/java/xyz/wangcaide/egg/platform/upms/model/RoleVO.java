package xyz.wangcaide.egg.platform.upms.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * RoleVO 账户角色信息
 * @author : wangcaide@outlook.com
 * @date : 2022-10-10
 */
@Schema(name = "账户角色信息")
@Data
public class RoleVO implements Serializable {
    /** 角色码 */
    @Schema(name = "角色码")
    private String roleCode ;
    /** 角色名称 */
    @Schema(name = "角色名称")
    private String roleName ;
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