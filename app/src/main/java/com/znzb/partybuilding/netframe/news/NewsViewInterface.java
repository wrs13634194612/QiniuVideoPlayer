package com.znzb.partybuilding.netframe.news;

import com.znzb.partybuilding.netframe.base.BaseViewInterface;
import com.znzb.partybuilding.netframe.bean.NewsBean;

public interface NewsViewInterface extends BaseViewInterface {
    void newsShow(NewsBean mNewsBean);
}
