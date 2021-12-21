package com.example.pst_ta5_g6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Tercera_Activity extends AppCompatActivity {
    usuario usuario = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera);
        Bundle usuarioLogin = getIntent().getExtras();
        if(usuarioLogin!=null){
            usuario=(usuario) usuarioLogin.getSerializable("usuario");
        }

    }

    public void MostrarInfoUs(){
        Intent intent = new Intent(getApplicationContext(), Quinta_Activity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("usuario",usuario);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}