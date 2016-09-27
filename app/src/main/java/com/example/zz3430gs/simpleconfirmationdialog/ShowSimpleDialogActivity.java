package com.example.zz3430gs.simpleconfirmationdialog;

import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowSimpleDialogActivity extends AppCompatActivity
        implements SimpleDialogFragment.SimpleDialogFragmentListener {

    private TextView mDialogResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_simple_dialog);

        mDialogResult = (TextView) findViewById(R.id.dialog_result_text);

        Button showDialog = (Button) findViewById(R.id.show_dialog_button);
        showDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SimpleDialogFragment dialog = SimpleDialogFragment.newInstance("Delete everything?");
                dialog.show(getFragmentManager(), "Simple Dialog");

//                AlertDialog.Builder builder = new AlertDialog.Builder(ShowSimpleDialogActivity.this);
//
//                builder.setMessage("Hi, I'm a dialog")
//                        .setTitle("This is the title")
//                        .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which){
//                                userClickedOk();
//                            }
//                        })
//                        .setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialogInterface, int which) {
//                                userClickedCancel();
//                            }
//                        })
//                        .create()
//                        .show();

//                AlertDialog dialog = builder.create();
//
//                dialog.show();
            }
        });

    }
    public void userClickedOK(){
        mDialogResult.setText("You clicked ok");
    }

//    @Override
//    public void userClickedOK() {
//
//    }

    public void userClickedCancel(){
        mDialogResult.setText("You clicked cancel");
    }
}
