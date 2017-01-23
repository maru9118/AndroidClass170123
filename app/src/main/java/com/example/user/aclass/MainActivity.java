package com.example.user.aclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.btn);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "현석이형 왜 안해요?", Toast.LENGTH_SHORT).show();
    }
}
