import java.util.Scanner;

public class CalculadoraUTN {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        while(true){ //ciclo infinito.
            //la unica forma de terminar un ciclo infinito es con break
            System.out.println("****** Aplicacion Caluladora ******");
            mostrarMenu();

            try{
                var operacion = Integer.parseInt(entrada.nextLine());
                if(operacion >= 1 && operacion<=4){

                    ejecutarOperacion(operacion,entrada);

                }
                else if (operacion == 5){
                    System.out.println("Hasta pronto...");
                    break;
                }
                else{
                    System.out.println("Opcion erronea: "+ operacion);
                } //Fin if

                //Imprimimos un salto de linea antes de repetir el menu
                System.out.println();
            }catch(Exception e){
                System.out.println("Ocurrio un error: "+e.getMessage());
                System.out.println();
            }


        }//Fin while

    }//Fin main

    private static void mostrarMenu(){
        //Mostramos el menu
        System.out.println("""
                1.  Suma
                2. Resta
                3. Multiplicacion
                4. Division
                5. Salir
                """);
        System.out.print("¿Operacion a realiar? ");

    }//Fin metodo mostrarMenu

    private static void ejecutarOperacion(int operacion, Scanner entrada){
        //el metodo debe ser static para poder ejecutarse en el main
        System.out.print("Dijite el valor para el operando1: ");
        var operando1 = Double.parseDouble(entrada.nextLine());
        System.out.print("Dijite el valor para el operando2: ");
        var operando2 = Double.parseDouble(entrada.nextLine());
        double resultado;
        switch(operacion){
            case 1 -> {  //suma
                resultado = operando1 + operando2;
                System.out.println("resultado = " + resultado);
            }
            case 2 -> { //resta
                resultado = operando1 - operando2;
                System.out.println("Resultado de la resta: "+resultado);
            }
            case 3 -> { //multiplicacion
                resultado = operando1 * operando2;
                System.out.println("Resultado de la multiplicacion: "+ resultado);
            }
            case 4 ->{//Division
                resultado = operando1 / operando2;
                System.out.println("Resultado de la division: "+resultado);
            }
            default -> System.out.println("Opcion erronea");
        }//Fin swich
    }//Fin metodo ejecutarOperacion

}//Fin clase
