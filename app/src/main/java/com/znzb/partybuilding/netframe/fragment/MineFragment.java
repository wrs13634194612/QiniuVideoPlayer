package com.znzb.partybuilding.netframe.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.mepositry.CalendarLoginActivity;
import com.znzb.partybuilding.netframe.video.PLVideoViewActivity;
import com.example.mepositry.SearchActivity;
import com.pili.pldroid.player.AVOptions;
import com.znzb.partybuilding.R;

public class MineFragment extends Fragment {


    private static final String DEFAULT_TEST_URL = "http://znzb-cdn.gzgftong.cn/video_android_3087_1621678199704.mp4";
   //   private static final String DEFAULT_TEST_URL = "http://demo-videos.qnsdk.com/movies/qiniu.mp4";



    public static MineFragment newInstance(String info) {
        Bundle args = new Bundle();
        MineFragment fragment = new MineFragment();
        args.putString("info", info);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mine, null);
        Button btn_mine = view.findViewById(R.id.btn_mine);
        Button btn_search = view.findViewById(R.id.btn_search);
        Button btn_play = view.findViewById(R.id.btn_play);


        btn_mine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoAnother = new Intent(getActivity(), CalendarLoginActivity.class);
                startActivity(gotoAnother);
            }
        });

        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoAnother = new Intent(getActivity(), SearchActivity.class);
                startActivity(gotoAnother);
            }
        });


        btn_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jumpToPlayerActivity("标题文档",DEFAULT_TEST_URL, false);

            }
        });

        return view;
    }

    public void jumpToPlayerActivity(String title, String videoPath, boolean isList) {
        Intent intent = new Intent(getActivity(), PLVideoViewActivity.class);
        intent.putExtra("videoPath", videoPath);
        intent.putExtra("title", title);
        intent.putExtra("mediaCodec", AVOptions.MEDIA_CODEC_SW_DECODE);
        intent.putExtra("liveStreaming", 1);
        intent.putExtra("isVideo", true);
        startActivity(intent);
    }
}
