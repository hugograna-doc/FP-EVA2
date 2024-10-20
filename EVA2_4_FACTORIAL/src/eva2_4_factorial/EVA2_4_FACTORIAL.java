/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_4_factorial;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_4_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int base,expo,a, resu;
        
        Scanner captu = new Scanner(System.in);
             System.out.println("Cual es tu numero base?");
             base =captu.nextInt();
             captu.nextLine();
            expo = base;
            a = base;
             for(int i = 1; i <= expo; i++){
                 resu = (base) * i--;}
             
    }
    }
