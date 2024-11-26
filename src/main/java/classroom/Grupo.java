package classroom;

public class Grupo {

    public Persona[] estudiantes;
    public Persona profesor;
    public Asignatura asignatura;
    public int codigo;
    public String horario;

    public Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
    }

    public Grupo(int cantidadEstudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this(new Persona[cantidadEstudiantes], profesor, asignatura, codigo, horario);
        for (int i = 0; i < cantidadEstudiantes; i++) {
            this.estudiantes[i] = new Persona();
        }
    }
}
