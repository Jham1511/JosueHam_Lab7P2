/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package josueham_lab7p2;

import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author skxka
 */
public class adminDescarga extends Thread {

    private JProgressBar barra;
    private double segundos;
    private JList lista;
    private JMenuItem item;
    private boolean avanzar, vive;

    public adminDescarga() {
    }

    public adminDescarga(JProgressBar barra, double segundos, JList lista, JMenuItem item) {
        this.barra = barra;
        this.segundos = segundos;
        this.lista = lista;
        this.item = item;
        avanzar = true;
        vive = true;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public double getSegundos() {
        return segundos;
    }

    public void setSegundos(double segundos) {
        this.segundos = segundos;
    }

    public JList getLista() {
        return lista;
    }

    public void setLista(JList lista) {
        this.lista = lista;
    }

    public JMenuItem getItem() {
        return item;
    }

    public void setItem(JMenuItem item) {
        this.item = item;
    }

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                barra.setValue(barra.getValue() + 1);
                if (barra.getValue() == 100000000) {
                    vive = false;
                    barra.setValue(0);
                }
            } //FIN IF

            try {
                String[] tokens = lista.getSelectedValue().toString().split("\\|");
                Archivo arch = new Archivo(tokens[0], tokens[2], tokens[1], Double.parseDouble(tokens[3]));
                segundos = arch.getTamanho() * 10;
                Thread.sleep((int)segundos);
            } catch (InterruptedException ex) {
            }
        }
    }
}
