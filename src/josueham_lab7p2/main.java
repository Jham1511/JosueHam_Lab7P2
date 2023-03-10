/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package josueham_lab7p2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author skxka
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DiaCRUDArchivos = new javax.swing.JDialog();
        lb_nombre = new javax.swing.JLabel();
        FieldNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        FieldSize = new javax.swing.JTextField();
        BtnGuardarArchivo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cb_extension = new javax.swing.JComboBox<>();
        BtnRegresar = new javax.swing.JButton();
        PopUpArchivos = new javax.swing.JPopupMenu();
        OpDestacados = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        OpPapelera = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JListArchivos = new javax.swing.JList<>();
        BtnCrear = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        JListCarpetas = new javax.swing.JList<>();
        BtnSalir = new javax.swing.JButton();
        PBPath = new javax.swing.JProgressBar();

        lb_nombre.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        lb_nombre.setText("Nombre del archivo");

        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabel1.setText("Tamaño del archivo");

        BtnGuardarArchivo.setText("Guardar Archivo");
        BtnGuardarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarArchivoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabel2.setText("Seleccione la extension");

        cb_extension.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".pdf", ".mp4", ".docx", ".xls", ".pp" }));

        BtnRegresar.setText("Regresar");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DiaCRUDArchivosLayout = new javax.swing.GroupLayout(DiaCRUDArchivos.getContentPane());
        DiaCRUDArchivos.getContentPane().setLayout(DiaCRUDArchivosLayout);
        DiaCRUDArchivosLayout.setHorizontalGroup(
            DiaCRUDArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DiaCRUDArchivosLayout.createSequentialGroup()
                .addGroup(DiaCRUDArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DiaCRUDArchivosLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(BtnGuardarArchivo)
                        .addGap(29, 29, 29)
                        .addComponent(BtnRegresar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(DiaCRUDArchivosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(DiaCRUDArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FieldNombre)
                            .addComponent(lb_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(FieldSize))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(DiaCRUDArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(DiaCRUDArchivosLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(cb_extension, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(99, 99, 99))
        );
        DiaCRUDArchivosLayout.setVerticalGroup(
            DiaCRUDArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DiaCRUDArchivosLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(DiaCRUDArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nombre)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(DiaCRUDArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cb_extension)
                    .addComponent(FieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(FieldSize, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(DiaCRUDArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardarArchivo)
                    .addComponent(BtnRegresar))
                .addGap(51, 51, 51))
        );

        OpDestacados.setText("Agregar a Destacados");
        OpDestacados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OpDestacadosMouseClicked(evt);
            }
        });
        PopUpArchivos.add(OpDestacados);
        PopUpArchivos.add(jSeparator1);

        OpPapelera.setText("Agregar a Papelera");
        PopUpArchivos.add(OpPapelera);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JListArchivos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Mi Unidad", "Destacados", "Papelera", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        JListArchivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JListArchivosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JListArchivos);

        BtnCrear.setText("Crear Archivo");
        BtnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearActionPerformed(evt);
            }
        });

        JListCarpetas.setModel(new DefaultListModel());
        JListCarpetas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JListCarpetasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(JListCarpetas);

        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PBPath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61)
                .addComponent(BtnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(BtnCrear))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(BtnSalir)
                .addGap(36, 36, 36)
                .addComponent(PBPath, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuardarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarArchivoActionPerformed
        String nomArchivo = FieldNombre.getText();
        String extension = cb_extension.getSelectedItem().toString();
        String codigo = "";
        llenarLink(codigo);
        String link = "dive.google.com/" + codigo;
        String strSize = FieldSize.getText();
        double size = Double.parseDouble(strSize);
        adminArchivos a = new adminArchivos("./archivos.ar");
        Archivo ar = new Archivo(nomArchivo, link, extension, size);
        a.cargarArchivo();
        a.setArchivos(ar);
        a.escribirArchivo();

        FieldNombre.setText("");
        FieldSize.setText("");
        JOptionPane.showMessageDialog(this, "Archivo guardado exitosamente");
    }//GEN-LAST:event_BtnGuardarArchivoActionPerformed

    private void BtnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearActionPerformed
        abrir_CrudArchivos();
    }//GEN-LAST:event_BtnCrearActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        this.setVisible(true);
        DiaCRUDArchivos.setVisible(false);
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        JOptionPane.showMessageDialog(this, "Saliendo del programa...");
        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void JListCarpetasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JListCarpetasMouseClicked

        if (JListCarpetas.getSelectedIndex() >= 0) {
            if (evt.isMetaDown()) {
              PopUpArchivos.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_JListCarpetasMouseClicked

    private void JListArchivosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JListArchivosMouseClicked
        if (JListArchivos.getSelectedIndex() == 0) {
            miUnidad.cargarArchivo();
            JListCarpetas.setModel(llenarListaArch(miUnidad));
        } else if (JListArchivos.getSelectedIndex() == 1){
            destacados.cargarArchivo();
            JListCarpetas.setModel(llenarListaArch(destacados));
        } else if(JListArchivos.getSelectedIndex() == 2){
            papelera.cargarArchivo();
            JListCarpetas.setModel(llenarListaArch(papelera));
        }
    }//GEN-LAST:event_JListArchivosMouseClicked

    private void OpDestacadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpDestacadosMouseClicked
        
    }//GEN-LAST:event_OpDestacadosMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    public String llenarLink(String link) {
        String Mayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Minus = "abcefghijklmnopqrstuvwxyz";
        String nums = "0123456789";
        for (int i = 0; i < 4; i++) {
            if (link.length() < 9) {
                link += Mayus.charAt(aleatorio.nextInt(26));
                link += Minus.charAt(aleatorio.nextInt(26));
                link += nums.charAt(aleatorio.nextInt(10));
            } else {
                link += Mayus.charAt(aleatorio.nextInt(26));
                break;
            }
        }

        return link;
    }

    public String llenarLinkCarpe(String link) {
        String Mayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Minus = "abcefghijklmnopqrstuvwxyz";
        String nums = "0123456789";
        for (int i = 0; i < 2; i++) {
            if (link.length() < 3) {
                link += Mayus.charAt(aleatorio.nextInt(26));
                link += Minus.charAt(aleatorio.nextInt(26));
                link += nums.charAt(aleatorio.nextInt(10));
            } else {
                link += Mayus.charAt(aleatorio.nextInt(26));
                link += Minus.charAt(aleatorio.nextInt(26));
                break;
            }
        }

        return link;
    }

    public void abrir_CrudArchivos() {
        DiaCRUDArchivos.pack();
        DiaCRUDArchivos.setLocationRelativeTo(this);
        DiaCRUDArchivos.setVisible(true);
        this.setVisible(false);
    }

    public DefaultListModel llenarListaArch(adminArchivos a) {
        DefaultListModel modelo = new DefaultListModel<>();
        for (Archivo ar : a.getListaArchivos()) {
            modelo.addElement(ar);
        }
        return modelo;
    }

    adminArchivos miUnidad = new adminArchivos("./archivos.ar");
    adminArchivos destacados = new adminArchivos("./destcados.des");
    adminArchivos papelera = new adminArchivos("./papelera.pap");
    Random aleatorio = new Random();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCrear;
    private javax.swing.JButton BtnGuardarArchivo;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JDialog DiaCRUDArchivos;
    private javax.swing.JTextField FieldNombre;
    private javax.swing.JTextField FieldSize;
    private javax.swing.JList<String> JListArchivos;
    private javax.swing.JList<String> JListCarpetas;
    private javax.swing.JMenuItem OpDestacados;
    private javax.swing.JMenuItem OpPapelera;
    private javax.swing.JProgressBar PBPath;
    private javax.swing.JPopupMenu PopUpArchivos;
    private javax.swing.JComboBox<String> cb_extension;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lb_nombre;
    // End of variables declaration//GEN-END:variables
}
