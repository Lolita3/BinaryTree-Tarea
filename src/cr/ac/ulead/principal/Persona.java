package cr.ac.ulead.principal;

import java.io.IOException;
import java.time.LocalDate;

public class Persona {
    private String nombre =null;
    private String apellido = null;
    private LocalDate fechaNac = null;
    private String cedula = null;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void cargarDatos() throws IOException {

    }


}
