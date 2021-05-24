package com.znzb.partybuilding.netframe.calander;

import com.znzb.partybuilding.netframe.base.BaseViewInterface;
import com.znzb.partybuilding.netframe.bean.CalendarBean;
import com.znzb.partybuilding.netframe.bean.ScoreBean;

public interface CalenderViewInterface extends BaseViewInterface {
    void calendarShow(CalendarBean calendarBean);
    void score(ScoreBean scoreBean);
}
