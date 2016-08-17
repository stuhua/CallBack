package com.stuhua.callback;

import android.app.Activity;
import android.os.Bundle;

import com.stuhua.callback.util.HttpUtil;

public class MainActivity extends Activity {
    private MyButton btn = new MyButton();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn.setCallBack(new CallBack() {
            @Override
            public void onClick() {
                System.out.println("hahahahaha");
            }
        });
        btn.click();
        /**
         *写个网络成功与否的案例
         * 1. 编写接口 CallBack｛onSucess() onFailure()｝
         * 2. 编写doPost(CallBack callBack) 连接网络方法
         * 3. 成功调用callBack.onSucess(),失败调用...
         * 4. 主类连接网络即调用doPost(),实现接口
         */
 /*       HttpUtil.doGetAsyn("http://www.baidu.com", new HttpUtil.NetCallBack() {
            @Override
            public void onSucess(String result) {

            }

            @Override
            public void onFailure() {

            }
        });*/
    }

}
