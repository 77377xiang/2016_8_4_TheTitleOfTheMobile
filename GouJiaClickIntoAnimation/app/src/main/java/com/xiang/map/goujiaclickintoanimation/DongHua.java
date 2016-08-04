package com.xiang.map.goujiaclickintoanimation;

import android.view.View;
import android.view.animation.TranslateAnimation;

/**
 * Created by Administrator on 2016/8/4.
 */
public class DongHua {
    //尾部下移  消失
    public void ininDouHuaFootDown(final View view) {
        final TranslateAnimation ctrlAnimation =
                new TranslateAnimation(0, 0, 0, 40);
        ctrlAnimation.setDuration(500);     //设置动画的过渡时间
        view.startAnimation(ctrlAnimation);
    }
//尾部上移 显示
    public void ininDouHuaFootUp(final View view) {
        final TranslateAnimation ctrlAnimation =
                new TranslateAnimation(0, 0, 40, 0);
        ctrlAnimation.setDuration(500);     //设置动画的持续时间
        view.startAnimation(ctrlAnimation);
    }
//头部下下移 显示
    public void ininDouHeaheradDown(final View view) {
        final TranslateAnimation ctrlAnimation =
                new TranslateAnimation(0, 0, 0,-40);
        ctrlAnimation.setDuration(500);     //设置动画的过渡时间
        view.startAnimation(ctrlAnimation);
    }
//头部上移 消失
    public void ininDouHuaheradtUp(final View view) {
        final TranslateAnimation ctrlAnimation =
                new TranslateAnimation(0, 0, -40, 0);
        ctrlAnimation.setDuration(500);     //设置动画的持续时间
        view.startAnimation(ctrlAnimation);
    }


    //封装过的动画
    public void ininDongHua(final View view,int time,float fromXDelta, float toXDelta, float fromYDelta, float toYDelta){
        final TranslateAnimation ctrlAnimation = new TranslateAnimation(fromXDelta, toXDelta, fromYDelta, toYDelta);
        ctrlAnimation.setDuration(time);     //设置动画的持续时间
        view.setVisibility(View.GONE);
        view.startAnimation(ctrlAnimation);

    }
}
