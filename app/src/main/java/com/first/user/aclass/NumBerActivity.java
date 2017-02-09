package com.first.user.aclass;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import com.first.user.aclass.Adapter.NumberAdapter;
import com.first.user.aclass.Model.ClassNumber;

import java.util.ArrayList;

public class NumBerActivity extends AppCompatActivity {
    private ListView mNumberList;
    ArrayList<ClassNumber> list;
    NumberAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_num_ber);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mNumberList = (ListView)findViewById(R.id.list_view);
        list = new ArrayList<>();

        for(int i = 0 ; i < 100; i++) {
            ClassNumber classNumber = new ClassNumber();
            classNumber.numberName = "숫자" + i;

            list.add(classNumber);
        }

        mAdapter = new NumberAdapter(this , list);
        mNumberList.setAdapter(mAdapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
            }
        });
    }
}
