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
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Abu Khoerul I A
 */
public class ProdukDao implements ProdukImplement {

    Connection koneksi;
    String insert = "insert into produk values(?,?,?);";

    public ProdukDao() {
        koneksi = Mysql.getKoneksi();
    }

    @Override
    public void insertProduk(Produk prd) throws SQLException {
        try ( //To change body of generated methods, choose Tools | Templates.
                PreparedStatement pr = koneksi.prepareStatement(insert)) {
            pr.setString(1, prd.getId());
            pr.setString(2, prd.getNamaProduk());
            pr.setDouble(3, prd.getHargaProduk());
            pr.executeUpdate();
            JOptionPane.showMessageDialog(null, "Simpan Berhasil !");
            pr.close();
        } catch (SQLException x) {
            JOptionPane.showMessageDialog(null, "Simpan Gagal !" + x.getMessage());
        }

    }

    @Override
    public List<Produk> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

//@Override
//public List<Produk> getAll() {
//To change body of generated methods, choose Tools | Templates.
// }

