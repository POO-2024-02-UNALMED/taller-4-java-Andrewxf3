package classroom;

public class Asignatura {

    public String nombre;
    public int codigoInterno;
    public int codigoExterno;
    public Tipo tipo;

    public Asignatura() {
        this("Sin nombre", Tipo.FUNDAMENTACION);
    }

    public Asignatura(String nombre, Tipo tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.codigoInterno = 0; 
        this.codigoExterno = 0;
    }

    public Asignatura(int codigoExterno, Tipo tipo) {
        this("Sin nombre", 0, codigoExterno, tipo); 
    }

    public Asignatura(String nombre, int codigoInterno, int codigoExterno, Tipo tipo) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }
}
