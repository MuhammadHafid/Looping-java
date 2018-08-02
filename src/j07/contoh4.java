
package j07;
import java.util.Scanner;
public class contoh4 {
    public static void main(String[] args)
    {
        Scanner baca = new Scanner(System.in);
        double bil1, bil2, hasil;
        char opr;
        
        System.out.println("Masukan bilangan I: ");
        bil1 = baca.nextDouble();
        
        System.out.println("Masukan bilangan II: ");
        bil2 = baca.nextDouble();
        
        System.out.println("Masukan operator: ");
        opr = baca.next().charAt(0);
        
        switch(opr)
        {
            case  '+':
                hasil = bil1 + bil2;
                System.out.println(hasil);
                break;
            case '-':
                hasil = bil1 - bil2;
                System.out.println(hasil);
               break;
           
            case '*' :
                hasil = bil1 * bil2;
                System.out.println(hasil);
           break;
            case '/' :
                hasil = bil1 / bil2;
                System.out.println(hasil);
                 break;
            case '%' :
                hasil = bil1 % bil2;
                System.out.println(hasil);
               break;
            default :
                System.out.println("Operator tidak valid");
            
                
                
        }
    }
    
    
}
