package com.xiang.map.goujiaclickintoanimation;

import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.List;

/**
 * Created by Administrator on 2016/8/4.
 */
public class MyPagerAdapter extends PagerAdapter {
    boolean isShow;
    private List<View> views;
    LinearLayout herad;
    LinearLayout foot;

    public MyPagerAdapter(LinearLayout herad, LinearLayout foot, List<View> views,boolean isShow) {
        this.foot = foot;
        this.herad = herad;
        this.views = views;
        this.isShow=isShow;
    }

    @Override
    public int getCount() {
        return views.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(views.get(position));
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        container.addView(views.get(position));
        final DongHua dongHua =new DongHua();
        views.get(position).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (isShow){
                           //dongHua.ininDouHeaheradDown(herad);
                            //dongHua.ininDouHuaFootDown(foot);
                            dongHua.ininDongHua(herad,500,0, 0, 0,-40);
                            dongHua.ininDongHua(foot,500,0, 0, 0, 40);
                            herad.setVisibility(View.GONE);
                            foot.setVisibility(View.GONE);
                            isShow=false;
                        }else {

                            dongHua.ininDongHua(herad,500,0, 0, -40, 0);
                           dongHua.ininDongHua(foot,500,0, 0, 40, 0);
                            //dongHua.ininDouHuaheradtUp(herad);
                            //dongHua.ininDouHuaFootUp(foot);
                           herad.setVisibility(View.VISIBLE);
                           foot.setVisibility(View.VISIBLE);
                            isShow=true;
                        }
                    }
                }
        );
        return views.get(position);
    }
}
