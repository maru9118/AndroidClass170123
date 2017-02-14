package com.first.user.aclass.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.first.user.aclass.R;

public class ganji2Activity extends AppCompatActivity implements View.OnClickListener {

    private TextView mResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ganji2);

        mResult = (TextView) findViewById(R.id.result2_text);
        findViewById(R.id.check_button).setOnClickListener(this);
        if (getIntent() != null) {
            String changeResult = getIntent().getStringExtra("띠");
            mResult.setText(changeResult);
        }
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();

        Toast.makeText(this, "확인을 하셨습니다.", Toast.LENGTH_SHORT).show();
        setResult(RESULT_OK, intent);
        finish();
    }
}
