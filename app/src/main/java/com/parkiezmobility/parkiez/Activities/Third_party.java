package com.parkiezmobility.parkiez.Activities;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.parkiezmobility.parkiez.Fragments.Parkings;
import com.parkiezmobility.parkiez.MainActivity;
import com.parkiezmobility.parkiez.R;

public class Third_party extends AppCompatActivity {
    private Button parking,ev_Charging_station,society,logout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_party);


       parking = (Button) findViewById(R.id.parking);
        ev_Charging_station = (Button) findViewById(R.id.ev_charging_station);
 //logout=(Button) findViewById(R.id.logout);
        society= (Button) findViewById(R.id.socity);



parking.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);


    }


});


/*logout.setOnClickListener(new View.OnClickListener() {

    @Override
    public void onClick(View v) {
       // System.exit(0);

    }
});*/




    }
    public void onBackPressed() {
//        System.exit(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
        builder.setTitle("Alert");
        builder.setMessage("Do You want to close");
        builder.setCancelable(false);

        builder.setPositiveButton(
                "OK",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });

        builder.setNegativeButton(
                "Cancel",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

        AlertDialog dialog = builder.create();
        builder.show();

    }




    /*public void onBackPressed() {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    } */
    }



