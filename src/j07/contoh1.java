/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j07;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class contoh1 {
    public static void main(String[] args)
    {
        int x;
        System.out.print("Masukkan bilangan sembarang: ");
        
        Scanner baca = new Scanner(System.in);
        x = baca.nextInt();
        
        if(x % 2 == 1)
        {
            System.out.println("Bilangan ganjil");
        }
        else
        {
            System.out.println("Bilangan genap");
        }
        
    }
}
