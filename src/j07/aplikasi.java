
package j07;
import java.util.Scanner;
public class aplikasi {
    public static void main(String[] args){
       Scanner keyboard = new Scanner(System.in);
       // deklarasi
       int kecepatan;
       
       System.out.println("NAMA: MUHAMMAD HAFID AZIS");
       System.out.println("Kelas: XRPL2");
       System.out.println("Absen: 23");
       
       
       
      // gunakan output
      System.out.println("-^- Pengukuran kecepatan kendaraan JALAN TOL -^-");
      
      System.out.print("Tampilkan kecepatan: ");
      kecepatan = keyboard.nextInt(); 
      
      if (kecepatan <0)
          System.out.println("Input tidak valid");
      else if (kecepatan <60)
          System.out.println("Tambah kecepatan");
      else if (kecepatan <100)
          System.out.println("kecepatan AMAN ");
      else   
          System.out.println("Kurangi kecepatan");  
      
      }
    }
    
