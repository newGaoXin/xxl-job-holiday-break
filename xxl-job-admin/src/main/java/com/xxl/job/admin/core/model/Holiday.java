package com.xxl.job.admin.core.model;

import java.util.Date;

public class Holiday {

    private Long id; // 主键id

    private Date holidayBeginDate; // 假期开始时间

    private Date holidayEndDate; // 假期结束时间

    private String remark; // 备注

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getHolidayBeginDate() {
        return holidayBeginDate;
    }

    public void setHolidayBeginDate(Date holidayBeginDate) {
        this.holidayBeginDate = holidayBeginDate;
    }

    public Date getHolidayEndDate() {
        return holidayEndDate;
    }

    public void setHolidayEndDate(Date holidayEndDate) {
        this.holidayEndDate = holidayEndDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
