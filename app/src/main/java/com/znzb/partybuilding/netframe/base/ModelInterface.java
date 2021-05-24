package com.znzb.partybuilding.netframe.base;


import com.znzb.partybuilding.netframe.bean.GankBean;

public interface ModelInterface extends BaseModelInterface {
    void getData(String type, int counts, int pages, Response response);

    interface Response{
        void success(GankBean response);

    }
}
