//import java.lang.Exceptions;
/**Ejercicio 1: (2) Cree una clase con un método main() que genere un
 * objeto de la clase Exception dentro de un bloque try. Proporcione
 * al constructor de Exception un argumento String. Capture la excepción
 * dentro de una cláusula catch e imprima el argumento String. Añada una
 * clausula finally e imprima un mensaje para demostrar que pasó por allí.
 */
/**
 * Created by 46989414t on 02/10/15.
 */
public class Exepciones {
    public static void main(String[] args) {

            try {
                //Exception exception = new Exception();

                throw new Exception("Exception ejercicio 1");


            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.print(("ha ocurrido una excepcion"));
            }
        }
    }
