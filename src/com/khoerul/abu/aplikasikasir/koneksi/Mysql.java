/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khoerul.abu.aplikasikasir.koneksi;

import java.sql.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Abu Khoerul I A
 */
public class Mysql {
    private static Connection kon;
    public static Connection getKoneksi(){
        if(kon == null){
            MysqlDataSource database = new MysqlDataSource();
            database.setDatabaseName("kasirdb");
            database.setUser("kasiruser");
            database.setPassword("kasirpassword");
            try{
                kon = database.getConnection();
                
            }catch(SQLException x){
                JOptionPane.showMessageDialog(null,"Koneksi Gagal !!"+x.getMessage());
            }
        }
        return kon;
            
          
    }
    
    
}
