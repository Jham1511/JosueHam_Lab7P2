/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package josueham_lab7p2;

import java.util.ArrayList;

/**
 *
 * @author skxka
 */
public class Carpeta {
   private String nombre, link;
   private ArrayList<Archivo> listaArchivos = new ArrayList<>();
   private ArrayList<Carpeta> listaCarpetas = new ArrayList<>();

    public Carpeta() {
    }

    public Carpeta(String nombre, String link) {
        this.nombre = nombre;
        this.link = link;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public ArrayList<Archivo> getListaArchivos() {
        return listaArchivos;
    }

    public void setListaArchivos(ArrayList<Archivo> listaArchivos) {
        this.listaArchivos = listaArchivos;
    }

    public ArrayList<Carpeta> getListaCarpetas() {
        return listaCarpetas;
    }

    public void setListaCarpetas(ArrayList<Carpeta> listaCarpetas) {
        this.listaCarpetas = listaCarpetas;
    }

    @Override
    public String toString() {
        return  nombre;
    }
   
   
}
