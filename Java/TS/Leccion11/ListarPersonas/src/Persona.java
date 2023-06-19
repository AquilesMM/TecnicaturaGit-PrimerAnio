public class Persona {
    private int id;
    private String nombre;
    private String tel;
    private String email;
    private static int numeroPersonas = 0;

    //Constructor vacio

    public Persona(){
        this.id = ++Persona.numeroPersonas;
        //Al usar este constructor, el objeto tendria su id con valor pero el resto de valores en null
    }

    //Constructor con parametros (mas de un constructor == sobrecarga constructores)
    public Persona(String nombre, String tel, String email){
        //Por default el compilador al usar este constructor, llamara al inicio al constructor vacio
        //aun asi lo haremos de manera manual en tuempo de desarrollo
        this();
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmai() {
        return email;
    }

    public void setEmai(String emai) {
        this.email = emai;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tel='" + tel + '\'' +
                ", emai='" + email + '\'' +
                '}'; //para ver espacio de memoria agregamos: supepr.toString();
                    //ya que es el toString de original que aqui sobreescribimos
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan Perez", "26572564 ", "jpere@gmail.com");
        System.out.println(persona1);

    }
}


