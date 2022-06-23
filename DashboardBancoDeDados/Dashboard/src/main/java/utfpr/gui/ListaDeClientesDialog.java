/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package utfpr.gui;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import utfpr.banco.ContaBancaria;

/**
 *
 * @author felip
 */
public class ListaDeClientesDialog extends javax.swing.JDialog {
     DefaultListModel modeloListaClientes = new DefaultListModel();

    /**
     * Creates new form ListaDeClientesDialog
     */
    public ListaDeClientesDialog(java.awt.Frame parent, boolean modal, ArrayList<ContaBancaria> contas) {
        super(parent, modal);
        initComponents();
        listaDeClientesFrame.setModel(modeloListaClientes);
        carregarListaClientes(contas);
    }
    
    private void carregarListaClientes(ArrayList<ContaBancaria> contas){
         for(int i = 0; i < contas.size(); i++){
             
         if(!modeloListaClientes.contains(contas.get(i).getTitular())){
         modeloListaClientes.addElement(contas.get(i).getTitular());
         }
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaDeClientesFrame = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(500, 350));
        getContentPane().setLayout(null);

        listaDeClientesFrame.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        listaDeClientesFrame.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        listaDeClientesFrame.setForeground(new java.awt.Color(0, 51, 51));
        listaDeClientesFrame.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaDeClientesFrame);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(36, 58, 424, 236);

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel1.setText("Lista de Clientes:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(36, 28, 160, 18);
        jLabel1.getAccessibleContext().setAccessibleDescription("");

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Users\\Felippe\\Área de Trabalho 2\\poo_trab\\po23s-cch\\src\\main\\java\\utfpr\\gui\\fundoutfpr.png")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 500, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaDeClientesFrame;
    // End of variables declaration//GEN-END:variables
}