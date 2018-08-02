
package j07;
import java.util.Scanner;
public class contoh6 {
    public static void main(String[] args)
    {
        Scanner baca = new Scanner(System.in);
        
        System.out.print("Masukan bilangan I: ");
        int bil1 = baca.nextInt();
        
        System.out.print("Masukan bilangan II: ");
        int bil2 = baca.nextInt();
        
        int max = (bil1 > bil2) ? bil1 : bil2;
        
        System.out.print("Bilangan terbesar adalah : " + max);
    }
    
}
