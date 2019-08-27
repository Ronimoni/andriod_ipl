package com.helloroni.livescoreandscheduleofipl2019;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.livescoreandscheduleofipl2019.R;

public class Squad extends AppCompatActivity {
    int [] flags={R.drawable.doni,R.drawable.brabo,R.drawable.raina,R.drawable.watson,R.drawable.jadeja,R.drawable.sam
            ,R.drawable.raydu,R.drawable.david,R.drawable.depok,R.drawable.du,R.drawable.vijoy,R.drawable.imrantaher,
            R.drawable.asef,R.drawable.ngidi,R.drawable.thakur,R.drawable.santner,R.drawable.jadhav,R.drawable.shorey,
            R.drawable.harbajan,R.drawable.karn
    };
    private GridView gridView;
    String [] name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.squad);
        name = getResources().getStringArray(R.array.a);

        gridView = (GridView) findViewById(R.id.gridviewId);
        CustomAdapter adapter = new CustomAdapter(this, name, flags);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent a = new Intent(Squad.this, msdoni.class);
                    startActivity(a);
                }

                if (position == 1) {
                    Intent b = new Intent(Squad.this, bravo.class);
                    startActivity(b);
                }
                if (position == 2) {
                    Intent z = new Intent(Squad.this,raina.class);
                    startActivity(z);
                }
                if (position == 3) {
                    Intent c = new Intent(Squad.this,watson.class);
                    startActivity(c);
                }
                if (position == 4) {
                    Intent d = new Intent(Squad.this,jadeja.class);
                    startActivity(d);
                }
                if (position == 5) {
                    Intent e = new Intent(Squad.this,billings.class);
                    startActivity(e);
                }
                if (position == 6) {
                    Intent f = new Intent(Squad.this,raidu.class);
                    startActivity(f);
                }
                if (position == 7) {
                    Intent g = new Intent(Squad.this,david.class);
                    startActivity(g);
                }
                if (position == 8) {
                    Intent h = new Intent(Squad.this,chahar.class);
                    startActivity(h);
                }
                if (position == 9) {
                    Intent i = new Intent(Squad.this,plesis.class);
                    startActivity(i);
                }
                if (position == 10) {
                    Intent j = new Intent(Squad.this,murali.class);
                    startActivity(j);
                }
                if (position == 11) {
                    Intent k = new Intent(Squad.this,tahir.class);
                    startActivity(k);
                }
                if (position == 12) {
                    Intent l = new Intent(Squad.this,kmasif.class);
                    startActivity(l);
                }
                if (position == 13) {
                    Intent m = new Intent(Squad.this,ngidi.class);
                    startActivity(m);
                }
                if (position == 14) {
                    Intent n = new Intent(Squad.this,shardul.class);
                    startActivity(n);
                }
                if (position == 15) {
                    Intent o = new Intent(Squad.this,santner.class);
                    startActivity(o);
                }
                if (position == 16) {
                    Intent p = new Intent(Squad.this,kader.class);
                    startActivity(p);
                }
                if (position == 17) {
                    Intent q = new Intent(Squad.this,shorey.class);
                    startActivity(q);
                }
                if (position == 18) {
                    Intent r = new Intent(Squad.this,harbajan.class);
                    startActivity(r);
                }
                if (position == 19) {
                    Intent s = new Intent(Squad.this,karnsharma.class);
                    startActivity(s);
                }
                if (position == 20) {
                    Intent t = new Intent(Squad.this, msdoni.class);
                    startActivity(t);
                }


            }

        });
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

                Intent p = new Intent(Squad.this,roni.class);
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