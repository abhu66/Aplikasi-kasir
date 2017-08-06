/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khoerul.abu.aplikasikasir.tabelmodel;

import com.khoerul.abu.aplikasikasir.entity.Produk;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Abu Khoerul I A
 */
public class ProdukTabelModel extends AbstractTableModel{
    List<Produk> listProduk; 
    
    
    public ProdukTabelModel(List<Produk> listp){
        this.listProduk = listp;
    }

    @Override
    public int getRowCount() {
         //To change body of generated methods, choose Tools | Templates.
        return listProduk.size();
    }

    @Override
    public int getColumnCount() {
        return 3; //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String getColumnName(int kolom){
        switch(kolom){
            case 0 : return "KODE PRODUK";
            case 1 : return "NAMA PRODUK";
            case 2 : return "HARGA";
            
            default : return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         //To change body of generated methods, choose Tools | Templates.
          switch(columnIndex){
            case 0 : return listProduk.get(rowIndex).getId();
            case 1 : return listProduk.get(rowIndex).getNamaProduk();
            case 2 : return listProduk.get(rowIndex).getHargaProduk();
            default: return null;
    }
    
}
}
