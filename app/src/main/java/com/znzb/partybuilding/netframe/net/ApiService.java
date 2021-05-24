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
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

     @Headers({"urlname:gank"})
    @GET("api/data/{type}/{counts}/{pages}")
     Observable<GankBean> getResult(@Path("type") String type, @Path("counts") int counts, @Path("pages") int pages);

    //登录api
    @Headers({"urlname:wananzhuo"})
    @FormUrlEncoded
    @POST("user/login")
    Observable<LoginBean> login(@Field("username") String username, @Field("password") String password);


    //注册api
    @Headers({"urlname:wananzhuo"})
    @FormUrlEncoded
    @POST("user/register")
    Observable<LoginBean> register(@Field("username") String username, @Field("password") String password, @Field("repassword") String repassword);

    //学习api http://znzb.test/api/node/column2list
    @Headers({"urlname:gank"})
    @GET("node/column2list")
    Observable<StudyBean> study();

    //子栏目api http://znzb.test/api/node/list2/ykr5e1
    @Headers({"urlname:gank"})
    @GET("node/list2/{number}")
    Observable<SubDataBean> subData(@Path("number") String number);

    //资讯api http://znzb.test/api/info/list/387_1
    @Headers({"urlname:gank"})
    @GET("info/list/{id}_{page}")
    Observable<NewsBean> news(@Path("id") String id, @Path("page") String page);

    //学习强国api post http://znzb.test/api/point/add
    @Headers({"urlname:gank"})
    @FormUrlEncoded
    @POST("point/add")
    Observable<AppDataBean> appData(@FieldMap Map<String,String> map);


    //登录日历 api http://znzb.test/api/usersign/daysign?userId=968
    @Headers({"urlname:gank"})
    @GET("usersign/daysign")
    Observable<CalendarBean> calendarLogin(@Query("userId") String userId);

    //登录日历 api http://znzb.test/api/usersign/info?userId=968&month=202105
    @Headers({"urlname:gank"})
    @GET("usersign/info")
    Observable<CalendarBean> smallCalendar(@Query("userId") String userId,@Query("month") String month);

    //登录日历 api http://znzb.test/api/point/rule/intro
    @Headers({"urlname:gank"})
    @GET("point/rule/intro")
    Observable<ScoreBean> score(@Query("userId") String userId);

    //搜索 api http://znzb.test/api/info/list/search?text=%E5%85%9A%E5%8F%B2%E6%95%99%E8%82%B2
    @Headers({"urlname:gank"})
    @GET("info/list/search")
    Observable<SearchBean> search(@Query("text") String text);
}
