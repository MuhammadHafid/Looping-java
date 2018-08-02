
package j06;
import java.util.Scanner;
public class KalkulatorSederhana { 
   public static void main(String[] args){
       
       Scanner bil = new Scanner(System.in);
       double x,y,hasil;
       String opr;
       
       System.out.println("^^Kalkulator Sederhana^^");
       System.out.print("Bil1: ");
       x = bil.nextDouble();
       System.out.print("Bil2: ");
       y = bil.nextDouble();
       System.out.print("operator: ");
       opr = bil.next();
       
       if ("+".equals(opr))
       {
           hasil = x + y;
           System.out.print(hasil);               
       }
       else if ("-".equals(opr))
        {
            hasil = x - y;
            System.out.print(hasil);
        }
       else if ("x".equals(opr))
       {
               hasil = x * y;
               System.out.println(hasil);
       }
       else if (":".equals(opr))
       {
           hasil = x / y;
           System.out.println(hasil);
       }
       else if ("&".equals(opr))
       {
           hasil = x % y;
           System.out.println(hasil);
       }
       else { 
           System.out.println("Operator tidak valid");
       }
       }
   }
