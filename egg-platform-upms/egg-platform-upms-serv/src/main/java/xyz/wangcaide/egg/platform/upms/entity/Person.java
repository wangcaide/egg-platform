package xyz.wangcaide.egg.platform.upms.entity;

import xyz.wangcaide.egg.platform.data.entity.BaseEntity;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

/**
 * Entity Person 个人信息
 * @author : wangcaide@outlook.com
 * @date : 2022-10-13
 */
@TableName("UPMS_PERSON")
@Data
public class Person extends BaseEntity {
    /** ID */
    @TableId(value = "PERSON_ID",type = IdType.AUTO)
    private Long personId ;
    /** 名字 */
    @TableField("FIRST_NAME")
    private String firstName ;
    /** 姓 */
    @TableField("LAST_NAME")
    private String lastName ;
    /** 证件类型 */
    @TableField("ID_TYPE")
    private String idType ;
    /** 证件号 */
    @TableField("ID_NUMBER")
    private String idNumber ;
    /** 状态 */
    @TableField("STATUS")
    private String status ;

}