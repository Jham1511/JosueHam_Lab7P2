/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package josueham_lab7p2;

import java.io.Serializable;

/**
 *
 * @author skxka
 */
public class Archivo implements Serializable {

    private String nombre, link, extension;
    private double tamanho;

    public Archivo() {
    }

    public Archivo(String nombre, String link, String extension, double tamanho) {
        this.nombre = nombre;
        this.link = link;
        this.extension = extension;
        this.tamanho = tamanho;
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

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return nombre + "|" + extension + "|" + link + "|" + tamanho;
    }

}
