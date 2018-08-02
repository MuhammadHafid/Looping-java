
package j07;
import java.util.Scanner;
public class contoh5 {
    public static void main(String[] args)
    {
        char huruf;
        Scanner baca = new Scanner(System.in);
        
        System.out.println("Masukan huruf sembarang(A-Z)");
        huruf = baca.next().charAt(0);
        
        switch(huruf)
        {
            case'a':
            case 'i':
            case 'u':
            case 'e':
            case 'o':    
            case 'A':
            case 'I':
            case 'U':
            case 'E':
            case 'O':    
                System.out.println("Huruf vokal");
                break;
            default:
                System.out.print("Huruf konsonan");
                break;   
        }
        
    }
}
         
    
