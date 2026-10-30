/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9;

/**
 *
 * @author VICTUS
 */
public class MainRunnable {
    public static void main(String[] args) {
        TugasDownload tugas1 = new TugasDownload("Video_PBO.mp4");
        TugasDownload tugas2 = new TugasDownload("Materi_mModul9.pdf");
        
        // Membungkus objek Runnable ke dalam objek Thread
        Thread thread1 = new Thread(tugas1);
        Thread thread2 = new Thread(tugas2);
        
        thread1.start();
        thread2.start();
        
        try {
            // join() memastikan program utama menunggu thread ini selesai sebelum lanjut
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Semua proses unduhan telah selesai.");
    }  
}
