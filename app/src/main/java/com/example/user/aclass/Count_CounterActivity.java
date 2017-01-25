package com.example.user.aclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Count_CounterActivity extends AppCompatActivity {

    private Button mA3point;
    private Button mA2point;
    private Button mA1point;

    private Button mB3point;
    private Button mB2point;
    private Button mB1point;

    private TextView mAsocore;
    private TextView mBsocore;

    private int scoreA;
    private int scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count__counter);

        mA3point = (Button) findViewById(R.id.A_3point);
        mA2point = (Button) findViewById(R.id.A_2point);
        mA1point = (Button) findViewById(R.id.A_1point);
        mAsocore = (TextView)  findViewById(R.id.A_score);

        mB3point = (Button) findViewById(R.id.B_3point);
        mB2point = (Button) findViewById(R.id.B_2point);
        mB1point = (Button) findViewById(R.id.B_1point);
        mBsocore = (TextView)  findViewById(R.id.B_score);

        mA3point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
