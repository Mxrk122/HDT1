import java.util.Scanner;
class MenuRadio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        RadioImplementado r = new RadioImplementado();

        int opcion = 0;
        int choice = 0;
        boolean asignarOption;
        boolean emisoraOption;

        while (opcion != 7){
            System.out.println("\n\nBienvenido a la radio 949");
            System.out.println("1. Encender radio");
            System.out.println("2. Apagar radio");
            System.out.println("3. Cambiar de AM a FM y de FM a AM");
            System.out.println("4. Avanzar emisora");
            System.out.println("5. Asignar emisora a boton");
            System.out.println("6. Elejir boton de emisora");
            System.out.println("7. Salir\n");

            opcion = scan.nextInt();

            if (opcion == 1){
                r.encender();
            } else if (opcion == 2){
                r.apagar();
            } else if (opcion == 3){
                r.frecuencia();
            } else if (opcion == 4){
                r.incrementar();
            } else if (opcion == 5){
                asignarOption = true;
                choice =0;
                while(asignarOption){
                    if(choice <= 12 && choice > 0){
                        asignarOption = false;
                    }else{
                        System.out.println("Ingrese un boton de 1 a 12 para guardar su frecuencia");
                        choice  = scan.nextInt();
                    }
                }
                r.asignar(choice);

                //r.asignar(choice);
            } else if (opcion == 6){
                emisoraOption = true;
                choice =0;
                while(emisoraOption){
                    if(choice <= 12 && choice > 0){
                        emisoraOption = false;
                    }else{
                        System.out.println("Ingrese un boton de 1 a 12 para ir a esa frecuencia guardada.");
                        choice  = scan.nextInt();
                    }
                }
                r.emisora(choice);
            }else if (opcion == 7){
                //Salir
                System.out.println("Adios amigo");
            }
        }
    }
}