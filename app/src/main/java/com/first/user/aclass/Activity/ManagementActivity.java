package com.first.user.aclass.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.first.user.aclass.R;

public class ManagementActivity extends AppCompatActivity implements View.OnClickListener {

    public static final int REQUEST_CODE = 1000;
    private EditText mId;
    private EditText mPassword;

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

        startActivityForResult(intent, REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQUEST_CODE
                && resultCode == RESULT_OK
                && data != null) {
            String text = data.getStringExtra("result");

            Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
        }
    }
}
