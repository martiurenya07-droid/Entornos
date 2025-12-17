/* Un aparcamiento público dispone de varias plantas, y cada planta tiene un número fijo
de plazas de aparcamiento.
Se desea desarrollar un programa que permita registrar el estado de ocupación de
cada plaza y obtener información útil sobre la disponibilidad del aparcamiento.
Cada plaza se representará mediante:
• 0 → Plaza libre
• 1 → Plaza ocupada */
import java.util.Scanner;
public class AparcamientoPublico {
    public static void aparcamiento (){
        //declaramos variables
        Scanner t = new Scanner (System.in);
        int [] [] aparcamiento = new int [3][5];
        int planta = 2;
        int plaza = 4;
        int estado=0;
        int ocupadosP0 =0;
        int ocupadosP1 =0;
        int ocupadosP2 =0;
        //Solicitamos al usuario el estado de cada plaza, y almacenamos si esta ocupada o no
        for (int i=0 ;i<=planta;i++){
            for (int j=0;j<=plaza;j++){
                do{
                    System.out.print("Introduce el estado: Planta: "+i+" Plaza: "+j+" :");
                    estado = t.nextInt();
                    System.out.println();
                }while(estado!=0&&estado!=1);
                //Lennamos el array dependiendo del estado
                if (estado==0){
                    aparcamiento[i][j]=0;
                }else{
                    aparcamiento[i][j]=1;
                    //rellenamos la varible ocupado dependiendo de la planta
                    if (i==0){
                        ocupadosP0++;
                    }else if (i==1){
                        ocupadosP1++;
                    }else{
                        ocupadosP2++;
                    }
                }
            }
        }
        //Mediante una resta descubrimos los libres
        int libresP0 = 5 - ocupadosP0;
        int libresP1 = 5 - ocupadosP1;
        int libresP2 = 5 - ocupadosP2;
        
        //calculamos el total de plazas libres y el total de plazas ocupadas
        int libresT = libresP0+libresP1+libresP2;
        int ocupadasT = ocupadosP0+ocupadosP1+ocupadosP2;

        //mostramos al usuario el estado de cada planta en cada plaza
        for (int i =0;i<=planta;i++){
            for(int j=0;j<=plaza;j++){
                System.out.print("Plaza: "+j+" Planta: "+i);
                if (aparcamiento[i][j]==0){
                    System.out.println("Esta libre");
                }else{
                    System.out.print("Esta ocupada");
                }
            }
            System.out.println();
        }

        //mostramos el numero total de plaza ocupadas y plazas libres en cada planta
        System.out.print("Planta 0: Ocupadas:"+ocupadosP0+" Libres: "+libresP0);
        System.out.println();
        System.out.print("Planta 1: Ocupadas:"+ocupadosP1+" Libres: "+libresP1);
        System.out.println();
        System.out.print("Planta 2: Ocupadas:"+ocupadosP2+" Libres: "+libresP2);
        System.out.println();

        //Mostramos las plazas totales ocupadas y plazas totales libres

        System.out.print("Plazas totales ocupadas: " +ocupadasT);
        System.out.println();
        System.out.print("Plazas libres totales: "+libresT);
        System.out.println();

}

    public static void main (String [] args){
        aparcamiento();
    }
}