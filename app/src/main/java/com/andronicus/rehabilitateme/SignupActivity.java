package com.andronicus.rehabilitateme;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    private LinearLayout mLinearLayout;
    public Intent newIntent(@NonNull Context context){
        return new Intent(context,SignupActivity.class);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        mLinearLayout = findViewById(R.id.ll_activity_sign_up);
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
            Snackbar.make(mLinearLayout,"Saved",Snackbar.LENGTH_SHORT).show();
        }
        return true;
    }
}
