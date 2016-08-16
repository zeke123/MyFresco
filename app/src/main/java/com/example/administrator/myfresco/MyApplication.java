package com.example.administrator.myfresco;

import android.app.Application;
import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by 周建 on 16/8/16.
 */
public class MyApplication extends Application
{
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化Fresco
        Fresco.initialize(this);
    }
}
