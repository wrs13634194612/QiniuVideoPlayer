package com.znzb.partybuilding.netframe.study;

import com.znzb.partybuilding.netframe.base.BaseViewInterface;
import com.znzb.partybuilding.netframe.bean.AppDataBean;
import com.znzb.partybuilding.netframe.bean.StudyBean;
import com.znzb.partybuilding.netframe.bean.SubDataBean;

public interface StudyViewInterface extends BaseViewInterface {
    void studyShow(StudyBean mStudyBean);
    void subShow(SubDataBean mSubDataBean);
    void appShow(AppDataBean mSubDataBean);

}
