package cbl.com.myapp;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv= (TextView) findViewById(R.id.tv);
        tv.setOnClickListener(v -> tv.setText("sss"));
    }

    @Override
    protected int getContentViewId() {
        return R.layout.activity_main;
    }
}
