/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pjtcotesquimicos2.bdconexao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

/**
 * @author JessicaMontero
 * 
 */
public class ClienteData1 extends Conexao {

    // Método sobrescrito
    public Vector pesquisar(String pesq) throws Exception {
        Vector tb = new Vector();
        String url = "select * from tbclientes where nomecli like '" + pesq + "%'";
        PreparedStatement ps = conector().prepareStatement(url);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Vector n1 = new Vector();
            n1.add(rs.getInt("idcli"));
            n1.add(rs.getString("nomecli"));
            n1.add(rs.getString("endcli"));
            n1.add(rs.getString("fonecli"));
            n1.add(rs.getString("emailcli"));
            tb.add(n1);
        }

        return tb;
    }
}
