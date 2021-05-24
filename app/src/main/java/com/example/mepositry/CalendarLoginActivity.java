package com.example.mepositry;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.znzb.partybuilding.R;
import com.znzb.partybuilding.netframe.base.BaseActivity;
import com.znzb.partybuilding.netframe.bean.CalendarBean;
import com.znzb.partybuilding.netframe.bean.ScoreBean;
import com.znzb.partybuilding.netframe.calander.CalenderPresenter;
import com.znzb.partybuilding.netframe.calander.CalenderViewInterface;

public class CalendarLoginActivity extends BaseActivity<CalenderPresenter> implements CalenderViewInterface {
    private Button btn_login_calendar,btn_calendar,btn_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_login);
        btn_login_calendar = findViewById(R.id.btn_login_calendar);

        btn_calendar = findViewById(R.id.btn_calendar);
        btn_score= findViewById(R.id.btn_score);

        btn_login_calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.checkCalendar("968");
            }
        });

        btn_calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.smallCalendar("968","202105");
            }
        });


        btn_score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.score("968");
            }
        });




    }

    @Override
    public CalenderPresenter getPresenter() {
        return new CalenderPresenter();
    }

    @Override
    public void calendarShow(CalendarBean calendarBean) {
        Log.e("TAG", "CalendarActivity_calendarShow:" + calendarBean);
    }

    @Override
    public void score(ScoreBean scoreBean) {
        Log.e("TAG", "CalendarActivity_ScoreBean:" + scoreBean);
    }


}
