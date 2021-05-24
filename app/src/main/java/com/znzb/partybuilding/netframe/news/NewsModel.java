package com.znzb.partybuilding.netframe.news;


import com.znzb.partybuilding.netframe.bean.NewsBean;
import com.znzb.partybuilding.netframe.net.RetrofitHelper;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

public class NewsModel implements NewsModelInter {
    @Override
    public void news(String id, String page,final Response response) {
        RetrofitHelper.newsCheck(id, page)
                .subscribe(new Observer<NewsBean>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull NewsBean newsBean) {
                        response.success(newsBean);
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
