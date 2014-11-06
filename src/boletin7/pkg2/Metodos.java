
package boletin7.pkg2;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Metodos {
    private short numero1,numero2;
    
    public short pedirNumero1(){
        Scanner dato=new Scanner(System.in);
        System.out.println("dame numero 1");
        numero1=dato.nextShort();
     return numero1;
     
        
        
    }
    public short pedirNumero2(){
        Scanner dato=new Scanner (System.in);
        System.out.println("dame numero 2");
    numero2=dato.nextShort();
    return numero2;}
    
   public void condicionalResta(short numero1, short numero2){
   if (numero1>=numero2)
           System.out.println("a resta e" +(numero1-numero2) +"e a suma é"+(numero1+numero2));
    
       else System.out.println("a suma é " +(numero1+numero2));
                  }
    
    
}
