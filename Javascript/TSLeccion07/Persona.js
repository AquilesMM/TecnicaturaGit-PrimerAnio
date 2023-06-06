class Persona{
    static contadorPersonas = 0;

    //Los otros atributos los agregaremos dentro del constructor

    constructor(nombre, apellido, edad){
        //propiedades de instancia
        this._idPersona = ++Persona.contadorPersonas; //no olvidar acceder a atributo static por medio del nombre de clase
        this._nombre = nombre;
        this._apellido = apellido;
        this._edad = edad;

        //a diferencia de java las propiedades de instancia se pueden crear en el mismo constructor
        //y se reconocen por la palabbra clave this.
        /*
        En JavaScript, las propiedades de instancia son variables que se asocian 
        con objetos específicos creados a partir de una clase. Estas propiedades son únicas para 
        cada instancia del objeto y pueden contener valores diferentes en cada instancia.

        Cuando creas una clase en JavaScript, puedes definir propiedades de instancia utilizando el constructor 
        de la clase. El constructor es un método especial que se llama automáticamente cuando se crea 
        un nuevo objeto a partir de la clase. Puedes usar el constructor para asignar valores iniciales 
        a las propiedades de instancia.
        */
    }

    get idPersona(){
        return this._idPersona;
    }
    get nombre(){
        return this._nombre;
    }
    set nombre(nombre){
        this._nombre = nombre;
    }

    get apellido(){
        return this._apellido;
    }
    set apellido(apellido){
        this._apellido = apellido;
    }

    get edad(){
        return this._edad;
    }
    set edad(edad){
        this._edad = edad;
    }

    toString(){
        return `
        ${this._idPersona} 
        ${this._nombre} 
        ${this._apellido} 
        ${this._edad}`;
        //en este caso el id nos recomienda hacer esta conversion cuando es muy largo el toString, nos permite espaciarlo con enter
        //es mas limpio de codigo, pero hay que tener cuidado, porque al utilizar el template para convertir a string (asi se denomina)
        //se vera tal cual lo estamos viendo en el toString, de la misma forma. vertical de la manera que lo estamos viendo
    }



}