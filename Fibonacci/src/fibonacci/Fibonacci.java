/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner show = new Scanner(System.in);
		System.out.print("Masukan jumlah deret Fibonaccci : ");
		int n = show.nextInt();
		long f[] = new long[n];
		
                if(n==1){
                    System.out.print(" 0 ");
                }
                else {
                        f[0] = 0;
                        f[1] = 1;

                        for(int i = 2; i < n; i++) {
                                f[i] = f[i-1] + f[i-2];
                        }

                        for (int i = 0; i < n; i++) {
                                System.out.print(f[i] +  " ");
                        }
                }
    }
    
}
