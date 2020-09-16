
package trabajopractico02;

public class PruebaPerro {

    public static void main(String[] args) {
        Perro pichicho= new Perro();
        pichicho.setColorPelaje("marron");
        pichicho.setNombre("Pichicho");
        pichicho.setEdad(2);
        System.out.println(pichicho.getColorPelaje());
        System.out.println(pichicho.getNombre());
        System.out.println(pichicho.getEdad());
        
        System.out.println(pichicho.ladrar());
        
    }
    
}
