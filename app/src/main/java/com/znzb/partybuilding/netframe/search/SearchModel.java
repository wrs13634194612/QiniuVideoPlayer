package com.znzb.partybuilding.netframe.search;


import com.znzb.partybuilding.netframe.net.RetrofitHelper;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

public class SearchModel implements SearchModelInter {
    @Override
    public void search(String text, final Response response) {
        RetrofitHelper.search(text)
                .subscribe(new Observer<SearchBean>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull SearchBean searchBean) {
                        response.success(searchBean);
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
