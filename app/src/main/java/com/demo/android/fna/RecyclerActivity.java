package com.demo.android.fna;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Adapter;
import android.widget.TextView;

/**
 * Created by kk on 2017/10/17.
 */

public class RecyclerActivity extends Activity {
    private static final String TAG = "RecyclerActivity";
    private RecyclerView m_RecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview_main);

        m_RecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        m_RecyclerView.setLayoutManager(layoutManager);

        String[] dataset = new String[100];
        for (int i = 0; i < dataset.length; i++) {
            dataset[i] = "item" + i;
        }
//        RecyclerAdapter mAdapter = new RecyclerAdapter(dataset);
//        m_RecyclerView.setAdapter(mAdapter);
    }
}
/*public class RecyclerAdapter extends Adapter<RecyclerAdapter.ViewHolder> {
    private String[] mDataset;

    public RecyclerAdapter(String[] dataset) {
        mDataset = dataset;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView;
        }
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }}*/


