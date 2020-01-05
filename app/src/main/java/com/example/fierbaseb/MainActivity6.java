package com.example.fierbaseb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity6 extends Activity {
    Button btn1;
    Button btn2;
    FirebaseAuth mAuth;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity6);
        mAuth = FirebaseAuth.getInstance();

        IsLogin();
        btn1=findViewById(R.id.button1);
        btn2=findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity2.class));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });
    }
    public void IsLogin(){
        mAuth = FirebaseAuth.getInstance();
        if (mAuth.getCurrentUser()!= null){
            startActivity(new Intent(getApplicationContext(),MainActivity11.class));
        }
        if(mAuth.getCurrentUser() == null) {
            startActivity(new Intent(getApplicationContext(),MainActivity6.class));
        }

    }

}
