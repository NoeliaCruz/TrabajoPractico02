package trabajopractico02;

public class Perro {

    private String nombre;
    private String colorPelaje;
    private int edad;

    public Perro() {
        this.nombre = "";
        this.colorPelaje = "";
        this.edad = 0;
    }

    //un constructor recibe un atributo como parametro
    public Perro(String nombre) {
        this();
        this.nombre = nombre;

    }

    public Perro(String nombre, String color) {
        this(nombre);
        this.colorPelaje = color;
    }

    public Perro(String nombre, String color, int edad) {
        this(nombre, color);
        this.edad = edad;
    }
    //Crear los metodos set y get para los atributos de la clase

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setColorPelaje(String color) {
        this.colorPelaje = color;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setEdad(int edad) {
        validarEdad(edad);
    }

    private void validarEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }

    }
    public int getEdad(){
        return edad;
    }

    public String ladrar() {
        return "Guau";
    }
}
