package com.evolutiondso.www.dialognofragmentdialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.as400samplecode.R;

public class AndroidAlertDialogActivity extends Activity {

    private static final int ALERT_DIALOG1 = 1;
    private static final int ALERT_DIALOG2 = 2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button alert1 = (Button) findViewById(R.id.alert1);
        alert1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                showDialog(ALERT_DIALOG1);
            }
        });

        Button alert2 = (Button) findViewById(R.id.alert2);
        alert2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                showDialog(ALERT_DIALOG2);
            }
        });
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        Dialog dialog;
        AlertDialog.Builder builder;
        switch(id) {
            case ALERT_DIALOG1:
                builder = new AlertDialog.Builder(this);
                builder.setMessage("Ejemplo de dialogo Simple")
                        .setCancelable(false)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                //Do something here
                            }
                        });
                dialog = builder.create();
                break;
            case ALERT_DIALOG2:
                builder = new AlertDialog.Builder(this);
                builder.setMessage("Dialogo con opciones")
                        .setCancelable(false)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                //Do something here
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                //Do something here
                            }
                        });

                dialog = builder.create();
                break;
            default:
                dialog = null;
        }
        return dialog;

    }
}