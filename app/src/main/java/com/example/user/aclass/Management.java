package com.example.user.aclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Management extends AppCompatActivity implements View.OnClickListener {

    private TextView mId;
    private TextView mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_management);

        mId = (EditText) findViewById(R.id.id_edit);
        mPassword = (EditText) findViewById(R.id.password_edit);
        findViewById(R.id.login_button).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, Mangement2Activity.class);
        intent.putExtra("id", mId.getText().toString());
        intent.putExtra("password", mPassword.getText().toString());

        startActivityForResult(intent, 1000);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        String guest = data.getStringExtra("guest");
        Toast.makeText(this, guest, Toast.LENGTH_SHORT).show();

        String sales = data.getStringExtra("sales");
        Toast.makeText(this, sales, Toast.LENGTH_SHORT).show();

        String product = data.getStringExtra("product");
        Toast.makeText(this, product, Toast.LENGTH_SHORT).show();

    }
}
