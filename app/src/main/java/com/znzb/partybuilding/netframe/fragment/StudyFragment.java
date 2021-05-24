package com.znzb.partybuilding.netframe.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mepositry.FirstActivity;
import com.example.mepositry.TwoActivity;
import com.znzb.partybuilding.R;
import com.znzb.partybuilding.netframe.adapter.ILanguageRecycleListener;
import com.znzb.partybuilding.netframe.adapter.LanguageRecycleAdapter;
import com.znzb.partybuilding.netframe.base.BaseFragment;
import com.znzb.partybuilding.netframe.bean.AppDataBean;
import com.znzb.partybuilding.netframe.bean.StudyBean;
import com.znzb.partybuilding.netframe.bean.SubDataBean;
import com.znzb.partybuilding.netframe.study.StudyPresenter;
import com.znzb.partybuilding.netframe.study.StudyViewInterface;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudyFragment extends BaseFragment<StudyPresenter> implements StudyViewInterface, ILanguageRecycleListener {
    private RecyclerView rvLanguage;
    private LanguageRecycleAdapter languageRecycleAdapter;
    private List<StudyBean.DataBean> studyLists;
    private String idString;
    private String nameString;
    private String titleString;


    public static StudyFragment newInstance(String info) {
        Bundle args = new Bundle();
        StudyFragment fragment = new StudyFragment();
        args.putString("info", info);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_study, null);
        rvLanguage = view.findViewById(R.id.rvLanguage);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        presenter.checkStudy();
    }

    @Override
    public StudyPresenter getPresenter() {
        return new StudyPresenter();
    }

    @Override
    public void studyShow(StudyBean mStudyBean) {
        Log.e("TAG", "RegisterActivity_registerShow:" + mStudyBean);
        // studyLists.get(0).getId();  //之前的值的id拿到了吗
        studyLists = new ArrayList<>();
        studyLists.addAll(mStudyBean.getData());
        for (int i = 0; i < studyLists.size(); i++) {
            if (studyLists.get(i).getChildren().size() == 0) {
                if (studyLists.get(i).getId() == 407) {
                    /// https://upload-images.jianshu.io/upload_images/17985516-db12d22bb7334370.png
                    studyLists.get(i).getChildren().add(new StudyBean.DataBean.ChildrenBean("学习强国", "xuexi", "https://img-blog.csdnimg.cn/20210518112359215.png", "default"));
                    studyLists.get(i).getChildren().add(new StudyBean.DataBean.ChildrenBean("党建链接", "default", "https://img-blog.csdnimg.cn/20210518112259263.png", "default"));
                } else if (studyLists.get(i).getId() == 408) {
                    studyLists.get(i).getChildren().add(new StudyBean.DataBean.ChildrenBean("卡片学习", "default", "https://img-blog.csdnimg.cn/20210518112319227.png", "default"));
                    studyLists.get(i).getChildren().add(new StudyBean.DataBean.ChildrenBean("在线测试", "default", "https://img-blog.csdnimg.cn/20210518112238931.png", "default"));
                    studyLists.get(i).getChildren().add(new StudyBean.DataBean.ChildrenBean("微生活", "default", "https://img-blog.csdnimg.cn/20210518112334580.png", "default"));
                    studyLists.get(i).getChildren().add(new StudyBean.DataBean.ChildrenBean("直播间", "default", "https://img-blog.csdnimg.cn/20210518112409774.png", "default"));
                }
            }
        }
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(getActivity());
        rvLanguage.setLayoutManager(layoutManager);
        languageRecycleAdapter = new LanguageRecycleAdapter(getActivity(), studyLists, this);
        rvLanguage.setAdapter(languageRecycleAdapter);
    }

    @Override
    public void subShow(SubDataBean mSubDataBean) {

        // studyLists.get(0).getId();  //之前的值的id拿到了吗
        if (mSubDataBean.getData().size() == 0) {
            //重新请求一次  或者把之前的值拿出来  拿出id  然后  传递过去  请求拿数据就行
            Log.e("TAG", "TextActivity:" + mSubDataBean + "\t" + idString);
            Bundle data = new Bundle();
            data.putString("id", idString);
            Intent gotoAnother = new Intent(getActivity(), TwoActivity.class);
            gotoAnother.putExtras(data);
            startActivity(gotoAnother);
        } else {
            Bundle data = new Bundle();
            data.putSerializable("sublist", (Serializable) mSubDataBean.getData());
            Intent gotoAnother = new Intent(getActivity(), FirstActivity.class);
            gotoAnother.putExtras(data);
            startActivity(gotoAnother);
        }
    }

    @Override
    public void appShow(AppDataBean mSubDataBean) {
        Log.e("TAG", "TextActivity_appShow" + mSubDataBean);

    }

    @Override
    public void itemOnClick(String name, String number, String id) {

        nameString = name;
        titleString = number;


        Log.e("TAG", "TextActivity_itemOnClick" + nameString + "\t" + titleString + "\t " + name + "\t" + number + "\t" + id);

        switch (number) {
            case "xuexi":
                Log.e("TAG", "TextActivity_itemOnClick-学习强国");
                Map<String, String> map = new HashMap<>();
                map.put("actionId", "26");
                map.put("userId", "2963");
                Log.e("TAG",""+map.get("actionId")+"\t"+map.get("userId")+"\t"+map);

                presenter.checkApp(map);
                break;
            case "legal":
                Log.e("TAG", "TextActivity_itemOnClick-法制专栏");
                presenter.checkSubData(number);
                break;
            case "ykr5e1":
                Log.e("TAG", "TextActivity_itemOnClick-党史教育");
                presenter.checkSubData(number);
                idString = id;
                break;
            case "k4g607":
                Log.e("TAG", "TextActivity_itemOnClick-法制教育");
                presenter.checkSubData(number);
                idString = id;
                break;
            case "sfaeoq":
                Log.e("TAG", "TextActivity_itemOnClick-热点专题");
                presenter.checkSubData(number);
                idString = id;
                break;
            case "1eh9og":
                Log.e("TAG", "TextActivity_itemOnClick-抗疫专题");
                presenter.checkSubData(number);
                idString = id;
                break;
            case "o56m2q":
                Log.e("TAG", "TextActivity_itemOnClick-头雁引领");
                presenter.checkSubData(number);
                idString = id;
                break;
            case "idazbw":
                Log.e("TAG", "TextActivity_itemOnClick-启智润心");
                presenter.checkSubData(number);
                idString = id;
                break;
            case "298dq1":
                Log.e("TAG", "TextActivity_itemOnClick-培根铸魂");
                presenter.checkSubData(number);
                idString = id;
                break;
            case "f2a8pu":
                Log.e("TAG", "TextActivity_itemOnClick-品牌集群");
                presenter.checkSubData(number);
                idString = id;
                break;
        }
    }
}
