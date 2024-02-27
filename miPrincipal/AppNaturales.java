package miPrincipal;

import java.util.Scanner;

public class AppNaturales{
            
            public static void menu(){
            System.out.println();
            System.out.println("====================");
            System.out.println("  Numeros naturales ");
            System.out.println("====================");
            Scanner scaner = new Scanner(System.in);
            System.out.println("Proporciona numero");
            int n=scaner.nextInt();
            System.out.println("Vercion iterativa");
            muestraNaturalesIte(n);
            System.out.println("Vercion recursiva");
            muestraNaturalesRec(n);

    }
    public static void muestraNaturalesIte(int n){
            System.out.println("");
            for (int i=0;i<=n;i++){
             System.out.print(i+" ");
        
            }
            System.out.println("");

    }
    public static void muestraNaturalesRec(int n){
                                            //Se imprime en orden descendente
            if(n>0)
                muestraNaturalesRec(n-1);
            System.out.print(n+" ");
              System.out.println();
            
           
    }

}