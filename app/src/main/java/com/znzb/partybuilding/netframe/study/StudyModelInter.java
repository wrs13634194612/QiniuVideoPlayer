package com.znzb.partybuilding.netframe.study;


import com.znzb.partybuilding.netframe.bean.AppDataBean;
import com.znzb.partybuilding.netframe.bean.StudyBean;
import com.znzb.partybuilding.netframe.bean.SubDataBean;

import java.util.Map;

public interface StudyModelInter {
    void study(Response response);
    void subData(String number,SubResponse response);
    void appData(Map<String,String> map, AppResponse response);


    interface Response{
        void success(StudyBean mStudyBean);
    }


    interface SubResponse{
        void success(SubDataBean mSubDataBean);
    }

    interface AppResponse{
        void success(AppDataBean appResponse);
    }

}
