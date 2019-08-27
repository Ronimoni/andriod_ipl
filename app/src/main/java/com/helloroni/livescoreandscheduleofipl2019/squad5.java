package com.helloroni.livescoreandscheduleofipl2019;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.GridView;

import com.example.livescoreandscheduleofipl2019.R;

public class squad5 extends AppCompatActivity {
    int [] flags={R.drawable.manispandy,R.drawable.warner,R.drawable.depokhoda,R.drawable.kanewillimason,R.drawable.tanmay,R.drawable.rosidkhan,
            R.drawable.bipulsharma,R.drawable.mdnobi,R.drawable.khaleel,R.drawable.shakib,R.drawable.basil,R.drawable.alexhales,
            R.drawable.bhuvneshwar,R.drawable.ysufpathan,R.drawable.goswami,R.drawable.carlus,R.drawable.sachin,R.drawable.chrisjordan,
            R.drawable.siddarthkaul,R.drawable.balestan,R.drawable.natrajan,R.drawable.sandeep
    };
    private GridView gridView;
    String [] name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.squad5);
        name = getResources().getStringArray(R.array.f);

        gridView=(GridView) findViewById(R.id.gridviewId5);
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

                Intent p = new Intent(squad5.this,roni.class);
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
