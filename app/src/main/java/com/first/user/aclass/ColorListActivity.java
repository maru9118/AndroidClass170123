package com.first.user.aclass;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.first.user.aclass.Adapter.Color_Adapter;
import com.first.user.aclass.Model.ColorData;

import java.util.ArrayList;

public class ColorListActivity extends AppCompatActivity {

    private ListView mListview;
    ArrayList<ColorData> mData;
    Color_Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_list);

        mListview = (ListView) findViewById(R.id.list_view);
        mData = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            ColorData colorData = new ColorData();
            colorData.mDataName = "포지션" + i;

            mData.add(colorData);
        }
        mAdapter = new Color_Adapter(this , mData);
        mListview.setAdapter(mAdapter);
    }
}
