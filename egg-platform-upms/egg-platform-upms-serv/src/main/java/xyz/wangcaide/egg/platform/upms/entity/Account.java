package xyz.wangcaide.egg.platform.upms.entity;

import xyz.wangcaide.egg.platform.data.entity.BaseEntity;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

/**
 * Entity Account 账户
 * @author : wangcaide@outlook.com
 * @date : 2022-10-13
 */
@TableName("UPMS_ACCOUNT")
@Data
public class Account extends BaseEntity {
    /** 账户ID */
    @TableId(value = "ACCOUNT_ID",type = IdType.AUTO)
    private Long accountId ;
    /** 账户类型，个人/.. */
    @TableField("ACCOUNT_TYPE")
    private String accountType ;
    /** 用户名(登陆名) */
    @TableField("USERNAME")
    private String username ;
    /** 密码 */
    @TableField("PASSWORD")
    private String password ;
    /** 状态 */
    @TableField("STATUS")
    private String status ;

}