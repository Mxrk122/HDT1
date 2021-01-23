

public class RadioImplementado implements RadioGeneral{
    public boolean estadoRadio = false; //True = encendido False = apagado
    public int frecuenciaAm = 530;
    public float frecuenciaFm = 87.9f;
    public boolean frecuenciaType = true; //True am y False =fm


    //Variables para asignar radios
    private int indiceAm=0;
    private int indiceFm=0;
    int botonesAm[] = new int[12];
    float botonesFm[] = new float[12];




    public boolean isON(){
        return estadoRadio;
    }


    public void encender(){
        estadoRadio = true;
        //return estadoRadio
        System.out.println("Encendiste la radio");
    }

    public void apagar(){
        estadoRadio = false;
        //return estadoRadio;
        System.out.println("Apagaste la radio");
    }

    public void incrementar(){
        //boolean estado
        if(isON()){
            if(frecuenciaType){
                //Esta en am
                if (frecuenciaAm < 1610){
                    frecuenciaAm = frecuenciaAm + 10;

                    System.out.println("Estas en la frecuencia " + frecuenciaAm);
                } else {
                    frecuenciaAm = 530;

                    System.out.println("Estas en la frecuencia " + frecuenciaAm);
                }

            }else {//Esta en fm
                if(frecuenciaFm <= 107.9f){
                    frecuenciaFm = frecuenciaFm + 0.2f;
                    System.out.println("Estas en la frecuencia " + frecuenciaFm);

                } else{
                    frecuenciaFm = 87.9f;
                    System.out.println("Estas en la frecuencia " + frecuenciaFm);
                }
            }
        }
        else {
            System.out.println("La radio está apagada");
        }

    }


    public boolean asignar(int num) {
        if(isON()){
            if(frecuenciaType){ //Si es AM
                indiceAm = num-1;
                botonesAm[indiceAm] = frecuenciaAm;
                return true;
            }else{ //Si es Fm
                indiceFm = num-1;
                botonesFm[indiceFm] = frecuenciaFm;
                return true;
            }
        }else{ //Esta apagado el radio
            System.out.println("El radio esta apagado");
            return false;
        }
    }


    public boolean emisora(int num){
        if(isON()){
            if(frecuenciaType){ //Si es Am
                indiceAm = num-1;
                if(botonesAm[indiceAm] == 0){
                    System.out.println("Ese boton no tiene guardado ninguna frecuencia");
                    return true;
                }else{
                    frecuenciaAm = botonesAm[indiceAm];
                    System.out.println("Cambiando a frecuencia " + frecuenciaAm);
                    return true;
                }

            }else { //Si es Fm
                indiceFm = num - 1;
                if(botonesFm[indiceFm] == 0.0){
                    System.out.println("Ese boton no tiene guardado ninguna frecuencia");
                    return true;
                }else{
                    frecuenciaFm = botonesFm[indiceFm];
                    System.out.println("Cambiando a frecuencia " + frecuenciaFm);
                    return true;
                }
            }
        }else{ //Esta apagado
            System.out.println("El radio esta apagado");
            return false;
        }
    }

    public void frecuencia(){
        if(isON()){
            if(frecuenciaType){
                frecuenciaType = false;
                System.out.println("Ha cambiando a FM");
            } else {
                frecuenciaType =true;
                System.out.println("Ha cambiado a AM");
            }
        } else {
            System.out.println("La radio está apagada");
        }
    }
}