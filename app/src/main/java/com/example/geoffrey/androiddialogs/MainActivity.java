package com.example.geoffrey.androiddialogs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button Ok;
    String Login;
    String Password;
    Intent intent;
    EditText LoginText;
    EditText PasswordText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Ok =(Button)findViewById(R.id.button);
        PasswordText = (EditText) findViewById(R.id.editText);
        LoginText = (EditText) findViewById(R.id.editText2);

        Ok.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                intent = new Intent(MainActivity.this, Activity2.class);
                Login= LoginText.getText().toString();
                Password=PasswordText.getText().toString();

                intent.putExtra( "Login", Login);
                intent.putExtra("Password", Password);
                startActivity(intent);

            }
        });



    }
}
