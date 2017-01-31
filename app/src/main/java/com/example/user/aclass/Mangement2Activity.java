package com.example.user.aclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import static android.R.attr.id;
import static android.R.attr.password;

public class Mangement2Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mangement2);

        findViewById(R.id.guest_button).setOnClickListener(this);
        findViewById(R.id.sales_button).setOnClickListener(this);
        findViewById(R.id.product_button).setOnClickListener(this);

        String id = getIntent().getStringExtra("id");
        String pass = getIntent().getStringExtra("password");
        Toast.makeText(this, "ID : " + id + "\nPASSWORD : " + pass, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();

        switch (v.getId()) {
            case R.id.guest_button:
                setResult(RESULT_OK, intent);
                intent.putExtra("guest", "고객관리를 선택하였습니다.");
                finish();

            case R.id.sales_button:
                setResult(RESULT_OK, intent);
                intent.putExtra("sales", "매출관리를 선택하였습니다.");
                finish();

            case R.id.product_button:
                setResult(RESULT_OK, intent);
                intent.putExtra("product", "상품관리를 선택하였습니다.");
                finish();
        }
    }
}
