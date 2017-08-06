/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khoerul.abu.aplikasikasir.dao;

import com.khoerul.abu.aplikasikasir.entity.Produk;
import com.khoerul.abu.aplikasikasir.koneksi.Mysql;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Abu Khoerul I A
 */
public class ProdukDao implements ProdukImplement {

    Connection koneksi;
    String insert = "insert into produk values(?,?,?);";
    String tampil = "select * from produk";

    public ProdukDao() {
        koneksi = Mysql.getKoneksi();
    }

    @Override
    public void insertProduk(Produk prd) throws SQLException {
        try ( //To change body of generated methods, choose Tools | Templates.
                PreparedStatement pr = koneksi.prepareStatement(insert)) {
            pr.setString(1, prd.getId());
            pr.setString(2, prd.getNamaProduk());
            pr.setString(3, prd.getHargaProduk());
            pr.executeUpdate();
            JOptionPane.showMessageDialog(null, "Simpan Berhasil !");
            pr.close();
        } catch (SQLException x) {
            JOptionPane.showMessageDialog(null, "Simpan Gagal !" + x.getMessage());
        }

    }

    @Override
    public List<Produk> getAll() {
         //To change body of generated methods, choose Tools | Templates.
         List<Produk> lp = null;
         try{
             DecimalFormat df = new DecimalFormat("#,###,##0.00");
             lp = new ArrayList<>();
             Statement st = koneksi.createStatement();
             ResultSet rs = st.executeQuery(tampil);
             while(rs.next()){
                 Produk pd = new Produk();
               double Harga = Double.parseDouble(rs.getString(3)+".00");
                 pd.setId(rs.getString(1));
                 pd.setNamaProduk(rs.getString(2));
                 pd.setHargaProduk(String.valueOf(df.format(Harga)));
                 lp.add(pd);
             }
             }catch(SQLException x){
                     JOptionPane.showMessageDialog(null, "Tampil Gagal !" + x.getMessage());
             }  
         return lp;
         }
         
    }



//@Override
//public List<Produk> getAll() {
//To change body of generated methods, choose Tools | Templates.
// }

