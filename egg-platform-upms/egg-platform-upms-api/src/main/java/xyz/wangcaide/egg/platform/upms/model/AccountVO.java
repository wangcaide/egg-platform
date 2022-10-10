package xyz.wangcaide.egg.platform.upms.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * AccountVO 账户
 * @author : wangcaide@outlook.com
 * @date : 2022-10-10
 */
@Schema(name = "账户")
@Data
public class AccountVO implements Serializable {
    /** 账户类型，个人/.. */
    @Schema(name = "账户类型，个人/..")
    private String accountType ;
    /** 用户名(登陆名) */
    @Schema(name = "用户名(登陆名)")
    private String username ;
    /** 密码 */
    @Schema(name = "密码")
    private String password ;
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