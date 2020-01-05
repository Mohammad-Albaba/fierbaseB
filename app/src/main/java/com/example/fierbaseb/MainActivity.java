package com.example.fierbaseb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity  extends Activity  {
     EditText email;
    EditText password;
      Button login_btn;
    TextView signup;
    ImageView img2;
    ImageView img1;
    TextView forget;
    ImageView imgback;
    TextView txetback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email);
        password = findViewById(R.id.passward);
        signup=findViewById(R.id.txet2);
         img2=findViewById(R.id.imgshowhide1);
         img1=findViewById(R.id.img1);
        login_btn = findViewById(R.id.button);
        forget=findViewById(R.id.txet3);
        imgback=findViewById(R.id.imgback);
        txetback=findViewById(R.id.txetback);
        txetback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity6.class));
            }
        });
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity6.class));
                    }

                });




                signup.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(), MainActivity2.class));
                    }
                });
                img2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {

                        Toast.makeText(MainActivity.this,
                                "ImageButton is clicked!", Toast.LENGTH_SHORT).show();

                    }
                });
                password.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    @Override
                    public void onFocusChange(View v, boolean hasFocus) {
                        if (!hasFocus) {

                            if (password.getText().toString().length() < 6) {
                                password.setError("Password should be greater than 6 characters!");

                            } else {
                                //validation is true, so what to put here?
                            }
                        }
                    }
                });


                forget.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(), MainActivity5.class));
                    }
                });





}

}

