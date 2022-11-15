/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nadya.penjualan.service.VO;

import com.nadya.penjualan.service.entity.Penjualan;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author win 11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVO {
    private Pelanggan pelanggan;
    private Barang barang;

    public void setPenjualan(Penjualan penjualan) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
