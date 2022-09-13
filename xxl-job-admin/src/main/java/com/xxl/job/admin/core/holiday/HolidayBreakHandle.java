package com.xxl.job.admin.core.holiday;

import com.xxl.job.admin.core.model.Holiday;
import com.xxl.job.admin.dao.HolidayDao;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class HolidayBreakHandle {

    @Resource
    private HolidayDao holidayDao;

    public Boolean handle(Date date){

        List<Holiday> holidays = holidayDao.selectHolidayByDate(date);

        return !CollectionUtils.isEmpty(holidays);
    }
}
