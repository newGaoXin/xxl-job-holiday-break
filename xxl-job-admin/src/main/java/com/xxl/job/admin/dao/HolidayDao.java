package com.xxl.job.admin.dao;

import com.xxl.job.admin.core.model.Holiday;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface HolidayDao {

    /**
     * 根据时间查询假期
     * @return
     * @param date
     */
    List<Holiday> selectHolidayByDate(@Param("date") Date date);
}
