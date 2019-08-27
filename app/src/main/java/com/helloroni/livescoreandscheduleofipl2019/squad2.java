package com.helloroni.livescoreandscheduleofipl2019;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.GridView;

import com.example.livescoreandscheduleofipl2019.R;

public class squad2 extends AppCompatActivity {
    int [] flags={R.drawable.dines,R.drawable.lynn,R.drawable.uthapa,R.drawable.sunil,R.drawable.kuldeep,R.drawable.andre,
            R.drawable.nitis,R.drawable.toms,R.drawable.chawhal,R.drawable.javon,R.drawable.parthit,R.drawable.delport,
            R.drawable.rinku,R.drawable.kamlash,R.drawable.mavi,R.drawable.wankhade
    };
    private GridView gridView;
    String [] name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.squad2);
        name = getResources().getStringArray(R.array.c);

        gridView=(GridView) findViewById(R.id.gridviewId2);
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

                Intent p = new Intent(squad2.this,roni.class);
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
