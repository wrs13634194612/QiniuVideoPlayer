package com.znzb.partybuilding.netframe.net;




import com.znzb.partybuilding.netframe.bean.AppDataBean;
import com.znzb.partybuilding.netframe.bean.CalendarBean;
import com.znzb.partybuilding.netframe.bean.GankBean;
import com.znzb.partybuilding.netframe.bean.LoginBean;
import com.znzb.partybuilding.netframe.bean.NewsBean;
import com.znzb.partybuilding.netframe.bean.ScoreBean;
import com.znzb.partybuilding.netframe.bean.StudyBean;
import com.znzb.partybuilding.netframe.bean.SubDataBean;
import com.znzb.partybuilding.netframe.search.SearchBean;

import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitHelper {
    public static final String BASE_URL = "http://znzb.test/api/";
    public static final String URL = "https://wanandroid.com/";
    private static RetrofitHelper instance;
    private Retrofit retrofit;

    private RetrofitHelper(){
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(OkHttpManager.getOkHttp())
                .build();
    }

    public static RetrofitHelper getInstance(){
        if (instance == null){
            synchronized (RetrofitHelper.class){
                if (instance == null){
                    instance = new RetrofitHelper();
                }
            }
        }
        return instance;
    }

    public ApiService getService(){
        ApiService service = retrofit.create(ApiService.class);
        return service;
    }

    /*
     * 登录
     * */
    public static Observable<LoginBean> loginCheck(String username, String password){
        Observable<LoginBean> observable = RetrofitHelper.getInstance().getService()
                .login(username,password)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
        return observable;
    }

    /*
     * 注册
     * */
    public static Observable<LoginBean> registerCheck(String username,
                                                      String password, String repassword){
        Observable<LoginBean> observable = RetrofitHelper.getInstance()
                .getService().register(username, password, repassword)
                .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        return observable;
    }

    /*
     * 搜索
     * */
    public static Observable<SearchBean> search(String text){
        Observable<SearchBean> observable = RetrofitHelper.getInstance()
                .getService().search(text)
                .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        return observable;
    }

    /*
     * 登录日历
     * */
    public static Observable<CalendarBean> calendarCheck(String userId){
        Observable<CalendarBean> observable = RetrofitHelper.getInstance()
                .getService().calendarLogin(userId)
                .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        return observable;
    }

    /*
     * 日历
     * */
    public static Observable<CalendarBean> smallCalendar(String userId,String month){
        Observable<CalendarBean> observable = RetrofitHelper.getInstance()
                .getService().smallCalendar(userId,month)
                .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        return observable;
    }

    /*
     * 登录积分
     * */
    public static Observable<ScoreBean> score(String userId){
        Observable<ScoreBean> observable = RetrofitHelper.getInstance()
                .getService().score(userId)
                .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        return observable;
    }

    /*
     * 获取日历
     * */
    public static Observable<LoginBean> regisdfsterCheck(String username,
                                                      String password, String repassword){
        Observable<LoginBean> observable = RetrofitHelper.getInstance()
                .getService().register(username, password, repassword)
                .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        return observable;
    }

    /*
     * 学习
     * */
    public static Observable<StudyBean> studyCheck(){
        Observable<StudyBean> observable = RetrofitHelper.getInstance()
                .getService().study()
                .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        return observable;
    }
    /*
     *获取子栏目信息
     * */
    public static Observable<SubDataBean> subCheck(String number){
        Observable<SubDataBean> observable = RetrofitHelper.getInstance()
                .getService().subData(number)
                .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        return observable;
    }

    /*
    学习强国
     * */
    public static Observable<AppDataBean> appCheck(Map<String,String> map){
        Observable<AppDataBean> observable = RetrofitHelper.getInstance()
                .getService().appData(map)
                .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        return observable;
    }

    /*
     *获取资讯信息
     * */
    public static Observable<NewsBean> newsCheck(String id,String page){
        Observable<NewsBean> observable = RetrofitHelper.getInstance()
                .getService().news(id,page)
                .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        return observable;
    }

    /*
     * 从gank上获得数据
     * */
    public static Observable<GankBean> getObservable(String type, int counts, int pages){
        Observable<GankBean> observable =
                RetrofitHelper.getInstance().getService().getResult(type,counts,pages);
        return observable;
    }

    public static <T> ObservableTransformer<T,T> io_main(){
        return new ObservableTransformer<T, T>() {
            @Override
            public ObservableSource<T> apply(Observable<T> upstream) {
                return  upstream.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            }
        };
    }

}
