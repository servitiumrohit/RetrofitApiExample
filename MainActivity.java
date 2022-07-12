package com.first.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.exit).setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                AlertDialog.Builder alertDialog =new AlertDialog.Builder(MainActivity.this);// always use only current acttivity.this context;
                       alertDialog .setIcon(R.drawable.ic_baseline_warning_24);
                        alertDialog.setTitle("Exit");
                        alertDialog.setMessage("are you sure you want to exit this app");
                        alertDialog.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();

                            }
                        });
                       alertDialog .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        });
                       alertDialog.show();
            }
        });

            

    }


}
