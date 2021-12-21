package com.example.pst_ta5_g6;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class libros extends Activity {
    private List<libro> miLibro = new ArrayList<libro>();

    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_tercera);

        Libros();
        LibrosView();
    }

    private void Libros() {
        miLibro.add(new libro("Dune", "Frank Herbert", "Erase una vez blanlaka", "Chilton Company", "Ciencia Ficcion", R.drawable.dune));
        miLibro.add(new libro("Lord of the rings", "JJ Tolkien", "Erase una vez en la tierra media", "Chilton Company", "Fantasia", R.drawable.el_señor_de_los_anillos));
        miLibro.add(new libro("Harry Potter", "JK Rowling", "En un pais lleno de magia", "Chilton Company", "Fantasia", R.drawable.harry_potter));
        miLibro.add(new libro("Hunger Games", "Suzanne Collins", "bajajsjsajs", "Chilton Company", "Accion", R.drawable.los_juegos_del_hambre));


    }

    private void LibrosView() {
        ArrayAdapter<libro> adapter = new MyListAdapter();
        ListView list = (ListView) findViewById(R.id.listview);
        list.setAdapter(adapter);

    }

    private class MyListAdapter extends ArrayAdapter<libro> {
        public MyListAdapter(){
            super(libros.this, R.layout.item_view, miLibro);
        }

        publi



            /**Libro CurrentLibro = miLibro.get(position):

            ImageView imageView = (ImageView) itemView.findViewById(R.id.imageItem_icon);
            imageView.setImageResource(CurrentLibro.getLibro());

            TextView TituloText = (TextView) itemView.findViewById(R.id.Item_textTitulo);
            TituloText.setText(CurrentLibro.getTitulo());

            TextView AutorText = (TextView) itemView.findViewById(R.id.Item_textAutor);
            AutorText.setText(CurrentLibro.getAutor());

            TextView EditorialText = (TextView) itemView.findViewById(R.id.Item_textEditorial);
            EditorialText.setText(CurrentLibro.getEditorial());


            return itemView;
             **/
    }

}






