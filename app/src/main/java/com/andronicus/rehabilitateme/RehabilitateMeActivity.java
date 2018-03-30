package com.andronicus.rehabilitateme;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class RehabilitateMeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public static final String NAME = "NAME";
    public static final String AGE = "AGE";
    public static final String ADDICTION = "ADDICTION";

    private RecyclerView mRecyclerView;
    private RehabilitateMeAdapter mAdapter;
    private List<User> mUsers;
    private String name;
    private int age;
    private String addiction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rehabilitate_me);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mUsers = ActivityUtil.getUsersList();

        name = getIntent().getStringExtra(NAME);
        age = getIntent().getIntExtra(AGE,0);
        addiction = getIntent().getStringExtra(ADDICTION);
        if (!name.equals("") && age != 0 && !addiction.equals("")){
            mUsers.add(new User(name,age,addiction));
        }
        mRecyclerView = findViewById(R.id.rec_view_rehabilitate_me);
        mRecyclerView.setAdapter(new RehabilitateMeAdapter(mUsers));
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }
    public static Intent newIntent(@NonNull Context context,String name,int age,String addiction){
        Intent intent = new Intent(context,RehabilitateMeActivity.class);
        intent.putExtra(NAME,name);
        intent.putExtra(AGE,age);
        intent.putExtra(ADDICTION,addiction);
        return intent;
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.rehabilitate_me, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_rehab_info) {
            // Handle the camera action
        } else if (id == R.id.nav_expert_forum) {

        } else if (id == R.id.nav_rehab_center) {

        } else if (id == R.id.nav_invite_a_friend) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
