/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9;

/**
 *
 * @author VICTUS
 */
public class TugasDownload implements Runnable {
    private String namaFile;
    
    public TugasDownload(String namaFile) {
        this.namaFile = namaFile;
    }
    
    @Override
    public void run() {
        System.out.println("Mulai mengunduh: " + namaFile);
        try {
            Thread.sleep(2000); // Simulasi waktu untuh 2 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Selesai mengunduh: " + namaFile);
    } 
}
