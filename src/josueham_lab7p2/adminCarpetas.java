/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package josueham_lab7p2;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author skxka
 */
public class adminCarpetas {
    private ArrayList<Carpeta> listaCarpetas = new ArrayList<>();
    private File archivo = null;
    
    public adminCarpetas(String path){
        archivo = new File(path);
    }

    public adminCarpetas() {
    }

    public ArrayList<Carpeta> getListaCarpetas() {
        return listaCarpetas;
    }

    public void setListaCarpetas(ArrayList<Carpeta> listaCarpetas) {
        this.listaCarpetas = listaCarpetas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public void setCarpetas(Carpeta a){
        listaCarpetas.add(a);
    }
    
}
