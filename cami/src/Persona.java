public class Persona {

    private String nombre;//variable de texto
    private String apellido;
    private int dni;//variable entera
    private Persona cami; //variable de persona

    private static int cantidad = 0;

    private Persona(String nombre ,String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = cantidad;
        cantidad = cantidad + 1;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", cami=" + cami +
                '}';
    }

    public void imprimirNombreCompleto(){
        System.out.println(this.nombre + " " + this.apellido);
    }

    public int obtenerDni(){
        return this.dni;
    }


    public static Persona creaUnaPersonaConCami(String nombre , String apellido){
        nombre = nombre.toUpperCase();
        Persona personaConCami = new Persona(nombre,apellido);
        personaConCami.cami = new Persona("cami" + cantidad,"perez");
        return personaConCami;
    }

    public Persona tenerHijo(String nombreDelJHijo){
        return creaUnaPersonaConCami(nombreDelJHijo,this.apellido);
    }
}