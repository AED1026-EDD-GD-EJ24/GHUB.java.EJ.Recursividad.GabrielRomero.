package miPrincipal;
public class AppLadrillos{

    public static void menu(){
        System.out.println("Vercion iterativa");
        dibujar_pared_ite(10);
        System.out.println("Vercion recursiva");
        dibujar_pared_rec(10);
    }
        public static void dibujar_pared_ite(int n){
            for(int i=10;i>0;i--){
                System.out.println("xxxxxxxxxxxxxx");
    
            }        

        }
        public static void dibujar_pared_rec(int n){
            if(n>0)
            dibujar_pared_rec(n-1);
        
            System.out.println("xxxxxxxxxxxxxx");
            

        }
       

    }





