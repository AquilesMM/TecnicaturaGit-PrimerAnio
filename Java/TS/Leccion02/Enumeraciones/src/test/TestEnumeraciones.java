package test;
import enumeraciones.Continentes;
import enumeraciones.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        //System.out.println("Dia 1"+Dias.LUNES);
        
        //indicarDiaSemana(Dias.LUNES);
        //Las enumeracoes se tratan como cadenas
        //PERO NO SE DEBEN UTILIZAR COMILLAS, SE ACCEDE A TRAVEZ DEL OPERADOR DE PUNTO
        // para pasar el valor debemos hacerlo
        //a travez del enum, no sirve solo poner la cadena
        //ademas que en los parametros asignamos que el valor debe venir de la
        //clase(enum) Dias, pasar una cadena no cumple con los requisitos
        
        
        //TEST CONTINENTES
        
        System.out.println("Continentes No 4:"+ Continentes.AMERICA); //Accedimos al elemento
        //Accedemos a los atributos de los elementos
        
        //AFRICA
        System.out.println("No de paises en el 1er continente: "
                +Continentes.AFRICA.getPaises());
        System.out.println("No de habitantes en el 1er continentes: "+
                Continentes.AFRICA.getHabitantes());
        
        //EUROPA
        System.out.println("No de paises en el 2do continente: "
                +Continentes.EUROPA.getPaises());
        System.out.println("No de habitantes en el 2do continentes: "+
                Continentes.EUROPA.getHabitantes());
        
        //ASIA
        System.out.println("No de paises en el 3er continente: "
                +Continentes.ASIA.getPaises());
        System.out.println("No de habitantes en el 3er continentes: "+
                Continentes.ASIA.getHabitantes());
        
        //AMERICA
        System.out.println("No de paises en el 4to continente: "
                +Continentes.AMERICA.getPaises());
        System.out.println("No de habitantes en el 4to continentes: "+
                Continentes.AMERICA.getHabitantes());
        
        //OCEANIA
        System.out.println("No de paises en el 5to continente: "
                +Continentes.OCEANIA.getPaises());
        System.out.println("No de habitantes en el 5to continentes: "+
                Continentes.OCEANIA.getHabitantes());
    
    
    
    }
    
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES -> System.out.println("Primer dia de la semana");
            case MARTES -> System.out.println("Segundo dia de la semana");
            case MIERCOLES -> System.out.println("Tercer dia de la semana");
            case JUEVES -> System.out.println("Cuarto dia de la semana");
            case VIERNES -> System.out.println("Quinto dia de la semana");
            case SABADO -> System.out.println("Sexto dia de la semana");
            case DOMINGO -> System.out.println("Septimo dia de la semana");
            default -> System.out.println("No ingreso un dia valido");
        }
    }
    
}
