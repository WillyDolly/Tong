package com.popland.pop.tong;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Toast.makeText(Activity2.this,"thanh cong",Toast.LENGTH_LONG).show();// 3 thông số: Activity hiện Toast
    }                                                                        //             nội dung
                                                                             //             thời gian hiển thị
    public void ClickEvent(View view){//đã khai báo android: onClick="ClickEvent" trong xml
        Intent i = new Intent(Activity2.this,MainActivity.class);
        startActivity(i);
        Toast.makeText(this,"success",Toast.LENGTH_SHORT).show();//this chỉ MainActivity
    }

    public void loginOnClick(View view){
        final Dialog dialog = new Dialog(this);
        dialog.setTitle("LOGIN");
        dialog.setContentView(R.layout.login_dialog_layout);
        dialog.show();
        final EditText edt = (EditText)dialog.findViewById(R.id.EDT);
        Button btnSubmit = (Button)dialog.findViewById(R.id.BTNsubmit);
        Button btnCancel = (Button)dialog.findViewById(R.id.BTNcancel);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = edt.getText().toString();
                Toast.makeText(getApplicationContext(),"pass submitted: "+text,Toast.LENGTH_LONG).show();
                dialog.cancel();
            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });
    }
}


