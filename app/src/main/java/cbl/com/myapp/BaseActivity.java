package cbl.com.myapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by BaoLin Chen on 2016/9/14.
 * e-mail 505951628@qq.com
 */
public abstract class BaseActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    //布局文件ID
    protected abstract int getContentViewId();
}
