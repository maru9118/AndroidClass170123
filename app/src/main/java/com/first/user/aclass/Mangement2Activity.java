package com.first.user.aclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Mangement2Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mangement2);

        if (getIntent() != null) {
            String id = getIntent().getStringExtra("id");
            String pass = getIntent().getStringExtra("password");
            Toast.makeText(this, "ID : " + id + "\nPASSWORD : " + pass, Toast.LENGTH_SHORT).show();
        }
    }

    public void onClick(View view) {
        String text = ((Button) view).getText().toString();

        Intent intent = new Intent();
        intent.putExtra("result", text);

        setResult(RESULT_OK, intent);
        finish();
    }
}
