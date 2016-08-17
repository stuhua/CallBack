package com.stuhua.callback;

/**
 * Created by llh on 2016/8/17.
 */
public class FirstActivity {
    private CallBack callBack;

    public void setCallBack(CallBack callBack) {
        this.callBack = callBack;
    }

    public void doWork() {
        callBack.onSolve();
    }
}
