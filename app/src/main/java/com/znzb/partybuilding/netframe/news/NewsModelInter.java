package com.znzb.partybuilding.netframe.news;


import com.znzb.partybuilding.netframe.bean.NewsBean;

public interface NewsModelInter {
    void news(String id, String page, Response response);

    interface Response{
        void success(NewsBean mNewsBean);
    }
}
