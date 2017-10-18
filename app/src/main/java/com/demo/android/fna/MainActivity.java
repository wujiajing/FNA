package com.demo.android.fna;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Button m_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);                 //加载当前布局
        m_btn = (Button)findViewById(R.id.analyseBtn);         //获取按钮控件
        m_btn.setOnClickListener(analyseCalc);


     /*   Spinner s1=(Spinner)findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence>adapter = ArrayAdapter.createFromResource(
                this,R.array.fruits,R.layout.fruits_item);
                adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                s1.setAdapter(adapter);
                s1.setOnItemSelectedListener(
                        new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                CharSequence msg="Spinner1:position="+position+"id="+id;
                                Toast.makeText(MainActivity.this,msg,Toast.LENGTH_SHORT).show();
                            }
                            @Override
                            public void onNothingSelected(AdapterView<?> parent) {
                                Toast.makeText(MainActivity.this,"Spinner1:unselected",Toast.LENGTH_SHORT).show();
                            }
                        });*/

    }
    private Button.OnClickListener analyseCalc = new View.OnClickListener()             //按键监听
    {
        @Override
        public void onClick(View v) {
            //Toast.makeText(MainActivity.this,"Hello FNA APP",Toast.LENGTH_SHORT).show();
            //openOptionsDialog();
            Intent intent=new Intent();
           intent.setClass(MainActivity.this,Activity1.class);
            startActivity(intent);
          /*  Intent intent=new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("tel:911"));
            startActivity(intent);*/
        }
    };
    /*public void openOptionsDialog(){
        new AlertDialog.Builder(this).setTitle("关于FNA Dialog").setTitle("FNA App").show();
    }
    public boolean onCreateOptionsMenu(Menu menu)               //创建菜单
    {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item)         // 菜单响应事件
    {
        switch (item.getItemId()){
            case R.id.action_about:
                String content="author:luhaidong;mail:luhaidong88@gmail.com";
                Toast.makeText(MainActivity.this,content,Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_settings:
                Toast.makeText(MainActivity.this,"Action Settings",Toast.LENGTH_SHORT).show();
                break;
        }
        return  super.onOptionsItemSelected(item);
    }

    static boolean flag = false;
    public boolean onPrepareOptionsMenu(Menu menu){
        menu.clear();
        if(flag){
            getMenuInflater().inflate(R.menu.main,menu);
        }else {
            menu.add(0,1,1,"位置");
        }
        flag = !flag;
        return super.onPrepareOptionsMenu(menu);
    }*/
}
