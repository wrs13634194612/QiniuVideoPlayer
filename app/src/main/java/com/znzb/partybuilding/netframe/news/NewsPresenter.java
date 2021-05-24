package com.znzb.partybuilding.netframe.news;


import com.znzb.partybuilding.netframe.base.BasePresenter;
import com.znzb.partybuilding.netframe.bean.NewsBean;

public class NewsPresenter extends BasePresenter<NewsViewInterface> {
    private NewsModel model = new NewsModel();

    public void checkNews(String id, String page){
        model.news(id, page, new NewsModelInter.Response() {
            @Override
            public void success(NewsBean mNewsBean) {
                mView.newsShow(mNewsBean);
            }
        });
    }
}
