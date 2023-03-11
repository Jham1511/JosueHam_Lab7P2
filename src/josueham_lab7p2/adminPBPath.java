/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package josueham_lab7p2;

import java.awt.Color;
import javax.swing.JList;
import javax.swing.JProgressBar;
/**
 *
 * @author skxka
 */
public class adminPBPath extends Thread{
    private String link;
    private JList lista;
    private JProgressBar barra;

    public adminPBPath() {
        super();
    }

    public adminPBPath(JList lista, JProgressBar barra) {
        this.lista = lista;
        this.barra = barra;
    }

    public adminPBPath(String link, JList lista, JProgressBar barra) {
        this.link = link;
        this.lista = lista;
        this.barra = barra;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public adminPBPath(String link, JList lista) {
        this.link = link;
        this.lista = lista;
    }

    public JList getLista() {
        return lista;
    }

    public void setLista(JList lista) {
        this.lista = lista;
    }

    public adminPBPath(String link) {
        this.link = link;
    }
    
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    
    @Override
    public void run(){
        if (lista.getSelectedValue()!= barra.getString()) {
            barra.setString((String)lista.getSelectedValue());
        }
    }
}
