package com.znzb.partybuilding.netframe.net;

import android.util.Log;


import com.znzb.partybuilding.netframe.base.BaseUrlInterceptor;
import com.znzb.partybuilding.netframe.base.MyApplication;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;

public class OkHttpManager {
    public static final  int CONNECT_TIME = 8;

    public static OkHttpClient getOkHttp(){
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        if(BuildConfig.DEBUG){
            HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(
                    new HttpLoggingInterceptor.Logger() {
                        @Override
                        public void log(String message) {
                            Log.e("TGA","OkHttpManager_log:"+message);
                        }
                    });
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            builder.addInterceptor(loggingInterceptor);
        }
        //网络缓存
        File cacheFile = new File(MyApplication.getMyApp().getCacheDir(),"mateCache");
        Cache cache = new Cache(cacheFile, 1024 * 1024 * 10);
        builder.addInterceptor(new BaseUrlInterceptor())
                .cache(cache)
                .connectTimeout(CONNECT_TIME, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true);
        return builder.build();
    }

    //应用层拦截器(无网络时调用缓存)
    public static Interceptor appCacheInterceptor = new Interceptor(){

        @Override
        public Response intercept(Chain chain) throws IOException {
            Log.e("TAG","OkHttpManager_Method  intercept");
            Request request = chain.request();
            request = request.newBuilder().cacheControl(CacheControl.FORCE_NETWORK).build();
            if (!NetStateUtil.isNetworkConnected(MyApplication.getMyApp()))
            {
                //强制使用缓存
                Log.e("TAG","OkHttpManager_FORCE_CACHE");
                request = request.newBuilder()
                        .cacheControl(CacheControl.FORCE_CACHE)
                        .build();
            }
            Response response = chain.proceed(request);
            return response;
        }
    };
}
