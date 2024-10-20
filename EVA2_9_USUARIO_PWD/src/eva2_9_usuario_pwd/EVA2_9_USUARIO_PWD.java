/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_9_usuario_pwd;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_9_USUARIO_PWD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String usu, contra;
        
       Scanner captu = new Scanner(System.in); 
        do{
       System.out.println("Usuario");
        usu = captu.nextLine();
        System.out.println("Password");
        contra= captu.nextLine();
        
        }while(!(usu.equals("admin") && contra.equals("1234"))); // ! es igual a la negacion
        System.out.println("BIENVENIDO!!!");
            
        
          
        
    }  
}
