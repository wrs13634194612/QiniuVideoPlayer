package com.znzb.partybuilding.netframe.calander;


import com.znzb.partybuilding.netframe.bean.CalendarBean;
import com.znzb.partybuilding.netframe.base.BasePresenter;
import com.znzb.partybuilding.netframe.bean.ScoreBean;

public class CalenderPresenter extends BasePresenter<CalenderViewInterface> {
    private CalenderModel model = new CalenderModel();

    public void checkCalendar(String userId) {

        model.calendar(userId, new CalenderModelInter.Response() {
            @Override
            public void success(CalendarBean calendarBean) {
                mView.calendarShow(calendarBean);
            }
        });
    }

    public void smallCalendar(String userId,String month) {

        model.smallCalendar(userId, month,new CalenderModelInter.Response() {
            @Override
            public void success(CalendarBean calendarBean) {
                mView.calendarShow(calendarBean);
            }
        });
    }

    public void score(String userId) {

        model.score(userId, new CalenderModelInter.ScoreResponse() {
            @Override
            public void success(ScoreBean scoreBean) {
                mView.score(scoreBean);
            }
        });
    }


}
