package com.example.pst_ta5_g6;

public class libro {

    private String titulo;
    private String autor;
    private String detalles;
    private String editorial;
    private String categoria;
    private int id; //id representa la direccion de la imagen de la memoria

    public libro(String titulo, String autor, String detalles, String editorial, String categoria, int id) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.detalles = detalles;
        this.editorial = editorial;
        this.categoria = categoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
