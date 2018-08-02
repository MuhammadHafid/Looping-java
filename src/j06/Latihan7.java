
package j06;
import java.util.Scanner;
public class Latihan7 { 
    public static void main (String[] args){
        Scanner masukan = new Scanner(System.in);
        int nilai;
        System.out.print("Masukan nilai akhir PRO :");
        nilai = masukan.nextInt();
        if (nilai < 70)
        System.out.println("Siswa tidak lulus");
        if (nilai > 70)
        System.out.println("Siswa lulus");
    }
}
