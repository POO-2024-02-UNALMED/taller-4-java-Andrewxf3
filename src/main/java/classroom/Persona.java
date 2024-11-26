package classroom;

public class Persona {

    final long cedula;
    String nombre;
    static int totalPersonas;

    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    public Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    public Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    public Persona(String nombre) {
        if (nombre.equals("Alejandro")) {
            this.cedula = 1; // Cédula fija para "Alejandro".
        } else {
            this.cedula = totalPersonas;
        }
        this.nombre = nombre;
        totalPersonas++;
    }

    public Persona() {
        this.cedula = 0;
        this.nombre = "Sin nombre";
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

