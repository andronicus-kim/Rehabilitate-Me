package com.andronicus.rehabilitateme;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    private LinearLayout mLinearLayout;
    private EditText mName;
    private EditText mAge;
    private EditText mAddiction;
    public static Intent newIntent(@NonNull Context context){
        return new Intent(context,SignupActivity.class);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        mLinearLayout = findViewById(R.id.ll_activity_sign_up);
        mName = findViewById(R.id.et_name);
        mAge = findViewById(R.id.et_age);
        mAddiction = findViewById(R.id.et_addiction);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_sign_up,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.ic_action_save){
            if (mName.getText().toString().equals("") || mAge.getText().toString().equals("") || mAddiction.getText().toString().equals("")){
                Snackbar.make(mLinearLayout,"Some fields are empty!",Snackbar.LENGTH_LONG).show();
                return false;
            }else {
                Toast.makeText(this, "Saving...", Toast.LENGTH_LONG).show();
                startActivity(RehabilitateMeActivity.newIntent(SignupActivity.this,
                        mName.getText().toString().trim(),
                        Integer.parseInt(mAge.getText().toString().trim()),
                        mAddiction.getText().toString().trim()));
                finish();
            }
        }
        return true;
    }
}
