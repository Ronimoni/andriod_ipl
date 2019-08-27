package com.helloroni.livescoreandscheduleofipl2019;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.GridView;

import com.example.livescoreandscheduleofipl2019.R;

public class squad1 extends AppCompatActivity {

    int [] flags={R.drawable.rohit,R.drawable.mustafizur,R.drawable.pandy,R.drawable.polad,R.drawable.kunal,R.drawable.mitchell,
            R.drawable.bumrah,R.drawable.lewis,R.drawable.kishan,R.drawable.bencutting,R.drawable.markande,R.drawable.dumini,
            R.drawable.suryakumar,R.drawable.milne,R.drawable.tare,R.drawable.lad,R.drawable.rahul,R.drawable.ray,R.drawable.sing,
            R.drawable.nidas
    };
    private GridView gridView;
    String [] name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.squad1);
        name = getResources().getStringArray(R.array.b);

        gridView=(GridView) findViewById(R.id.gridviewId1);
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

                Intent p = new Intent(squad1.this,roni.class);
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
