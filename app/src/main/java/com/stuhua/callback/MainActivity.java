package com.stuhua.callback;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {
    private FirstActivity firstActivity = new FirstActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstActivity.setCallBack(new CallBack() {
            @Override
            public void onSolve() {
                System.out.println("hahahahaha");
            }
        });
//        firstActivity.doWork();
    }

}
