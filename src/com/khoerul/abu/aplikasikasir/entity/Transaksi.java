/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khoerul.abu.aplikasikasir.entity;

import java.util.Date;

/**
 *
 * @author Abu Khoerul I A
 */
public class Transaksi {
    private int idTr;
    private String idProduk;
    private double hargaProduk;
    private int jumlahProduk;
    private double totalHarga;
    private final Date tanggalTransaksi = new Date();
    
    
}
