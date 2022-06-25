package ComplementariosLevel3;

import java.time.LocalDate;
import java.time.Period;

public class Alumno {
    private String apellido;
    private String nombre;
    private LocalDate fechaNac;

    Alumno(String apellido, String nombre, LocalDate fechaNac) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int obtenerEdad() {
        Period edad = Period.between(this.fechaNac, LocalDate.now());
        return edad.getYears();
    }

    @Override
    public String toString() {
        return (getApellido() +" "+ getNombre() +" - Fecha Nacimiento: "+ getFechaNac() +" - Edad: "+ obtenerEdad()+"\n");
    }
    
}