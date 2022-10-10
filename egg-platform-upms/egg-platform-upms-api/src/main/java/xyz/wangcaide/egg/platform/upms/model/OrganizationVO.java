package xyz.wangcaide.egg.platform.upms.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * OrganizationVO 组织
 * @author : wangcaide@outlook.com
 * @date : 2022-10-10
 */
@Schema(name = "组织")
@Data
public class OrganizationVO implements Serializable {
    /** 上级机构ID */
    @Schema(name = "上级机构ID")
    private Long parentOrganizationId ;
    /** 机构码 */
    @Schema(name = "机构码")
    private String organizationCode ;
    /** 机构类型，公司/部门 */
    @Schema(name = "机构类型，公司/部门")
    private String organizationType ;
    /** 机构名称 */
    @Schema(name = "机构名称")
    private String organizationName ;
    /** 机构描述 */
    @Schema(name = "机构描述")
    private String organizationDescription ;
    /** 成立时间 */
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(name = "成立时间")
    private Date establishmentDate ;
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