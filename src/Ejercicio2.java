/**
 * Ejercicio 2: (1) Defina una referencia a un objeto e inicializela a null.
 * Trate de invocar un método a través de esta referencia.
 * Ahora rodee el código con una clausula try-catch para probar la nueva excepción.
 */

/**
 * Created by 46989414t on 02/10/15.
 */
class ExcetionNull EXENDS{

public class Ejercicio2 {
    String s = "ejerciciio 2";

    String getString() {
        resturn s;
    }

    public static void main(String[] args) {

        ExcetionNull en = null;
        try{
            en.getString();

        }catch (Exception e){
            System.out.print("Se produjo una excepcion"+e.getMessage());
        }
    }
}

}
