package xyz.wangcaide.egg.platform.upms.entity;

import xyz.wangcaide.egg.platform.data.entity.BaseEntity;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Entity Account 账户
 * @author : wangcaide@outlook.com
 * @date : 2022-8-31
 */
@Entity(name="UPMS_ACCOUNT")
@Data
public class Account extends BaseEntity {
    /** 账户ID */
    @Id
    @GeneratedValue
    @Column(name = "账户ID")
    private Long accountId ;
    /** 账户类型，个人/.. */
    @Column(name = "账户类型，个人/..")
    private String accountType ;
    /** 用户名(登陆名) */
    @Column(name = "用户名(登陆名)")
    private String username ;
    /** 密码 */
    @Column(name = "密码")
    private String password ;
    /** 状态 */
    @Column(name = "状态")
    private String status ;

}