/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9;

/**
 *
 * @author VICTUS
 */
public class Penghitung {
    private int nilai = 0;
    
    // Kata kunci synchronized mengunci method ini
    // Coba hapus kata 'synchronized' nanti untuk melihat perbedaan outputnya (Race Condition)
    public synchronized void tambah() {
        nilai++;
    }
    
    public int getNilai() {
        return nilai;
    }
}
