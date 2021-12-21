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
        usuarios listaUsua = new usuarios(usuarios.iniciarUsuarios());
        txt_user = (EditText) findViewById(R.id.usuario);
        txt_pass = (EditText) findViewById(R.id.editTextContraseña);
        String valid_user= txt_user.getText().toString();
        String valid_pass= txt_pass.getText().toString();
        for (usuario u:listaUsua.getUsuarios()) {
            if (valid_user.equals(u.getUsuario()) && valid_pass.equals(u.getPass())) {
                Intent intent = new Intent(getApplicationContext(), Tercera_Activity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("usuario",u);
                intent.putExtras(bundle);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Usuario o password Erronea", Toast.LENGTH_SHORT).show();
            }
        }
    }
}