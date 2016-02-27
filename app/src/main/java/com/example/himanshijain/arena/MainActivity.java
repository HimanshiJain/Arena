package com.example.himanshijain.arena;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

ArrayList<String> data;
    IconsRecyclerAdapter iconsRecyclerAdapter;
    RecyclerView recyclerView;
    CollapsingToolbarLayout collapsingToolbarLayout;
    ImageView image;
    TextView textView;
    Palette palette;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data=new ArrayList<>();
        data.add("Athletics");
        data.add("Badminton");
        data.add("Basketball");
        data.add("Chess");
        data.add("Cricket");
        data.add("Football");
        data.add("Table Tennis");
        data.add("Tennis");
//        iconsRecyclerAdapter=new IconsRecyclerAdapter(data,getApplicationContext());

        recyclerView=(RecyclerView)findViewById(R.id.icon_recycler_view);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        iconsRecyclerAdapter=new IconsRecyclerAdapter(data,getApplicationContext());
        recyclerView.setAdapter(iconsRecyclerAdapter);

        textView=(TextView)findViewById(R.id.textview);
        textView.setText("On the special occasion of the completion of 75 glorious years of Delhi Technological University, Arena 2016 is bigger and better than ever with not less than 1500 participants, 200 plus teams and an expected footfall of 9000 attendees. \n" +
                "With sports ranging from Table Tennis to Kabaddi, the DTU Green Run to “Tour de DTU”(a unique cycle race) in the campus, it promises a week of fun, frolic, enthusiasm and thrill for all sports lovers of our university.");
//        image=(ImageView)findViewById(R.id.image);
//        ViewCompat.setTransitionName(findViewById(R.id.app_bar_layout), "ToolbarTransition");

//        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
//        //collapsingToolbarLayout.setTitle("Arena");
//        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(android.R.color.background_dark));
////        Bitmap bitmap = ((BitmapDrawable) image.getDrawable()).getBitmap();
////        Palette.from(bitmap).generate(new Palette.PaletteAsyncListener() {
////
////            public void onGenerated(Palette palette) {
//
//                collapsingToolbarLayout.setContentScrimColor(getResources().getColor(R.color.cardview_dark_background));
//                collapsingToolbarLayout.setStatusBarScrimColor(getResources().getColor(R.color.cardview_shadow_start_color));
//            }
//        });
         toolbar=(Toolbar)findViewById(R.id.toolbar);
        //toolbar.setNavigationIcon();
//        toolbar.setOverflowIcon(R.drawable.logo);
        //toolbar.setLogo(R.drawable.logo);)
        Drawable dr = ContextCompat.getDrawable(getApplicationContext(), R.drawable.logo);;
        Bitmap bitmap = ((BitmapDrawable) dr).getBitmap();
        Drawable d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, 100, 90, true));
        toolbar.setLogo(d);


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
        }

        return super.onOptionsItemSelected(item);
    }
}
