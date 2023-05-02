package enumeraciones;


public enum Continentes {
    
    //Agregamos atributos y metodos a la enumeracion
    AFRICA(53, "1.2 billones"),
    /*
    //podemos agregar mas atributos entre parentesis a los elementos 
    ejemplo: AFRICA(53, "1.2 billones", etc) 
    esto habria que agregarlo al constructor y al metodo get y 
    hacer el atributo para este nuevo atributo de los elementos
    */
    EUROPA(46,"1.1 billones"),
    ASIA(43, "1.9 billones"),
    AMERICA(34, "1.2 billones"),
    OCEANIA(14, "1.2 billones");
    
    //si vamos a agregar mas  atributos o metodos  el ultimo elemento
    //debe ir cerrado con ; en caso contrario es innecesario
    
    private final int paises; //atributo
    private final String habitantes;
    
    /*definimos un constructor para poder utilizar este argumento, en cada uno de los 
    elementos de la enumeracion
    por lo que el constructor se asociara con los elementos de la enumeracion
    */
    
    Continentes(int paises, String habitantes){
        this.paises = paises;
        this.habitantes = habitantes;
    }
    
    public int getPaises(){
        return this.paises;
    }
    
    public String getHabitantes(){
        return this.habitantes;
    }
    
}
