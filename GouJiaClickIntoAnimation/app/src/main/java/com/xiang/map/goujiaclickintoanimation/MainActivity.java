package com.xiang.map.goujiaclickintoanimation;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ViewPager pager;
    LinearLayout herad;
    LinearLayout foot;
    LinearLayout pagerLiner;
    private List<View> views = new ArrayList<>();
    MyPagerAdapter adapter;
    int a = 1;
    boolean isShow=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pager = (ViewPager) findViewById(R.id.pager);
        herad = (LinearLayout) findViewById(R.id.herad);
        foot = (LinearLayout) findViewById(R.id.foot);
        pagerLiner = (LinearLayout) findViewById(R.id.pagerLiner);
        View view1 = LayoutInflater.from(this).inflate(R.layout.view1, null);
        View view2 = LayoutInflater.from(this).inflate(R.layout.view2, null);

        views.add(view1);
        views.add(view2);
        adapter = new MyPagerAdapter(herad,foot,views,isShow);
        pager.setAdapter(adapter);
        pager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

               herad.setVisibility(View.VISIBLE);
               foot.setVisibility(View.VISIBLE);
                isShow=true;

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

}
