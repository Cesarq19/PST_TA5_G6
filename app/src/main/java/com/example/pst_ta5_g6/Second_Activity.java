package com.example.pst_ta5_g6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Second_Activity extends AppCompatActivity {

    EditText txt_user, txt_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }

    public void ingresar(View view) {
        txt_user = (EditText) findViewById(R.id.usuario);
        txt_pass = (EditText) findViewById(R.id.editTextTextPassword2);
        String valid_user= txt_user.getText().toString();
        String valid_pass= txt_pass.getText().toString();
        if (valid_user.equals("TA7G6") && valid_pass.equals("12345"))
        {
            Intent intent = new Intent(getApplicationContext(), Tercera_Activity.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Usuario o password Erronea", Toast.LENGTH_SHORT).show();
        }

    }
}