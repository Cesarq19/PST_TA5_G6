package com.example.pst_ta5_g6;

import java.io.Serializable;
import java.util.ArrayList;

public class usuarios implements Serializable {
    private ArrayList<usuario> usuarios;

    public usuarios(ArrayList<usuario> usuarios){
        this.usuarios=usuarios;
    }

    public static ArrayList<usuario> iniciarUsuarios() {
        usuario u1 = new usuario("adrisiav","123","Adrian","Siavichay","adrian2x2001@gmail.com","0960067279","terror");
        usuario u2 = new usuario("TA7G6","12345","TA7","Grupal","pst@espol.edu.ec","0983828381","aventura");
        ArrayList<usuario> usuarios = new ArrayList<>();
        usuarios.add(u1);
        usuarios.add(u2);
        return usuarios;
    }

    public ArrayList<usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
