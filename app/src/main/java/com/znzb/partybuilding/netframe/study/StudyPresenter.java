package com.znzb.partybuilding.netframe.study;


import com.znzb.partybuilding.netframe.base.BasePresenter;
import com.znzb.partybuilding.netframe.bean.AppDataBean;
import com.znzb.partybuilding.netframe.bean.StudyBean;
import com.znzb.partybuilding.netframe.bean.SubDataBean;

import java.util.Map;

public class StudyPresenter extends BasePresenter<StudyViewInterface> {
    private StudyModel model = new StudyModel();

    //获取学习页面
    public void checkStudy(){
        model.study(new StudyModelInter.Response() {
            @Override
            public void success(StudyBean mStudyBean) {
                mView.studyShow(mStudyBean);
            }
        });
    }

    //获取子栏目
    public void checkSubData(String number){
        model.subData(number,new StudyModelInter.SubResponse() {
            @Override
            public void success(SubDataBean mSubDataBean) {
                mView.subShow(mSubDataBean);
            }
        });
    }

    //获取学习强国
    public void checkApp(Map<String,String> map){
      model.appData(map, new StudyModelInter.AppResponse() {
          @Override
          public void success(AppDataBean appResponse) {
              mView.appShow(appResponse);
          }
      });
    }

}
