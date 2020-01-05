package com.example.fierbaseb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class MainActivity2 extends Activity {
    EditText email;
    EditText password;
    EditText name;
    Button signup_btn;
    TextView login;
    TextView back;
    ImageView img;
     ProgressBar progressBar;
     FirebaseAuth auth;
    FirebaseFirestore db;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity2);
        auth = FirebaseAuth.getInstance();
        db = FirebaseFirestore.getInstance();
        email = findViewById(R.id.email);
        password = findViewById((R.id.passward));
        name = findViewById(R.id.name);
        login = findViewById(R.id.txet2);
        back = findViewById(R.id.txet);
        img = findViewById(R.id.img);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        signup_btn = findViewById(R.id.buttonsignup);
        signup_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateUser();
            }
        });

    }

    public void CreateUser(){
        auth = FirebaseAuth.getInstance();
        auth.createUserWithEmailAndPassword(email.getText().toString(),password.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    UploadData(task.getResult().getUser().getUid());
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));

                }
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(MainActivity2.this, ""+e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void UploadData(String id){
        db = FirebaseFirestore.getInstance();
        Map<String,Object> user = new HashMap<>();
        user.put("Uid",""+auth.getUid());
        user.put("Email",""+email.getText().toString());
        user.put("Password",""+password.getText().toString());
        user.put("Name",""+name.getText().toString());
        db.collection("User").document(auth.getUid()).set(user).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()){

                }
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(MainActivity2.this, ""+e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}




