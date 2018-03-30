package com.andronicus.rehabilitateme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;

public class SigninActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        SpannableString string = new SpannableString("Forgot Password?");
        string.setSpan(new UnderlineSpan(),0,string.length(),0);

        TextView textView = findViewById(R.id.tv_forgot_password);
        textView.setText(string);
        findViewById(R.id.btn_sign_in).setOnClickListener(v ->
                startActivity(RehabilitateMeActivity.newIntent(SigninActivity.this)));
        findViewById(R.id.btn_sign_up).setOnClickListener(v ->
                startActivity(SignupActivity.newIntent(SigninActivity.this)));
    }
}
