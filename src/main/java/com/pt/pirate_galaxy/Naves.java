/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.pt.pirate_galaxy;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sergio Cea
 */
public class Naves extends javax.swing.JInternalFrame {

    Connect c ;
    Connection conn;
    
    /**
     * Creates new form Naves
     * @param nave
     * @throws java.sql.SQLException
     */
    public Naves(String sistema) throws SQLException {
        initComponents();
        getNaves(sistema);
    
        
    }
    
    private void getNaves (String sistema) {
        setTitle("Naves " + sistema);
        c = new Connect ();
        conn = c.getConnection();
                  
        try {
            Statement stm = conn.createStatement();
            ResultSet counter = stm.executeQuery("SELECT * FROM `naves` WHERE `sistema` = '"+sistema+"'");

            int count = 0;
            while(counter.next()){count++;}

            String list[][] = new String[count][4];
            int i = 0;
            ResultSet se = stm.executeQuery("SELECT * FROM `naves` WHERE `sistema` = '"+sistema+"'");

            while(se.next()){
                list[i][0] = se.getString("nombre").toUpperCase();
                list[i][1] = se.getString("sistema").toUpperCase();
                list[i][2] = se.getString("tipo").toUpperCase();
                i++;
            }

            jTable1.setModel(new javax.swing.table.DefaultTableModel(
            list,
            new String [] {
                "Nombre", "Sistema", "Tipo"
            }));
        }catch (SQLException e){
            System.out.println("ERROR" + e);
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
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setFocusable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jTable1.setUpdateSelectionOnSort(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleName("Naves");

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
