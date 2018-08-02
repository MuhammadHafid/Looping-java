
package j07;
import java.util.Scanner;
public class contoh2 {
    public static void main(String[] args)
    { 
        Scanner salah = new Scanner(System.in);
        
        int x;
        System.out.print("Masukkan Bilangan: ");
        x = salah.nextInt();
        
        if (x == 0)
                {
                    System.out.println("Bilangan nol");
                }
        else if (x > 0)
        {
            System.out.println("Bilangan Positif");
        }
        else if (x < 0)
        {
            System.out.println("Bilangan Negatif");
        }
    }
}
