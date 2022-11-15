/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nadya.penjualan.service.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author win 11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Barang {
    private Long barangId;
    private int harga;
    private int diskon;
    private int total;
   
}
