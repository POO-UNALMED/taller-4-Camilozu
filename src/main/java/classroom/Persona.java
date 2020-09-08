package classroom;

public class Persona {

    long cedula;
    String nombre;
    static int totalPersonas;
    
    static {
        totalPersonas = 0;
        //cedula = 3;
    }
    
    Persona() {
    	
    }

    Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    Persona(long cedula) {
        this.cedula = cedula;
     ;
        totalPersonas++;
    }

    Persona(String nombre) {
        this.nombre = nombre;
        this.cedula = 1;
        totalPersonas++;
    }
    
    long getCedula() {
        return cedula;
    }

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
