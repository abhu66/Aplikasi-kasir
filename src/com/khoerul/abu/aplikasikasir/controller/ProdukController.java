/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khoerul.abu.aplikasikasir.controller;

import com.khoerul.abu.aplikasikasir.dao.ProdukDao;
import com.khoerul.abu.aplikasikasir.dao.ProdukImplement;
import com.khoerul.abu.aplikasikasir.entity.Produk;
import com.khoerul.abu.aplikasikasir.view.FormDaftarProduk;
import com.khoerul.abu.aplikasikasir.view.FormIsiProduk;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Abu Khoerul I A
 */
public class ProdukController {
    FormIsiProduk isip;
    FormDaftarProduk fdp;
    ProdukImplement pi;
    
    List<Produk> Lp;
    
    
    
    public ProdukController(FormIsiProduk ip){
        this.isip = ip;
        pi = new ProdukDao();
       Lp = pi.getAll();
        
    }
    public ProdukController(FormDaftarProduk dp){
        this.fdp = dp;
        pi = new ProdukDao();
        Lp = pi.getAll();
    }
    public void insert() throws SQLException{
        Produk produk = new Produk();
        produk.setId(isip.jTextField1.getText());
        produk.setNamaProduk(isip.jTextField2.getText());
        produk.setHargaProduk(Double.parseDouble(isip.jTextField3.getText()));
        pi.insertProduk(produk);
    }
    public void tampilData(){
        
    }
    
}
