package com.example.fierbaseb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity4 extends Activity implements AdapterView.OnItemSelectedListener {
    RecyclerView recyclerView;
    ArrayList List;
    Spinner spinner;
    ImageView img;
    TextView back;
    EditText enter;
    Button next;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity4);
        img = findViewById(R.id.img);
        enter = findViewById(R.id.Edit);
        back = findViewById(R.id.txet);
        spinner=findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);
        next = findViewById(R.id.btn);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity2.class));
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity2.class));
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity4.this, "Your mobile number has been confirmed", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), MainActivity11.class));
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public String getMainActivity4() {
        return null;
    }
}
