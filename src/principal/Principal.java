package principal;

import service.ConsumoApi;
import service.Convertirmoneda;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        ConsumoApi consulta = new ConsumoApi();
        int opcion = 0;

        String menu = "********************************************\n"
                + "Sea bienvenido/a al Conversor de Monedas =]\n\n"
                + "\t1) Dólar =>> Peso argentino\n"
                + "\t2) Peso argentino =>> Dólar\n"
                + "\t3) Dólar =>> Real brasileño\n"
                + "\t4) Real brasileño =>> Dólar\n"
                + "\t5) Dólar =>> Peso colombiano\n"
                + "\t6) Peso colombiano =>> Dólar\n"
                + "\t7) Salir\n"
                + "Elija una opcion valida\n"
                + "********************************************\n";


        while(opcion != 7){
            System.out.println(menu);
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion){
                case 1:
                    Convertirmoneda.convertir("USD","ARS", consulta, lectura);
                    break;
                case 2:
                    Convertirmoneda.convertir("ARS","USD", consulta, lectura);
                    break;
                case 3:
                    Convertirmoneda.convertir("USD","BRL", consulta, lectura);
                    break;
                case 4:
                    Convertirmoneda.convertir("BRL","COP", consulta, lectura);
                    break;
                case 5:
                    Convertirmoneda.convertir("USD","COP", consulta, lectura);
                    break;
                case 6:
                    Convertirmoneda.convertir("COP","USD", consulta, lectura);
                    break;
                case 7:
                    System.out.println("Gracias por su preferencia. Saliendo ...");
                    break;
                default:
                    System.out.println("Opcion no valida, intentelo de nuevo");
                    break;
            }
        }
    }
}
