package com.first.user.aclass.Activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

import com.first.user.aclass.R;

import java.util.HashMap;

public class GanjiActivity extends AppCompatActivity implements View.OnClickListener {

    public static final int REQUEST_CODE = 1000;
    private EditText mBirth;
    private HashMap<Integer , String> mChangeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ganji);

        mBirth = (EditText) findViewById(R.id.birth_edit);
        findViewById(R.id.change_button).setOnClickListener(this);

        mChangeList = new HashMap<>();

        mChangeList.put(4, "쥐 띠");
        mChangeList.put(5, "소 띠");
        mChangeList.put(6, "호랑이 띠");
        mChangeList.put(7, "토끼 띠");
        mChangeList.put(8, "용 띠");
        mChangeList.put(9, "뱀 띠");
        mChangeList.put(10, "말 띠");
        mChangeList.put(11, "양 띠");
        mChangeList.put(0, "원숭이 띠");
        mChangeList.put(1, "닭 띠");
        mChangeList.put(2, "개 띠");
        mChangeList.put(3, "돼지 띠");
    }

    @Override
    public void onClick(View v) {
        if (mBirth.getText().toString().isEmpty()) {
            Toast.makeText(this, "여러분 어플을 괴롭히지 마세요...", Toast.LENGTH_SHORT).show();
        } else {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(mBirth.getWindowToken(), 0);

            Intent intent = new Intent(this, ganji2Activity.class);
            int a = Integer.parseInt(mBirth.getText().toString());
            intent.putExtra("띠", mChangeList.get(a % 12));

            startActivityForResult(intent, REQUEST_CODE);
        }
    }
}
