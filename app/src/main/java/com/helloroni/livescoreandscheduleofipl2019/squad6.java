package com.helloroni.livescoreandscheduleofipl2019;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.GridView;

import com.example.livescoreandscheduleofipl2019.R;

public class squad6 extends AppCompatActivity {
    int [] flags={R.drawable.shreyasiyer,R.drawable.pant,R.drawable.shikhor,R.drawable.chrismorris,R.drawable.amitmishra,R.drawable.trentbault,R.drawable.shahbaznadeem,
            R.drawable.colinmunro,R.drawable.sandeeplamichhane,R.drawable.liamplunkett,R.drawable.jayantyadav,R.drawable.kagisorabada,R.drawable.gurkeeratsingh,
            R.drawable.sayanghosh,R.drawable.rahultewatia,R.drawable.aveshkhan,R.drawable.harshalpatel,R.drawable.manjotkalra,R.drawable.abhisheksharma,
            R.drawable.prithvishaw
    };
    private GridView gridView;
    String [] name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.squad6);
        name = getResources().getStringArray(R.array.g);

        gridView=(GridView) findViewById(R.id.gridviewId6);
        CustomAdapter adapter=new CustomAdapter(this,name,flags);
        gridView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:

                Intent p = new Intent(squad6.this,roni.class);
                startActivity(p);



                return true;
        }
        switch (item.getItemId()) {
            case R.id.item2:

            {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);}

            return true;


        }
        return super.onOptionsItemSelected(item);
    }
}
