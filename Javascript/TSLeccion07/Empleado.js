class Empleado extends Persona {

    static contadorEmpleados = 0;

    //si queremos enlazarlo con la clase padre Persona, con los atributos que tiene esta clase en lo que es la herencia
    //debemos poner los mismos parametros en el mismo orden, y ya luego agregar extras si se desea
    constructor(nombre, apellido, edad, sueldo){
        //lo primero que debemos hacer es hacer el llamado al constructor de la clase padre Persona (mediante super),
        //luego pasarle los argumentos que pide este constructor y luego ya determinar el sueldo aparte, ejemplo:
        super(nombre, apellido, edad);
        this._idEmpleado = ++Empleado.contadorEmpleados;
        this._sueldo = sueldo;

    }
    
    get idEmpleado(){
        return this._idEmpleado;
    }

    get sueldo(){
        return this._sueldo;
    }

    set sueldo(sueldo){
        this._sueldo = sueldo;
    }

    toString(){
        return `
        ${super.toString()} 
        ${this._idEmpleado} 
        ${this._sueldo}`;
    }
    /*
    Aclaracion template toString
    Este se puede trabajar con multiples lineas como estamos viendo, esto es justamente para concatenar cadenas, 
    para eso se utiliza
    */

}