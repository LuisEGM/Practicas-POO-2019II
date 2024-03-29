package pruebas;

import java.util.ArrayList;
import java.util.Scanner;
import tragaperras.Fruta;
import tragaperras.Maquina;
import tragaperras.Premio;

public class PruebaTragaPerras {

    public static void main(String[] args) {
        
        //declarar y construir dos premios
        Premio premio1 = new Premio(10,Fruta.FRESA,Fruta.FRESA,Fruta.FRESA);
        Premio premio2 = new Premio(10,Fruta.SANDIA,Fruta.SANDIA,Fruta.SANDIA);
        Premio premio3 = new Premio(10,Fruta.MELOCOTON,Fruta.MELOCOTON,Fruta.MELOCOTON);
        Premio premio4 = new Premio(10,Fruta.PERA,Fruta.PERA,Fruta.PERA);
        Premio premio5 = new Premio(10,Fruta.PLATANO,Fruta.PLATANO,Fruta.PLATANO);
        
        /* 2. Crea una máquina con un tamaño de combinación de 3 frutas,
        * un precio por partida de 0,5 euros
        * y los dos premios declarados previamente
        */
        Maquina maquina = new Maquina(3,0.5,premio1,premio2,premio3,premio4,premio5);
        
        /* 3. Solicita al usuario que introduzca por teclado la cantidad
        * de crédito para jugar.
        */
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el credito: ");
        double credito = entrada.nextDouble();
        
        entrada.nextLine();
        
        maquina.IncrementarCredito(credito);
        
        while(maquina.getCredito() > 0){
            
            ArrayList<Fruta> combinacion = maquina.jugar();
            
            System.out.println("Combinación »»» "+combinacion.toString() + " ««« - Credito € "+ maquina.getCredito());
            
            System.out.println("Pulse Intro para volver a jugar");
            entrada.nextLine(); 
            
        }
        entrada.close();
        
    }
    
}
