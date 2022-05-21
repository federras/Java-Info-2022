package COMPLEMENTARIOS2;

//definimos la clase Empleado, con todos sus métodos.
public class Empleado {

    private String nombre;
    private int dni;
    private float horasTrabajadas;
    private float valorPorHora;

    public Empleado(String nombre, int dni, float horasTrabajadas, float valorPorHora) {
        this.nombre = nombre;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return this.dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public float getHorasTrabajadas() {
        return this.horasTrabajadas;
    }

    public void setHorasTrabajadas(float horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public float getValorPorHora() {
        return this.valorPorHora;
    }

    public void setValorPorHora(float valorPorHora) {
        this.valorPorHora = valorPorHora;
    }  
}
