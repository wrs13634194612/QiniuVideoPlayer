package com.znzb.partybuilding.netframe.calander;


import com.znzb.partybuilding.netframe.bean.CalendarBean;
import com.znzb.partybuilding.netframe.bean.ScoreBean;
import com.znzb.partybuilding.netframe.net.RetrofitHelper;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

public class CalenderModel implements CalenderModelInter {
    @Override
    public void calendar(String userId,
                         final Response response) {
        RetrofitHelper.calendarCheck(userId)
                .subscribe(new Observer<CalendarBean>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull CalendarBean calendarBean) {
                        response.success(calendarBean);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }

    @Override
    public void smallCalendar(String userId,String month,
                         final Response response) {
        RetrofitHelper.smallCalendar(userId,month)
                .subscribe(new Observer<CalendarBean>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull CalendarBean calendarBean) {
                        response.success(calendarBean);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }

    @Override
    public void score(String userId,final ScoreResponse response) {
        RetrofitHelper.score(userId)
                .subscribe(new Observer<ScoreBean>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull ScoreBean scoreBean) {
                        response.success(scoreBean);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }



}
