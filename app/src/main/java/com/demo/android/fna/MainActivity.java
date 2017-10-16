package com.demo.android.fna;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button m_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);                 //加载当前布局
        m_btn = (Button)findViewById(R.id.analyseBtn);         //获取按钮控件

    }
}
