package com.example.newmate1102.broadcastbestpractice;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by newmate1102 on 2016/1/13.
 */
public class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
