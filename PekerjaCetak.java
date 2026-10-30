/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9;

/**
 *
 * @author VICTUS
 */
public class PekerjaCetak extends Thread { 
    private String namaPekerja;
    
    public PekerjaCetak(String namaPekerja) {
        this.namaPekerja = namaPekerja;
    }
    
    //Method run() WAJIB ada, berisi tugas yang akan dikerjakan thread
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(namaPekerja + " sedang mencetak dokumen ke-" + i);
            try {
                // Memberikan jeda 500 milidetik (0.5 detik)
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(namaPekerja + " terinterupsi!");           
            }
        }
        System.out.println("===> " + namaPekerja + " SELESAI.");
    }
}
