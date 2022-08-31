package xyz.wangcaide.egg.platform.data.entity;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Date;

public class BaseEntity implements Serializable {
    /** 租户号 */
    @Column(name = "TENANT_ID")
    private String tenantId ;
    /** 乐观锁 */
    @Column(name = "REVISION")
    private String revision ;
    /** 创建人 */
    @Column(name = "CREATED_BY")
    private String createdBy ;
    /** 创建时间 */
    @Column(name = "CREATED_TIME")
    private Date createdTime ;
    /** 更新人 */
    @Column(name = "UPDATED_BY")
    private String updatedBy ;
    /** 更新时间 */
    @Column(name = "UPDATED_TIME")
    private Date updatedTime ;
}
