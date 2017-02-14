package com.first.user.aclass.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.first.user.aclass.R;

public class SignUpExamActivity extends AppCompatActivity implements View.OnClickListener {

    public static final int REQUEST_CODE = 1000;
    private EditText mId;
    private EditText mPassword;
    private EditText mPasswordCheck;
    private EditText mEmail;
    private RadioButton mGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_exam);

        mId = (EditText) findViewById(R.id.id2_edit);
        mPassword = (EditText) findViewById(R.id.password2_edit);
        mPasswordCheck = (EditText) findViewById(R.id.passwordCheck_edit);
        mEmail = (EditText) findViewById(R.id.email_edit);

        findViewById(R.id.join_button).setOnClickListener(this);
        findViewById(R.id.clean_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.join_button:
                if (mId.getText().toString().isEmpty()
                        || mPassword.getText().toString().isEmpty()
                        || mPasswordCheck.getText().toString().isEmpty()
                        || mEmail.getText().toString().isEmpty()) {
                    Toast.makeText(this, "모두 입력하셔야 합니다.", Toast.LENGTH_SHORT).show();
                } else if (!(mPassword.getText().toString()
                        .equals(mPasswordCheck.getText().toString()))
                        ) {
                    Toast.makeText(this, "비밀번호가 다릅니다", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(this, SignUpExam2Activity.class);
                    intent.putExtra("id", mId.getText().toString());
                    intent.putExtra("password", mPassword.getText().toString());
                    intent.putExtra("email", mEmail.getText().toString());
                    startActivityForResult(intent, REQUEST_CODE);
                }
                break;

            case R.id.clean_button:
                mId.setText("");
                mPassword.setText("");
                mPasswordCheck.setText("");
                mEmail.setText("");
                break;
        }
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        Intent intent = new Intent(this, SignUpExam2Activity.class);

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.man_radiobutton:
                intent.putExtra("man", mId.getText().toString());
                startActivityForResult(intent, REQUEST_CODE);
                break;

            case R.id.womon_radiobutton:
                startActivityForResult(intent, REQUEST_CODE);
                break;
        }
    }
}

