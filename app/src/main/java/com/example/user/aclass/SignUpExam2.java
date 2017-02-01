package com.example.user.aclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SignUpExam2 extends AppCompatActivity implements View.OnClickListener {

    private TextView mId;
    private TextView mPassword;
    private TextView mEmail;
    private TextView mGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_exam2);

        mId = (TextView) findViewById(R.id.id_text);
        mPassword = (TextView) findViewById(R.id.password_text);
        mEmail = (TextView) findViewById(R.id.email_text);
        mGender = (TextView) findViewById(R.id.gender_text);

        if (getIntent() != null) {
            String id = getIntent().getStringExtra("id");
            String passWord = getIntent().getStringExtra("password");
            String email = getIntent().getStringExtra("email");
            String gender = getIntent().getStringExtra("gender");

            mId.setText("아이디 : " + id);
            mPassword.setText("비밀번호 : " + passWord);
            mEmail.setText("이메일 : " + email);
        }
    }

    @Override
    public void onClick(View view) {
        String text = ((Button) view).getText().toString();

        Intent intent = new Intent();
        intent.putExtra("result", text);
        Toast.makeText(this, "확인버튼을 누르셨습니다", Toast.LENGTH_SHORT).show();
        setResult(RESULT_OK);
        finish();
    }
}
