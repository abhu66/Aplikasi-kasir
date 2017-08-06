/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khoerul.abu.aplikasikasir.dao;

import com.khoerul.abu.aplikasikasir.entity.Produk;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Abu Khoerul I A
 */
public interface ProdukImplement{
    public void insertProduk(Produk prd) throws SQLException;
   public List<Produk> getAll();
    
}
