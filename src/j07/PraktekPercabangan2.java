
package j07;
import java.util.Scanner;
public class PraktekPercabangan2 {
    public static void main(String[] args){
            
    String identitas = "Muhammad Hafid Azis / XRPL2 / 23";
    System.out.println("Identitas: "+ identitas);
    
    System.out.print("\nSaran Resep dari Bahan Milik Anda\n");
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Bahan pertama: ");
    System.out.println("1. Pisang");
    System.out.println("2. Telur");
    
    System.out.println("Masukan no pilihan Anda :");    
    int bahan1 = scanner.nextInt();
    
    if(bahan1 == 1 || bahan1 == 2)
    {
        System.out.println("Bahan kedua: ");
        if(bahan1 == 1) {
            System.out.println("1. Susu ");
            System.out.println("2. Minyak Goreng");
            System.out.println("3. Tidak ada");
        }else{
            System.out.println("1. Minyak Goreng");
            System.out.println("2. Roti");
            System.out.println("3. Tidak ada");
        }
        }else{
        
        System.out.println("Mohon maaf, Pilihan tidak ditemukan, " 
                + "tidak dapat memberikan saran resep");
    }
    
    System.out.println("Masukan no pilihan Anda :");
        int bahan2 = scanner.nextInt();
        
    if(bahan2 >= 1 && bahan2 <= 3)
    {
        if(bahan1==1)
            switch(bahan2)
            {
                case 1: System.out.println(
                        "Anda dapat membuat telur mata sapi"); break;
                case 2: System.out.println(
                        "Anda dapat membuat sandwich telur"); break;
                case 3: System.out.println(
                        "Anda dapat membuat telur rebus");
            }
    }else
        System.out.println("Mohon maaf, pilihan tidak ditemukan,"
        + "tidak dapat memberikan saran resep");
    
    }
    }   
    

