package com.demo.android.fna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by kk on 2017/10/18.
 */

public class Activity1 extends Activity {
    private static final String TAG="Activity1";
    private Context context=this;
    private int param=1;
    private Button mbtn;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.i(TAG,"onCreate called.");

        setContentView(R.layout.layout_1);
        mbtn=(Button)findViewById(R.id.btn1);
        setListensers();
    }

    private void setListensers(){
        mbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent();
                intent.setClass(Activity1.this,Activity2.class);
                startActivity(intent);
            }
        });
    }
    //activity被创建，或从后台重新回到前台
    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG,"onStart called.");
    }
    //activity从后台重新回到前台
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i(TAG,"onRestart called.");
    }
    //activity创建或被覆盖、从后台重新回到前台
    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG,"onResume called.");
    }
    //activity被覆盖到下面或手机锁屏
    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG,"onPause called.");
    }
    //activity退出或跳转到新activity
    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG,"onStop called.");
    }
    //结束activity
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG,"onDestroy called.");
    }
    //activity窗口获得或失去焦点时被调用，在onResume或onPause之后
    @Override
    public void onWindowFocusChanged(boolean hasFocus){
        super.onWindowFocusChanged(hasFocus);
        Log.i(TAG,"onWindowFocusChanged called");
    }

    //activity被系统杀死时调用，在onPause之前
    @Override
    protected void onSaveInstanceState(Bundle outState){
        outState.putInt("param",param);
        Log.i(TAG,"onSavedInstanceState called.put param:"+param);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        param=savedInstanceState.getInt("param");
        Log.i(TAG,"onRestoreInstanceState called.get param:"+param);
        super.onRestoreInstanceState(savedInstanceState);
    }

}
