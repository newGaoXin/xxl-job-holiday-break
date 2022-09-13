package com.xxl.job.admin.core.scheduler;

import com.xxl.job.admin.core.util.I18nUtil;

public enum HolidayBreakEnum {

    CLOSE(I18nUtil.getString("holiday_break_close")),
    OPEN(I18nUtil.getString("holiday_break_open")),
    ;


    private String title;

    HolidayBreakEnum(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public static HolidayBreakEnum match(String name, HolidayBreakEnum defaultItem) {
        for (HolidayBreakEnum item : HolidayBreakEnum.values()) {
            if (item.name().equals(name)) {
                return item;
            }
        }
        return defaultItem;
    }
}
