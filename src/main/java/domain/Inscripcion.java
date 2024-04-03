package domain;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materiasAInscribir;

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materiasAInscribir = new ArrayList<>();
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List<Materia> getMateriasAInscribir() {
        return materiasAInscribir;
    }
}
