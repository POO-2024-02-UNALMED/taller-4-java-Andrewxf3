package classroom;

public class Persona {

    private final long cedula;
    private String nombre;
    public static int totalPersonas = 0;

    public Persona() {
        this.cedula = totalPersonas++;
        this.nombre = "Sin nombre";
    }

    public Persona(String nombre) {
        this.cedula = totalPersonas++;
        this.nombre = nombre;
    }

    public Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    public Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
