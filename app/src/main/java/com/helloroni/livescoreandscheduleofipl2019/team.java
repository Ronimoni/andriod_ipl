package com.helloroni.livescoreandscheduleofipl2019;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.livescoreandscheduleofipl2019.R;

public class team extends AppCompatActivity {
    Button button2 ,button3,button4,button5,button6,button7,button8,button9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.team);
        button2 = (Button) findViewById(R.id.button4);
        button2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent k = new Intent(team.this, Squad.class);
                startActivity(k);
            }
        });
        button3 = (Button) findViewById(R.id.button5);
        button3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent l = new Intent(team.this,squad1.class);
                startActivity(l);
            }
        });
        button4 = (Button) findViewById(R.id.button6);
        button4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent m = new Intent(team.this,squad2.class);
                startActivity(m);
            }
        });
        button5 = (Button) findViewById(R.id.button7);
        button5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent n = new Intent(team.this,squad3.class);
                startActivity(n);
            }
        });
        button6 = (Button) findViewById(R.id.button8);
        button6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent o = new Intent(team.this,squad4.class);
                startActivity(o);
            }
        });
        button7 = (Button) findViewById(R.id.button9);
        button7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent p = new Intent(team.this,squad5.class);
                startActivity(p);
            }
        });
        button8 = (Button) findViewById(R.id.button10);
        button8.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent q = new Intent(team.this,squad6.class);
                startActivity(q);
            }
        });
        button9 = (Button) findViewById(R.id.button11);
        button9.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent r = new Intent(team.this,squad7.class);
                startActivity(r);
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

                Intent p = new Intent(team.this,roni.class);
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
