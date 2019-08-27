package com.helloroni.livescoreandscheduleofipl2019;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.GridView;

import com.example.livescoreandscheduleofipl2019.R;

public class squad3 extends AppCompatActivity {

    int [] flags={R.drawable.virat,R.drawable.abd,R.drawable.chahal,R.drawable.moeenali,R.drawable.patel,R.drawable.southee,
            R.drawable.siraj,R.drawable.shimron,R.drawable.padikal,R.drawable.stoinis,R.drawable.umesh,R.drawable.grandhomme,
            R.drawable.washington,R.drawable.klaseen,R.drawable.shivam,R.drawable.nathan,R.drawable.navdeep,R.drawable.gurkeerat,
            R.drawable.kulwant,R.drawable.pawan
    };
    private GridView gridView;
    String [] name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.squad3);
        name = getResources().getStringArray(R.array.d);

        gridView=(GridView) findViewById(R.id.gridviewId3);
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

                Intent p = new Intent(squad3.this,roni.class);
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
