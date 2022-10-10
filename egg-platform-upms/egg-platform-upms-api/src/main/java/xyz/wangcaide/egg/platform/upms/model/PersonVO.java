package xyz.wangcaide.egg.platform.upms.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * PersonVO 个人信息
 * @author : wangcaide@outlook.com
 * @date : 2022-10-10
 */
@Schema(name = "个人信息")
@Data
public class PersonVO implements Serializable {
    /** 名字 */
    @Schema(name = "名字")
    private String firstName ;
    /** 姓 */
    @Schema(name = "姓")
    private String lastName ;
    /** 证件类型 */
    @Schema(name = "证件类型")
    private String idType ;
    /** 证件号 */
    @Schema(name = "证件号")
    private String idNumber ;
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