/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khoerul.abu.aplikasikasir.controller;

import com.khoerul.abu.aplikasikasir.dao.ProdukDao;
import com.khoerul.abu.aplikasikasir.dao.ProdukImplement;
import com.khoerul.abu.aplikasikasir.entity.Produk;
import com.khoerul.abu.aplikasikasir.tabelmodel.ProdukTabelModel;
import com.khoerul.abu.aplikasikasir.view.DataProduk;
import com.khoerul.abu.aplikasikasir.view.FormIsiProduk;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.List;

/**
 *
 * @author Abu Khoerul I A
 */
public class ProdukController {
    FormIsiProduk isip;
    DataProduk fdp;
    ProdukImplement pi;
    
    List<Produk> Lp;
    
    
    
    public ProdukController(FormIsiProduk ip){
        this.isip = ip;
        pi = new ProdukDao();
       Lp = pi.getAll();
        
    }
    public ProdukController(DataProduk dp){
        this.fdp = dp;
        pi = new ProdukDao();
        Lp = pi.getAll();
    }
    public void insert() throws SQLException{
        DecimalFormat df = new DecimalFormat("#,###,##0.00");
        Produk produk = new Produk();
        produk.setId(isip.jTextField1.getText());
        produk.setNamaProduk(isip.jTextField2.getText());
        String harga = isip.jtHarga.getText().replace(".", "");
        produk.setHargaProduk(harga);
        pi.insertProduk(produk);
    }
    public void tampilData(){
        Lp = pi.getAll();
        ProdukTabelModel ptm = new ProdukTabelModel(Lp);
        fdp.tabeldataproduk.setModel(ptm);
        
    }
    
}
