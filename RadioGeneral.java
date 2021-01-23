public interface RadioGeneral{


    boolean isON();
    //Sirve para regresar un true or false indicando si la radio esta encendida o no, y en caso que no esta encendido mandar el flase al menu del main y no permitir realizar ninguna de las otras opciones hasta que se encienda.

    void encender();
    //Poner el boolean de su radio como true

    void apagar();
    //Poner el boolean de su radio como false

    void incrementar();
    //Aumentar la emisora, pero verificar primero el tipo de emisora si es am o fm

    boolean asignar(int num);
    //Guarda la frecuencia del usuario a un boton de 1-12 en un array.

    boolean emisora(int num);
    //Cambia la frecuencia del usuario a una de las guardadas en los diferentes botones de 1-12 que estan en un array.

    void frecuencia();
    //Para cambier el am a fm a am

}