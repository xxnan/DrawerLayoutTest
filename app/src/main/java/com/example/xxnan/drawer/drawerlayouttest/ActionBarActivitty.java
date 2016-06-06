package com.example.xxnan.drawer.drawerlayouttest;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2016/6/6.
 */
public class ActionBarActivitty extends Activity {
    private ActionBar actionBar;
    private DrawerLayout drawerLayout;
    ActionBarDrawerToggle mDrawerToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        actionBar=getActionBar();
//        actionBar.setDisplayShowTitleEnabled(false);
        //������ʾlogo
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayUseLogoEnabled(true);
//        actionBar.setLogo(R.drawable.ic_launcher);
        drawerLayout=(DrawerLayout)findViewById(R.id.drawerlayout1);
        View customView = LayoutInflater.from(this).inflate(R.layout.bar_main, new LinearLayout(this), false);
//        View view = LayoutInflater.from(this).inflate(R.layout.bar_main,null);
//        actionBar.setCustomView(customView);
        ImageView image=(ImageView)customView.findViewById(R.id.image);
        customView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.print("");

            }
        });
        mDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };
        mDrawerToggle.syncState();
        drawerLayout.setDrawerListener(mDrawerToggle);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub

        //add top-left icon click event deal
        switch(item.getItemId()){
            case R.id.action_settings:


                if(drawerLayout.isDrawerOpen(Gravity.LEFT))
                {
                    drawerLayout.closeDrawers();
                }else
                    drawerLayout.openDrawer(Gravity.LEFT);


        }

        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
