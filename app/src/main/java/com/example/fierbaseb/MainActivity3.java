package com.example.fierbaseb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;

public class MainActivity3 extends Activity {
    EditText email;
    EditText password;
    ImageButton imgshowhide1;
    ImageButton img1;
    TextView back;
    ImageView img;
    TextView signup;
    TextView Forgetpassword;
    Button login;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity3);
        email = findViewById(R.id.email);
        password = findViewById(R.id.passward);
        imgshowhide1 = findViewById(R.id.imgshowhide1);
        img1 = findViewById(R.id.img1);
        back = findViewById(R.id.txet);
        img = findViewById(R.id.img);
        signup = findViewById(R.id.txet2);
        Forgetpassword = findViewById(R.id.txet3);
        login = findViewById(R.id.button);
    login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(getApplicationContext(),MainActivity11.class));
        }
    });
    }
}