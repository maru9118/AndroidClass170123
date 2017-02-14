package com.first.user.aclass.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.first.user.aclass.R;

public class Count_CounterActivity extends AppCompatActivity {

    private Button mA3point;
    private Button mA2point;
    private Button mA1point;

    private Button mB3point;
    private Button mB2point;
    private Button mB1point;

    private Button mResult;

    private TextView mAsocoreView;
    private TextView mBsocoreView;

    private int scoreA = 0;
    private int scoreB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count__counter);

        mA3point = (Button) findViewById(R.id.A_3point);
        mA2point = (Button) findViewById(R.id.A_2point);
        mA1point = (Button) findViewById(R.id.A_1point);
        mAsocoreView = (TextView) findViewById(R.id.A_score);

        mB3point = (Button) findViewById(R.id.B_3point);
        mB2point = (Button) findViewById(R.id.B_2point);
        mB1point = (Button) findViewById(R.id.B_1point);
        mBsocoreView = (TextView) findViewById(R.id.B_score);

        mResult = (Button) findViewById(R.id.reset);

        mA3point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreA = scoreA + 3;
                addScoreA();
            }
        });

        mA2point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreA = scoreA + 2;
                addScoreA();
            }
        });

        mA1point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreA++;
                addScoreA();
            }
        });

        mB3point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreB = scoreB + 3;
                addScoreB();
            }
        });

        mB2point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreB = scoreB + 2;
                addScoreB();
            }
        });

        mB1point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreB++;
                addScoreB();
            }
        });

        mResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Reset();
            }
        });

    }

    public void addScoreA() {
        mAsocoreView.setText("" + scoreA);
    }

    public void addScoreB() {
        mBsocoreView.setText("" + scoreB);
    }

    public void Reset() {
        scoreA = 0;
        scoreB = 0;
        mAsocoreView.setText("" + 0);
        mBsocoreView.setText("" + 0);
    }
}
