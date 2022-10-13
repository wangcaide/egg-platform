package xyz.wangcaide.egg.platform.data.entity;

import lombok.Data;
import org.springframework.beans.BeanUtils;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.util.Date;

@Data
public class BaseEntity implements Serializable {
    /** 租户号 */
    @TableField("TENANT_ID")
    private String tenantId ;
    /** 乐观锁 */
    @TableField("REVISION")
    private String revision ;
    /** 创建人 */
    @TableField("CREATED_BY")
    private String createdBy ;
    /** 创建时间 */
    @TableField("CREATED_TIME")
    private Date createdTime ;
    /** 更新人 */
    @TableField("UPDATED_BY")
    private String updatedBy ;
    /** 更新时间 */
    @TableField("UPDATED_TIME")
    private Date updatedTime ;

    public <T> T convertVO(T emptyVO) {
        BeanUtils.copyProperties(this, emptyVO);
        return emptyVO;
    }
}
