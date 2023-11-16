/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.pjtcotesquimicos2.telas;

import java.sql.*;
import br.com.pjtcotesquimicos2.bdconexao.Conexao;
import br.com.pjtcotesquimicos2.bdconexao.ClienteData1;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaRegistros extends javax.swing.JInternalFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public TelaRegistros() {
        initComponents();
        conexao = Conexao.conector();
    }

    private void pesquisarRegistros(String profissional) {
        String sql = "SELECT * FROM serviços WHERE profissional LIKE ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, "%" + profissional + "%");
            rs = pst.executeQuery();

            DefaultTableModel model = (DefaultTableModel) tblReg.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                int iDCliente = rs.getInt("idcli");
                String DataServico = rs.getString("data_serviços");
                String Situacao = rs.getString("situacao");
                String Profissional = rs.getString("profissional");
                String Servico = rs.getString("servico");
                String Valor = rs.getString("valor");
                model.addRow(new Object[]{iDCliente, DataServico, Situacao, Profissional, Servico, Valor});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registros por nome: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtRgPesq = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReg = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Registros ");

        txtRgPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRgPesqActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pesquisar.png"))); // NOI18N

        tblReg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "iD Cliente", "Data Serviço", "Situação", "Profissional", "Serviço", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblReg);
        if (tblReg.getColumnModel().getColumnCount() > 0) {
            tblReg.getColumnModel().getColumn(1).setResizable(false);
            tblReg.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(txtRgPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(txtRgPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        setBounds(0, 0, 535, 430);
    }// </editor-fold>//GEN-END:initComponents

    private void txtRgPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRgPesqActionPerformed
    String profissional = txtRgPesq.getText();
    pesquisarRegistros(profissional);
    }//GEN-LAST:event_txtRgPesqActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReg;
    private javax.swing.JTextField txtRgPesq;
    // End of variables declaration//GEN-END:variables


}
