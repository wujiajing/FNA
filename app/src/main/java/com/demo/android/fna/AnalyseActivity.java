package com.demo.android.fna;

import android.app.Activity;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import static android.content.ContentValues.TAG;

/**
 * Created by kk on 2017/10/16.
 */


public class AnalyseActivity extends Activity {
    private TextSwitcher mSwitcher;
    private int Counter=0;
    private ListView m_listview;
    private static String[] data=new String[]{"来","不","及","解","释","了","快","上","车","啊","老","司","机","赐","你","谷","粒","多"};
    private ArrayAdapter<String>m_adapter;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.analyse_main);

        mSwitcher=(TextSwitcher)findViewById(R.id.switcher);
        Button cButton=(Button)findViewById(R.id.button);
        mSwitcher.setFactory(mFactory);
        Animation in= AnimationUtils.loadAnimation(this,android.R.anim.fade_in);
        Animation out= AnimationUtils.loadAnimation(this,android.R.anim.fade_out);
        mSwitcher.setInAnimation(in);
        mSwitcher.setInAnimation(out);

        cButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Counter++;
                mSwitcher.setText(String.valueOf(Counter));
            }
        });
                mSwitcher.setCurrentText(String.valueOf(Counter));
        m_listview=(ListView)findViewById(R.id.list_view);
        m_adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        m_listview.setAdapter(m_adapter);
        m_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d(TAG,"onItemClick");
            }
        });


    }

    private ViewSwitcher.ViewFactory mFactory=new ViewSwitcher.ViewFactory() {
        @Override
        public View makeView() {
            TextView t=new TextView(AnalyseActivity.this);
            t.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL);
            t.setTextAppearance(AnalyseActivity.this,android.R.style.TextAppearance_Large);
            return t;
        }
    };
}
