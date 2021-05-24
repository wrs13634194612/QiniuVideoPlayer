package com.znzb.partybuilding.netframe.calander;


import com.znzb.partybuilding.netframe.bean.CalendarBean;
import com.znzb.partybuilding.netframe.bean.LoginBean;
import com.znzb.partybuilding.netframe.bean.ScoreBean;

public interface CalenderModelInter {
    void calendar(String userId,Response response);
    void smallCalendar(String userId,String month,Response response);
    void score(String userId,ScoreResponse response);


    interface Response{
        void success(CalendarBean calendarBean);
    }

    interface ScoreResponse{
        void success(ScoreBean scoreBean);
    }


}
