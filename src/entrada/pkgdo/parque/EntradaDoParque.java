
package entrada.pkgdo.parque;

import java.util.Scanner;


public class EntradaDoParque {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         
    float altura, valor;
    System.out.println("Qual a sua altura? ");
         altura = entrada.nextInt();
   
         if(altura>=120){ 
               System.out.println("voce pode ir a nossa montanha russa!");
         }
         else  
             System.out.println("Voce não pode ir a montanha russa!");
      
    System.out.println("Quanto voce possui em dinheiro? ");
         valor = entrada.nextInt();
         
         if(valor>=35){    
               System.out.println("Pode entrar, seja bem vindo ao Parque!");
         }
         else  
             System.out.println("Mas infelizmento não podera entrar em nosso Parque!");
    }
    
}
