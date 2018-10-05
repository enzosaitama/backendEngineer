/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilanganprima;

import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class BilanganPrima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("masukkan angka ; ");
        Scanner input = new Scanner(System.in);
        int angka = input.nextByte();
        
        for (int i=2; i<=angka; i++){
            boolean prima = true;
            
            for (int j=2; j<i; j++) {
                if (i%j==0) {
                    prima = false;
                    break;
                }
            }
            
            if (prima==true){
                System.out.print(i+ ", ");
            }
        }
    }
    
}
