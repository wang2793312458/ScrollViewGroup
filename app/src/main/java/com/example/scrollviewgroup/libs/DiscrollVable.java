package com.example.scrollviewgroup.libs;

/**
 * Created by Administrator on 2016/12/23.
 */

public interface DiscrollVable {

    /*
    *param比discrollve率之间的0和1。
    * */
    public void onDiscrollve(float ratio);
    /*
    * 在这个方法中，你必须按顺序重置视图
    * */
    public void onResetDiscrollve();
}
