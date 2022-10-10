package xyz.wangcaide.egg.platform.upms.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * ContactVO 联系方式
 * @author : wangcaide@outlook.com
 * @date : 2022-10-10
 */
@Schema(name = "联系方式")
@Data
public class ContactVO implements Serializable {
    /** 联系方式(手机/邮箱/地址) */
    @Schema(name = "联系方式(手机/邮箱/地址)")
    private String contactType ;
    /** 联系信息 */
    @Schema(name = "联系信息")
    private String contactInfo ;
    /** 个人信息ID */
    @Schema(name = "个人信息ID")
    private Long personId ;
    /** 首选联系方式，Y/N */
    @Schema(name = "首选联系方式，Y/N")
    private String isPrimary ;
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