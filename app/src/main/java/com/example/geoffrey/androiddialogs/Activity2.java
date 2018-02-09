package com.example.geoffrey.androiddialogs;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import android.widget.TextView;
import android.content.Context;


public class Activity2 extends AppCompatActivity {

    Intent intent;
    String Login;
    String Password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        intent = getIntent();
        Login = intent.getStringExtra("Login");
        Password = intent.getStringExtra("Password");

        TextView text1=(TextView)findViewById(R.id.textView);
        TextView text2=(TextView)findViewById(R.id.textView2);

        if (Password.equals("Password")&& Login.equals("Geoffrey Ferret")){
            text2.setVisibility(TextView.INVISIBLE);

            Context context = getApplicationContext();
            Toast MyToast = new Toast(context);
            MyToast.makeText(context, "You entered the correct password and login", Toast.LENGTH_LONG).show();
        } else {
            text1.setVisibility(TextView.INVISIBLE);

            AlertDialog.Builder DialogConf = new AlertDialog.Builder(this);
            DialogConf.setTitle("Access denied !");
            DialogConf.setMessage("Your login or/and your password is wrong");
            DialogConf.setIcon(R.mipmap.ic_launcher);

            DialogConf.setNeutralButton("Please try again !",
                    new DialogInterface.OnClickListener(){
                        public void onClick(DialogInterface dialog, int id){
                            finish();
                        }
                    });
            AlertDialog MyDialog = DialogConf.create();
            MyDialog.show();
        }

    }
}
