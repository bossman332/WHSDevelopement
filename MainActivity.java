Contributed by Lukas Hoerpel. 
Code for basic Design. It´s not doing anything, and it´s not finished. IceCreamSandwich supports the design, 
which covers 80% of all devices, and it lookes great! Sourcecode follows, starting in Line 19.
Absolutely important guys! To have a nice logo for our app, replace in the res/... folders with the ic_launcher.png in it,
all pictures with the follwing steps: 
1st: download this image: http://rotarywanganuisouth.org.nz/wp-content/uploads/2011/12/whs.jpg
2nd: open paint, load the picture in it and save it as "ic_launcher" in your directories. It will automatically
become a .png file!
3rd: when you have done this, go into your android studio/eclipse and copy the picture from your directory into all your mipmap 
folders(hdpi,mdpi,xhdpi,xxhdpi) and overwrite the already existing "ic_launcher.png". When you did this correct, you should 
end up with having a really nice app logo on your homescreen!





MainActivity.java(this is the MainActivity Java class, you can copy EVERYTHING)(by the way, the packagename is justforfun!)

package com.appsrox.highschooltroublewithtessacom;

import android.app.ActionBar;
import android.os.PersistableBundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity {

    private ActionBarDrawerToggle actionBarDrawerToggle;
    private DrawerLayout drawerLayout;
    private ListView navList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         drawerLayout = (DrawerLayout)findViewById(R.id.drawerlayout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.opendrawer, R.string.closedrawer);
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        navList =(ListView)findViewById(R.id.navlist);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);


    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
        } else if(id== android.R.id.home){
            if(drawerLayout.isDrawerOpen(navList)) {
                drawerLayout.closeDrawer(navList);
            }else{
                drawerLayout.openDrawer(navList);
            }
        }

        return super.onOptionsItemSelected(item);
    }
}



