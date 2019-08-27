package com.helloroni.livescoreandscheduleofipl2019;


import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonArrayRequest;
import com.example.livescoreandscheduleofipl2019.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class pointtable extends AppCompatActivity {


    TextView show_data;
    String t1 = "";
    String n1 = "";
    String o1 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pointtable);
        if(!isConnected(pointtable.this)) buildDialog(pointtable.this).show();
        else {
            Toast.makeText(pointtable.this,"Welcome", Toast.LENGTH_SHORT).show();
            setContentView(R.layout.livescore);
        }

        show_data = (TextView) findViewById(R.id.t1);

        fetchingData();
    }



    void fetchingData(){


        String myURL = "http://helloroni.com/ipl/appdata/api.php";

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(myURL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {

                for (int i =0; i < response.length(); i++){

                    try {

                        JSONObject jsonObject = (JSONObject) response.get(i);

                        t1 = t1 + jsonObject.getString("run")+"\n\n";
                       n1 = n1+ jsonObject.getString("wicket")+"\n\n";
                        o1 = o1+ jsonObject.getString("over")+"\n\n";




                    } catch (JSONException e) {
                        e.printStackTrace();
                    }


                }

                show_data.setText(t1+n1+o1);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d("Volley Log", error);
            }
        });


        AppController.getInstance().addToRequestQueue(jsonArrayRequest);

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

                Intent p = new Intent(pointtable.this,roni.class);
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
    public boolean isConnected(Context context) {

        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netinfo = cm.getActiveNetworkInfo();

        if (netinfo != null && netinfo.isConnectedOrConnecting()) {
            android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            android.net.NetworkInfo mobile = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

            if((mobile != null && mobile.isConnectedOrConnecting()) || (wifi != null && wifi.isConnectedOrConnecting())) return true;
            else return false;
        } else
            return false;
    }

    public AlertDialog.Builder buildDialog(Context c) {

        AlertDialog.Builder builder = new AlertDialog.Builder(c);
        builder.setTitle("No Internet Connection");
        builder.setMessage("You need to have Mobile Data or wifi to access this. Press ok to Exit");

        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

                finish();
            }
        });

        return builder;
    }



}